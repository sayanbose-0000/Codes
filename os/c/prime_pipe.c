#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

int main() {
  int fd[2];
  pipe(fd);

  pid_t pid = fork();

  if (pid < 0) {
    printf("Error forking\n");
    exit(1);
  }

  if (pid == 0) { // child process
    int x;
    printf("Enter n: ");
    scanf("%d", &x);

    close(fd[0]);
    write(fd[1],  &x, sizeof(x));
    close(fd[1]);

  }

  else { // Parent process
    wait(NULL);

    int n;
    close(fd[1]);
    read(fd[0], &n, sizeof(n));
    close(fd[0]);

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        printf("Non-prime\n");
        return 0;
      }
    }

    printf("Prime\n");
  }

  return 0;
}