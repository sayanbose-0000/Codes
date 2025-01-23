// Consider 3 threads running simultaneously. First thread1 read a number a. After that
// thread2 reads a number b then thread3 will do addition of a and b. Synchronize it using
// semaphore.

#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <pthread.h>
#include <semaphore.h>

sem_t sem1,sem2;
int a, b, sum;

void* readA() {
  printf("Enter a: ");
  scanf("%d", &a);

  sem_post(&sem1);
}

void* readB() {
  sem_wait(&sem1);

  printf("Enter b: ");
  scanf("%d", &b);

  sem_post(&sem2);
}

void* sumAB() {
  sem_wait(&sem2);

  printf("Sum is: %d\n", (a+b));

}

int main() {
  sem_init(&sem1, 0, 0);
  sem_init(&sem2, 0, 0);

  pthread_t thread1, thread2, thread3;

  pthread_create(&thread1, NULL, &readA, NULL);
  pthread_create(&thread2, NULL, &readB, NULL);
  pthread_create(&thread3, NULL, &sumAB, NULL);

  pthread_join(thread1, NULL);
  pthread_join(thread2, NULL);
  pthread_join(thread3, NULL);
}