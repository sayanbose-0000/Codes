#include <stdio.h>
#include <unistd.h>
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
  scanf("%[^\n]s", &msg);

  int parity_schema = 0;
  printf("\n0 -> Even parity, 1 -> Odd parity \nEnter your choice: ");
  scanf("%d", &parity_schema);

  int count_ones = 0;
  for (int i = 0; i < strlen(msg); i++) {
    if (msg[i] == '1') {
      count_ones++;
    }
  }

  count_ones = count_ones % 2;

  if (count_ones == 0 && parity_schema == 0) {
    strcat(msg, "0");
  }

  else if (count_ones == 1 && parity_schema == 0) {
    strcat(msg, "1");
  }

  else if (count_ones == 0 && parity_schema == 1) {
    strcat(msg, "1");
  }

  else { // count_ines 1 and parity schema 1
    strcat(msg, "0");
  }

  char last_char[2] = {'0' + parity_schema, '\0'}; // character array, appending parity scheme and EOL
  strcat(msg, last_char);

  send(sd, msg, sizeof(msg), 0);

  close(sd);

  return 0;
}
