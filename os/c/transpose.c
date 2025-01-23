#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>

#define SIZE 10
int mat1[SIZE][SIZE], mat2[SIZE][SIZE];
int m, n;

sem_t sem;

void* readMat() {
  printf("Enter a: ");
  scanf("%d", &m);

  printf("Enter b: ");
  scanf("%d", &n);

  printf("Enter mat: \n");
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      scanf("%d", &mat1[i][j]);
    }
  }

  sem_post(&sem);
}

void* transposeMat() {
  sem_wait(&sem);

  printf("Transpose matrix is:\n");

  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      mat2[j][i] = mat1[i][j];
    }
  }

  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      printf("%d ", mat2[i][j]);
    }
    printf("\n");
  }

  int count = 0;
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      if (mat1[i][j] == mat2[i][j]) {
        count++;
      }
    }
  }
  
  if (count == m*n) {
    printf("Symmetic\n");
  }

  else {
    printf("Not Symmetic\n");
  }
}

int main() {
  sem_init(&sem, 0, 0);

  pthread_t thread1, thread2;

  pthread_create(&thread1, NULL, &readMat, NULL);
  pthread_create(&thread2, NULL, &transposeMat, NULL);

  pthread_join(thread1, NULL);
  pthread_join(thread2, NULL);
}