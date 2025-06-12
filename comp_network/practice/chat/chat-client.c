#include <stdio.h>
#include <unistd.h>
#include <string.h>
#include <arpa/inet.h>

int main() {
  int sd = socket(AF_INET, SOCK_STREAM, 0);

  struct sockaddr_in server = {
    .sin_family = AF_INET,
    .sin_port = htons(9995),
    .sin_addr.s_addr = inet_addr("127.0.0.1")
  };

  connect(sd, (struct sockaddr*)&server, sizeof(server));

  char msg[99];
  
  while (1) {
    printf("To server: ");
    scanf(" %[^\n]s", msg);
    send(sd, msg, sizeof(msg), 0);
  }

  return 0;
}
