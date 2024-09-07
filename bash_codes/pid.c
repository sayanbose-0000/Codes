#include <stdio.h>
#include <unistd.h>

int main() {
  // pid_t pid, ppid;

  // pid = getpid();
  // ppid = getppid();

  // printf("PID: %d\n", pid);
  // printf("PPID: %d\n", ppid);

  pid_t id = fork();
  printf("Curr ID pid: %d, Parent ID ppid: %d \n", getpid(), getppid());

  return 0;
}