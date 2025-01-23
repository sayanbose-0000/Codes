#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>

int count = 0;
sem_t mutex, wrt;
int readCount = 0;

void* readerProcess(void* a) {
  while(1) {
    sem_wait(&mutex);
      readCount++;
      if (readCount == 1) {
        sem_wait(&wrt);
      }
    sem_post(&mutex);

    printf("Reader %d reads %d\n", (long*) a, count);

    sem_wait(&mutex);
      readCount--;
      if (readCount == 0) {
        sem_post(&wrt);
      }
    sem_post(&mutex);

    sleep(1);
  }
}

void* writerProcess(void* a) {
  while(1) {
    sem_wait(&wrt);

    count++;
    printf("Writer %d writes %d\n", (long*) a, count);

    sem_post(&wrt);

    sleep(1);
  }
}

int main() {
  sem_init(&mutex, 0, 1);
  sem_init(&wrt, 0, 1);

  long r, w;

  printf("Enter no of producers: ");
  scanf("%d", &w);

  printf("Enter no of consumers: ");
  scanf("%d", &r);

  pthread_t readerThread[r], writerThread[w];

  for (long i = 0; i < r; i++) {
    pthread_create(&readerThread[i], NULL, &readerProcess, (void*) i);
  }

  for (long i = 0; i < w; i++) {
    pthread_create(&writerThread[i], NULL, &writerProcess, (void*) i);
  }

  for (int i = 0; i < r; i++) {
    pthread_join(readerThread[i], NULL);
  }

  for (int i = 0; i < w; i++) {
    pthread_join(writerThread[i], NULL);
  }

  return 0;
}