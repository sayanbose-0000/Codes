#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <string.h>

int main() {
  int fd[2];
  pipe(fd);

  pid_t pid = fork();

  if (pid < 0) {
    printf("Error in forking\n");
  }

  if (pid == 0) {
    char s[99];
    printf("Enter s: ");
    scanf("%s", &s);

    close(fd[0]);
    write(fd[1], &s, sizeof(s));
    close(fd[1]);
  }

  else {
    wait(NULL);

    char res[99];

    close(fd[1]);
    read(fd[0], &res, sizeof(res));
    close(fd[0]);

    int alpha = 0, numeric = 0, special = 0;
    for (int i = 0; i < strlen(res); i++) {
      char ch = res[i];
      if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
        alpha++;
      }

      else if (ch >= '0' && ch <= '9') {
        numeric++;
      }

      else {
        special++;
      }

    }
    printf("alpha: %d, numeric: %d, special: %d", alpha, numeric, special);
  }

  return 0;
}