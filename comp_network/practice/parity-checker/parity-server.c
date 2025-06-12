#include <stdio.h>
#include <unistd.h>
#include <arpa/inet.h>
#include <string.h>

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

  int count_ones = 0;
  for (int i = 0; i < strlen(msg) - 2; i++) {
    if (msg[i] == '1') {
      count_ones++;
    }
  }

  count_ones = count_ones % 2;

  int parity_schema = msg[strlen(msg) - 1] - '0';
  char new_parity = '0';

  if (count_ones == 0 && parity_schema == 0) {
    new_parity = '0';
  }

  else if (count_ones == 1 && parity_schema == 0) {
    new_parity = '1';
  }

  else if (count_ones == 0 && parity_schema == 1) {
    new_parity = '1';
  }

  else { // count_ines 1 and parity schema 1
    new_parity = '0';
  }

  char parity_bit = msg[strlen(msg) - 2];


  
  if (parity_bit == new_parity) {
    printf("Message sent: ");
    for (int i = 0; i < strlen(msg) - 2; i++) {
      printf("%c", msg[i]);
    }
  }
  
  else {
    printf("Error in sending data");
  }
  
  printf("\n");

  return 0;
}
