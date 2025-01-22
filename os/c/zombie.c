// Write a C program that will create a child process by using the fork() system call , then
// forcefully create a zombie process and display the corresponding process id from process
// table.

#include <stdio.h>
#include <sys/types.h>
#include <stdlib.h>
#include <unistd.h>

int main() {

  pid_t pid = fork();

  if (pid < 0) {
    printf("Error in forking\n");
    exit(1);
  }

  if (pid == 0) {
    sleep(4);
    printf("Child | pid: %d, parent pid: %d\n", getpid(), getppid());
  }

  else {
    printf("Parent | pid: %d, parent pid: %d\n", getpid(), getppid());
    exit(1);
  }

  return 0;
}