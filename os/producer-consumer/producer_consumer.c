#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>
#include <stdlib.h>

#define SIZE 5

sem_t mutex, full, empty;
int buffer[SIZE];
int in = 0, out = 0;
int nextProduced = 0, nextConsumed = 0;

void* producerProcess(void* a) {
  while (1) {
    sem_wait(&empty);
    sem_wait(&mutex);

    buffer[in] = nextProduced;
    printf("Producer %d produced: %d\n", (long)a, nextProduced);

    in = (in + 1) % SIZE;

    nextProduced++;

    sleep(1);

    sem_post(&mutex);
    sem_post(&full);
  }
}

void* consumerProcess(void* a) {
  while (1) {
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

int main() {;
  sem_init(&empty, 0, SIZE);
  sem_init(&full, 0, 0);
  sem_init(&mutex, 0, 1);

  long n;
  printf("Enter no of producer and consumer processes: ");
  scanf("%d", &n);

  pthread_t producerThread[n], consumerThread[n];

  for (long i = 0; i < n; i++) {
    pthread_create(&producerThread[i], NULL, producerProcess, (void*) i);
  }

  for (long i = 0; i < n; i++) {
    pthread_create(&consumerThread[i], NULL, consumerProcess, (void*) i);
  }

  for (long i = 0; i < n; i++) {
    pthread_join(producerThread[i], NULL);
  }

  for (long i = 0; i < n; i++) {
    pthread_join(consumerThread[i], NULL);
  }

  return 0;
}