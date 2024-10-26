#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
  pid_t pid = fork();

  if (pid == 0) { // child process pid is 0
    printf("Child process id: %d\n", getpid()); // child process pid
    printf("Child's parent process id: %d\n", getppid()); // child's parent process pid (ie, this running program of processId.c file)
  }

  else {
    wait(NULL);
    printf("Parent process id: %d\n", getpid()); // child's parent process pid (ie, this running program of processId.c file)
    printf("Parents's parent process id: %d\n", getppid()); // parent's parent (ie, terminal process here)
  }
}


// This C program creates a new process using fork(). When fork() is called, it duplicates the current process,
// making a parent and a child process. In the child process (pid == 0), it prints its own process ID with getpid() and its parent's 
// ID with getppid(). In the parent process, it waits for the child to finish using wait(NULL), then prints its own process ID and its
// parent's (which could be the shell or terminal running it).