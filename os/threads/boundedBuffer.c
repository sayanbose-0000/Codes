#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <semaphore.h>
#include <pthread.h>

#define SIZE 5

int buffer[SIZE];
int in = 0, out = 0;
int nextProduced = 0, nextConsumed = 0;

sem_t empty, full, mutex;

void* producerProcess(void* a) {
  while(1) {
    sem_wait(&empty);
    sem_wait(&mutex);

    buffer[in] = nextProduced;
    printf("Producer %d produced: %d\n", (long)a, nextProduced);
    nextProduced++;
    in = (in + 1) % SIZE;
    sleep(1);

    sem_post(&mutex);
    sem_post(&full);
  }
}

void* consumerProcess(void* a) {
  while(1) {
    sem_wait(&full);
    sem_wait(&mutex);

    nextConsumed = buffer[out];
    printf("Consumer %d consumed: %d\n", (long)a, nextConsumed);
    out = (out + 1) % SIZE;
    sleep(1);

    sem_post(&mutex);
    sem_post(&empty);
  }
}

int main() {
  sem_init(&empty, 0 , SIZE);
  sem_init(&full, 0 , 0);
  sem_init(&mutex, 0, 1);

  int p, c;
  
  printf("Enter no. of producers: ");
  scanf("%d", &p);

  printf("Enter no. of consumers: ");
  scanf("%d", &c);

  pthread_t producerThread[p], consumerThread[c];

  for (long i = 0; i < p; i++) {
    pthread_create(&producerThread[i], NULL, &producerProcess, (void*)i);
  }

  for (long i = 0; i < c; i++) {
    pthread_create(&consumerThread[i], NULL, &consumerProcess, (void*)i);
  }

  for (int i = 0; i < p; i++) {
    pthread_join(producerThread[i], NULL);
  }

  for (int i = 0; i < c; i++) {
    pthread_join(consumerThread[i], NULL);
  }

  return 0;
}