#include <pthread.h>
#include <semaphore.h>
#include <stdio.h>
#include <unistd.h>

#define BUFFER_SIZE 5
#define NUM_PRODUCERS 5
#define NUM_CONSUMERS 5

int buffer[BUFFER_SIZE];
int in = 0, out = 0;
int next_item = 1;

sem_t empty, full, mutex; // Semaphore for mutual exclusion

void *producer(void *arg) {
  while (1) {
    sem_wait(&empty);
    sem_wait(&mutex); // Lock the critical section

    buffer[in] = next_item++;
    printf("Producer %ld produced: %d\n", (long)arg, buffer[in]);
    in = (in + 1) % BUFFER_SIZE;

    sem_post(&mutex); // Unlock the critical section
    sem_post(&full);
    sleep(1);
  }
}

void *consumer(void *arg) {
  while (1) {
    sem_wait(&full);
    sem_wait(&mutex); // Lock the critical section

    int item = buffer[out];
    printf("Consumer %ld consumed: %d\n", (long)arg, item);
    out = (out + 1) % BUFFER_SIZE;

    sem_post(&mutex); // Unlock the critical section
    sem_post(&empty);
    sleep(1);
  }
}

int main() {
  pthread_t producers[NUM_PRODUCERS], consumers[NUM_CONSUMERS];

  sem_init(&empty, 0, BUFFER_SIZE);
  sem_init(&full, 0, 0);
  sem_init(&mutex, 0, 1); // Binary semaphore for mutual exclusion

  for (long i = 0; i < NUM_PRODUCERS; i++) {
    pthread_create(&producers[i], NULL, producer, (void *)i);
  }

  for (long i = 0; i < NUM_CONSUMERS; i++) {
    pthread_create(&consumers[i], NULL, consumer, (void *)i);
  }

  for (int i = 0; i < NUM_PRODUCERS; i++) {
    pthread_join(producers[i], NULL);
  }

  for (int i = 0; i < NUM_CONSUMERS; i++) {
    pthread_join(consumers[i], NULL);
  }

  sem_destroy(&empty);
  sem_destroy(&full);
  sem_destroy(&mutex);

  return 0;
}
