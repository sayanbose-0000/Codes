// b) A variable count is shared by 3 threads. Each thread will increment the variable. Write a C
// program to synchronize the threads.

#include <stdio.h>
#include <stdlib.h>
#include <semaphore.h>
#include <unistd.h>
#include <pthread.h>
#include <sys/types.h>
#include <sys/wait.h>

int count = 0;
sem_t sem;

void* increment(void* a) {
  sem_wait(&sem);

  sleep(1);

  for (int i = 0; i < 10; i++) {
    count++;
  }

  printf("Thread %d, Count: %d\n", (int*) a, count);

  sleep(1);

  sem_post(&sem);
}

int main() {
  sem_init(&sem, 0, 1);

  pthread_t thread1, thread2, thread3;

  pthread_create(&thread1, NULL, &increment, (void*)1);
  pthread_create(&thread2, NULL, &increment, (void*)2);
  pthread_create(&thread3, NULL, &increment, (void*)3);

  pthread_join(thread1, NULL);
  pthread_join(thread2, NULL);
  pthread_join(thread3, NULL);

  return 0;
}