#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <semaphore.h>
#include <pthread.h>

sem_t wrt, mutex;
int sharedData = 0;
int readerCount = 0;

void* readerProcess(void* a) {
  while (1) {
    sem_wait(&mutex);

    readerCount++;
    if(readerCount == 1) {
      sem_wait(&wrt);
    }

    sem_post(&mutex);




    // Reading
    printf("Reader %d reads %d\n", (long)a, sharedData);



    
    sem_wait(&mutex);

    readerCount--;
    if (readerCount == 0) {
      sem_post(&wrt);
    }

    sem_post(&mutex);

    sleep(1);
  }
}

void* writerProcess(void* a) {
  while(1) {
    sem_wait(&wrt);

    // Writing
    sharedData++;
    printf("Writer %d writes %d\n", (long)a, sharedData);

    sem_post(&wrt);

    sleep(1);
  }
}

int main() {
  sem_init(&wrt, 0, 1);
  sem_init(&mutex, 0, 1);

  int r, w;

  printf("Enter no of readers: ");
  scanf("%d", &r);

  printf("Enter no of writers: ");
  scanf("%d", &w);

  pthread_t readerThread[r], writerThread[w];

  for (long i = 0; i < r; i++) {
    pthread_create(&readerThread[i], NULL, &readerProcess, (void*)i);
  }

  for (long i = 0; i < w; i++) {
    pthread_create(&writerThread[i], NULL, &writerProcess, (void*)i);  
  }

  for (long i = 0; i < r; i++) {
    pthread_join(readerThread[i], NULL);
  }

  for (long i = 0; i < w; i++) {
    pthread_join(writerThread[i], NULL);
  }

  return 0;
}