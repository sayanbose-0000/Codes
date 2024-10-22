// inter process communication using pipes

#include <stdio.h>
#include <unistd.h>
#include<sys/types.h>
#include <string.h>
#include <stdlib.h>

int main() {
  int fd[2], nbytes;
  pid_t childPid;
  char string[] = "Hello\n";
  char readBuffer[80];

  pipe(fd);

  childPid = fork();
  if (childPid == -1) {
    printf("Error in forking");
    return -1;
  }

  if (childPid == 0) {
    printf("From child\n");
    close(fd[0]);
    write(fd[1], string, sizeof(string));
    close(fd[1]);
  }

  else {
    printf("From parent\n");
    close(fd[1]);
    read(fd[0], readBuffer, sizeof(readBuffer));
    printf("Recieved string: %s", readBuffer);
    close(fd[0]);
  }

  return 0;
}

/* 

*/