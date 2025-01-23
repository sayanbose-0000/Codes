#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <pthread.h>
#include <semaphore.h>

#define SIZE 5
sem_t chopsticks[SIZE];

void* philosopherProcess(void* a) {
  long i = (long)a;
  
  while(1) {
    sem_wait(&chopsticks[i]);
    sem_wait(&chopsticks[(i+1) % SIZE]);

    printf("Philosopher %d eating\n", i);
    sleep(1);

    sem_post(&chopsticks[(i+1) % SIZE]);
    sem_post(&chopsticks[i]);

    printf("Philosopher %d thinking\n", i);

    sleep(1);
  }
}

int main() {
  for (int i = 0; i < SIZE; i++) {
    sem_init(&chopsticks[i], 0, 1);
  }

  pthread_t thread[SIZE];

  for (long i = 0; i < SIZE; i++) {
    pthread_create(&thread[i], NULL, &philosopherProcess, (void*) i);
  }

  for (int i = 0; i < SIZE; i++) {
    pthread_join(thread[i], NULL);
  }

  return 0;
}