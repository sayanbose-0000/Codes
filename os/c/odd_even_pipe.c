// b) Write a C program where the parent process sends a number to child process using PIPE
// and child process computes whether that number is an odd or even number.

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
  int fd[2];
  pipe(fd);

  pid_t p = fork();

  if (p < 0) {
    printf("Error in forking\n");
    return 0;
  }

  if (p == 0) { // Child Process
    int n1;
    printf("Enter number: ");
    scanf("%d", &n1);

    close(fd[0]);
    write(fd[1], &n1, sizeof(n1));
    close(fd[1]);
    wait(NULL);
  }

  else { // Parent Process
    int n2;

    close(fd[1]);
    read(fd[0], &n2, sizeof(n2));
    close(fd[0]);

    printf("n is: %d\n", n2);

    if (n2 % 2 == 0) {
      printf("Even");
    }

    else {
      printf("Odd");
    }
  }

  return 0;
}