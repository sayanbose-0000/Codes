#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main() {
  int fd[2];
  char string[] = "Hello", readBuffer[100];

  pipe(fd); // do  pipe before fork
  pid_t f = fork();

  if (f == -1) {
    printf("Error forking\n");
    return -1;
  }

  if (f == 0) { // read always from fd[0], write always from fd[1]
    close(fd[0]); // close read end while writing
    write(fd[1], string, sizeof(string));
    close(fd[1]);
    printf("Child done\n");
  }

  else { // read always from fd[0], write always from fd[1]
    close(fd[1]); // close write end while reading
    read(fd[0], readBuffer, sizeof(readBuffer));
    close(fd[0]);
    printf("Read: %s from parent\n", readBuffer);
    printf("Parent done\n");
  }

  return 0;
}