#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
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
  printf("Enter msg: ");
  scanf("%[^\n]s", msg);

  int block;
  printf("Enter block size: ");
  scanf("%d", &block);

  // calculating padding
  int pad = 0;
  while(1) {
    if ((pad + strlen(msg)) % block == 0) break;
    pad++;
  }

  char new_msg[strlen(msg) + pad + 2]; // (+2) is for null('\0') character at start and end
  new_msg[0] = '\0';

  for (int i = 0; i < pad; i++) {
    strcat(new_msg, "0");
  }
  strcat(new_msg, msg);
  strcat(new_msg, "\n");

  int sum = 0;
  for (int i = 0; i < strlen(msg);)

  send(sd, new_msg, sizeof(new_msg), 0);

  return 0;
}
