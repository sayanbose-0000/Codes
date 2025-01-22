#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
  int fd[2];
  pipe(fd);

  pid_t pid = fork();

  if (pid < 0) {
    printf("Error while forking!\n");
    return 0;
  }

  else if (pid == 0) { // Child Process
    char x[99] = "Hello\n";
    
    close(fd[0]);
    write(fd[1], x, sizeof(x));
    close(fd[1]);

    printf("Child: %s", x);
  }

  else {
    wait(NULL);

    char x[99];

    close(fd[1]);
    read(fd[0], x, sizeof(x));
    close(fd[0]);

    printf("Parent: %s", x);
  }

  return 0;
}