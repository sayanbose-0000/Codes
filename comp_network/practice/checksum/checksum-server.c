#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <arpa/inet.h>
  
int main() {
  int sd = socket(AF_INET, SOCK_STREAM, 0);

  struct sockaddr_in server = {
    .sin_family = AF_INET,
    .sin_port = htons(9995),
    .sin_addr.s_addr = inet_addr("127.0.0.1")
  };

  bind(sd, (struct sockaddr*)&server, sizeof(server));
  listen(sd, 1);
  int cd = accept(sd, NULL, NULL);

  char msg[99];

  recv(cd, msg, sizeof(msg), 0);

  printf("Message sent: %s", msg);
  
  return 0;
}
