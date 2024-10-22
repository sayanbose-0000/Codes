// print process id

#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {

  pid_t pid;
  pid = fork();
  
  if (pid == 0) {
    printf("%d \n", getpid());
    printf("%d \n", getppid());
  }

  else {
    wait(NULL);
    printf("%d \n", getpid());
    printf("%d \n", getppid());
  }

  return 0;
}