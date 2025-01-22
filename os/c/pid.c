#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
  pid_t pid = fork();

  if (pid < 0) {
    printf("Error\n");
  }

  if (pid == 0) {
    printf("Child | pid: %d, parent: %d\n", getpid(), getppid());
  }

  else {
    wait(NULL);
    printf("Parent | pid: %d, parent: %d\n", getpid(), getppid());
  }

  return 0;
}