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

  childpid = fork();
  if (childpid == -1) {
    printf("Error in forking");
    return -1;
  }

  if (childpid = 0) {
    printf("From child");
    close(fd[0]);
    write(fd[1]], string, strlen(string) + 1);
    close(fd[1]);
  }

  else {
    printf("From parent");
    close(fd[1]);
    nbytes = read(fd[0], readBuffer, sizeof(readBuffer));
    printf("Recieved string %s", readBuffer);
    close(fd[0]);
  }

  return 0;
}