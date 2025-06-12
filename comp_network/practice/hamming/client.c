#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <arpa/inet.h>
#include <math.h>
#include <string.h>

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
  scanf(" %[^\n]s", msg);

  int parity;
  printf("0->odd, 1->even. Enter parity: ");
  scanf("%d", &parity);

  int m = strlen(msg), r = 0;
  while (pow(2, r) < m + r + 1) r++;

  char tosend[m + r + 2]; // index 1 to m+r used; +2 to be safe
  for (int i = 0; i <= m + r; i++) tosend[i] = '0';

  int k = 0;
  for (int i = 1; i <= m + r; i++) {
    if ((i & (i - 1)) == 0) continue; // skip parity positions
    tosend[i] = msg[k++];
  }

  for (int i = 1; i <= m + r; i++) {
    if ((i & (i - 1)) == 0) {
      int count = 0;
      for (int j = 1; j <= m + r; j++) {
        if ((j & i) && tosend[j] == '1') count++;
      }
      if (count % 2 == 0 && !parity) tosend[i] = '1';
      if (count % 2 != 0 && !parity) tosend[i] = '0';
      if (count % 2 == 0 && parity)  tosend[i] = '0';
      if (count % 2 != 0 && parity)  tosend[i] = '1';
    }
  }

  send(sd, &m, sizeof(m), 0);
  send(sd, &r, sizeof(r), 0);
  send(sd, tosend + 1, m + r, 0);  // send only 1..m+r
  send(sd, &parity, sizeof(parity), 0);

  close(sd);
  return 0;
}
