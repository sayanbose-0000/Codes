// b) Write a C program using fork() system call that generates the Fibonacci sequence in the
// parent process and prime checking in the child process.

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
  pid_t pid = fork();

  if (pid < 0) {
    printf("Error forking\n");
  }

  if (pid == 0) { // Child
    int n;

    printf("Enter n: ");
    scanf("%d", &n);

    int arr[n];

    arr[0]=0;
    arr[1]=1;

    for (int i = 2; i < n; i++) {
      arr[i] = arr[i-1] + arr[i-2];
    }

    for (int i = 0; i < n; i++) {
      printf("%d ", arr[i]);
    }

    printf("\n");
  }

  else { // Parent
    wait(NULL);
    int num;

    printf("Enter no: ");
    scanf("%d", &num );

    for (int i = 2; i < num ; i++) {
      if (num % i == 0) {
        printf("Non Prime");
        return 0;
      }
    }

    printf("Prime");
  }
}