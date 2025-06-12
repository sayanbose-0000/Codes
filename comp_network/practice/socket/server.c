#include <stdio.h>
#include <arpa/inet.h>
#include <unistd.h>

int main() {
  int sd = socket(AF_INET, SOCK_STREAM, 0);

  struct sockaddr_in socket = {
    .sin_family = AF_INET,
    .sin_port = htons(9995),
    .sin_addr.s_addr = inet_addr("127.0.0.1")
  };

  bind(sd, (struct sockaddr*)&socket, sizeof(socket));
  listen(sd, 1);
  int cd = accept(sd, NULL, NULL);

  char msg[99];

  recv(cd, msg, sizeof(msg), 0);

  printf("Message is: %s\n", msg);

  close(sd);
  close(cd);

  return 0;
}