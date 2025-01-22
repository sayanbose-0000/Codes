#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

#define SIZE 10

int a[SIZE][SIZE], b[SIZE][SIZE], c[SIZE][SIZE];
int m,n;

pthread_mutex_t myMutex = PTHREAD_MUTEX_INITIALIZER;

void* takeInput() {
  pthread_mutex_lock(&myMutex);

  printf("Enter size of the arrays(<10):\n");
  scanf("%d %d", &m, &n);

  printf("\n");

  printf("Enter array a:\n");
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      scanf("%d", &a[i][j]);
    }
  }

  printf("\n");

  printf("Enter array b:\n");
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      scanf("%d", &b[i][j]);
    }
  }

  pthread_mutex_unlock(&myMutex);
}

void* addArrays() {
  pthread_mutex_lock(&myMutex);

  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      c[i][j] = a[i][j] + b[i][j];
    }
  }

  printf("\n");

  printf("Sum of the arrays are:\n");
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      printf("%d ", c[i][j]);
    }
    printf("\n");
  }

  pthread_mutex_unlock(&myMutex);
}

int main() {

  pthread_t thread1, thread2;

  pthread_create(&thread1, NULL, &takeInput, NULL);
  pthread_create(&thread2, NULL, &addArrays, NULL);

  pthread_join(thread1, NULL);
  pthread_join(thread2, NULL);

  return 0;
}