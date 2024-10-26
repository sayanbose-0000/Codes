#include <stdio.h>
#include <pthread.h>

pthread_mutex_t myMutex = PTHREAD_MUTEX_INITIALIZER;
int a[10][10], r1, c1;
int b[10][10], r2, c2;
int c[10][10];

void *inputMatrix() {
  pthread_mutex_lock(&myMutex);

  // first matrix
  printf("Enter r1: ");
  scanf("%d", &r1);

  printf("Enter c1: ");
  scanf("%d", &c1);

  printf("Enter a matrix: \n");
  for (int i = 0; i < r1; i++) {
    for (int j = 0; j < c1; j++) {
      scanf("%d", &a[i][j]);
    }
  }

  // second matrix
  printf("Enter r2: ");
  scanf("%d", &r2);

  printf("Enter c2: ");
  scanf("%d", &c2);

  printf("Enter b matrix: \n");
  for (int i = 0; i < r2; i++) {
    for (int j = 0; j < c2; j++) {
      scanf("%d", &b[i][j]);
    }
  }

  pthread_mutex_unlock(&myMutex);
}

void *addingMatrix() {
  pthread_mutex_lock(&myMutex);

  
  for (int i = 0; i < r1; i++) {
    for (int j = 0; j < c1; j++) {
      c[i][j] = a[i][j] + b[i][j];
    }
  }

  printf("Sum is: \n");
  for (int i = 0; i < r1; i++) {
    for (int j = 0; j < c1; j++) {
      printf("%d ", c[i][j]);
    }
    printf("\n");
  }

  pthread_mutex_unlock(&myMutex);
}

int main() {

  pthread_t thread1, thread2;

  pthread_create(&thread1, NULL, &inputMatrix, NULL);
  pthread_create(&thread2, NULL, &addingMatrix, NULL);

  pthread_join(thread1, NULL);
  pthread_join(thread2, NULL);

  return 0;
}