#include <stdio.h>
#include <unistd.h>
#include <arpa/inet.h>

int main() {
  int sd = socket(AF_INET, SOCK_STREAM, 0);

  struct sockaddr_in socket = {
    .sin_family = AF_INET,
    .sin_port = htons(9995),
    .sin_addr.s_addr = inet_addr("127.0.0.1")
  };

  connect(sd, (struct sockaddr*)&socket , sizeof(socket));

  char msg[99];

  printf("Enter msg: ");
  scanf("%s", &msg);

  send(sd, msg, sizeof(msg), 0);

  close(sd);

  return 0;
}
