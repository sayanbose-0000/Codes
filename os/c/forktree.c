// Write a C program that will create a child process using the fork() system call. Draw the
// process tree by generating different child process.

#include <stdio.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include <stdlib.h>

int main() {
  pid_t pid = fork();

  if (pid < 0) {
    printf("Error in forking\n");
    exit(1);
  }

  if (pid == 0) { // Child
    printf("Child | pid: %d, parent pid: %d\n",getpid(), getppid());

        if (pid < 0) {
          printf("Error in forking\n");
          exit(1);
        }

        pid = fork();
        if (pid == 0) { // Child
          printf("  Child | pid: %d, parent pid: %d\n",getpid(), getppid());  
              pid = fork();

              if (pid < 0) {
                printf("Error in forking\n");
                exit(1);
              }

              if (pid == 0) { // Child
                printf("    Child | pid: %d, parent pid: %d\n",getpid(), getppid());
              }

              else {
                wait(NULL);
                printf("    Parent | pid: %d, parent pid: %d\n",getpid(), getppid());
              }
        }

        else {
          wait(NULL);
          printf("  Parent | pid: %d, parent pid: %d\n",getpid(), getppid());
      }
  }

  else {
    wait(NULL);
    printf("Parent | pid: %d, parent pid: %d\n",getpid(), getppid());
  }
}