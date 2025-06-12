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

  int m, r, parity;
  recv(cd, &m, sizeof(m), 0);
  recv(cd, &r, sizeof(r), 0);

  char msg[m + r + 2]; // 1-based indexing: index 1 to m+r used
  recv(cd, msg + 1, m + r, 0); // receive m+r bytes starting from index 1
  recv(cd, &parity, sizeof(parity), 0);

  for (int i = 1; i <= m + r; i++) {
    if ((i & (i - 1)) == 0) {
      int count = 0;
      for (int j = 1; j <= m + r; j++) {
        if ((j & i) && msg[j] == '1') count++;
      }

      char expected = '0';
      if (count % 2 == 0 && !parity) expected = '1';
      if (count % 2 != 0 && !parity) expected = '0';
      if (count % 2 == 0 && parity)  expected = '0';
      if (count % 2 != 0 && parity)  expected = '1';

      if (msg[i] != expected) {
        printf("Error in bit %d\n", i);
        close(cd); close(sd);
        return 1;
      }
    }
  }

  printf("Message received: ");
  for (int i = 1; i <= m + r; i++) {
    if ((i & (i - 1)) != 0) printf("%c", msg[i]); // print only data bits
  }

  printf("\n");
  close(cd);
  close(sd);
  return 0;
}
