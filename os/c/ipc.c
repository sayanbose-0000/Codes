#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <string.h>

int main() {
  pid_t pid = fork();

  int fd[2];
  pipe(fd);

  if (pid < 0) {
    printf("Error in forking\n");
  }

  else if (pid == 0) { // Child Process
    char x[10] = "Hi";
    
    close(fd[0]);
    write(fd[1], x, strlen(x)+1);
    close(fd[1]);

    printf("Child: %s", x);

    exit(1);
  }

  else {  // Parent
    char x[10];

    close(fd[1]);
    read(fd[0], x, sizeof(x));
    close(fd[0]);

    printf("Parent: %s", x);
  }
  
  return 0;
}
