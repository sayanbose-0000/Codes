// multithreading

#include <stdio.h>
#include <unistd.h>
#include <pthread.h>

pthread_mutex_t myThread = PTHREAD_MUTEX_INITIALIZER;
int r1, c1, r2, c2, a[10][10], b[10][10], c[10][10];

void *inputMatrix () {
  pthread_mutex_lock(&myThread);
  
  printf("Enter r1: ");
  scanf("%d", &r1);
  printf("Enter c1: "); 
  scanf("%d", &c1);

  printf("Input a: \n");
  for (int i = 0; i < r1; i++) {
    for (int j = 0; j < c1; j++) {
      scanf("%d", &a[i][j]);
    }
  }

  printf("a is: \n");
  for (int i = 0; i < r1; i++) {
    for (int j = 0; j < c1; j++) {
      printf("%d ", a[i][j]);
    }
    printf("\n");
  }

  // --
  printf("Enter r2: ");
  scanf("%d", &r2);
  printf("Enter c2: "); 
  scanf("%d", &c2);


  printf("Input b: \n");
  for (int i = 0; i < r2; i++) {
    for (int j = 0; j < c2; j++) {
      scanf("%d", &b[i][j]);
    }
  }

  printf("b is: \n");
  for (int i = 0; i < r2; i++) {
    for (int j = 0; j < c2; j++) {
      printf("%d ", b[i][j]);
    }
    printf("\n");
  }

  pthread_mutex_unlock(&myThread);
}

void *addMatrix () {
  pthread_mutex_lock(&myThread);

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

  pthread_mutex_unlock(&myThread);
}

int main() {
  pthread_t thread1, thread2;

  pthread_create(&thread1, NULL, &inputMatrix, NULL);
  pthread_create(&thread2, NULL, &addMatrix, NULL);

  pthread_join(thread1, NULL);
  pthread_join(thread2, NULL);

  return 0;
}