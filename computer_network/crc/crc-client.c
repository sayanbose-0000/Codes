// Sending data using even parity

#include <stdio.h>
#include <arpa/inet.h>
#include <unistd.h>
#include <string.h>

int main() {
  int sd; // client descriptor

  struct sockaddr_in sad, cad; // sockaddr_in is a predefined structure. sad and cad are objects

  sd = socket(AF_INET, SOCK_STREAM, IPPROTO_TCP);
  // AF_INET = IPV4
  // SOCK_STREAM = reliable, 2 way, connection based
  // IPPROTO_TCP = TCP protocol

  sad.sin_family = AF_INET;
  // htons = host to network short = converts port no to computer understandable network number
  sad.sin_port = htons(9995);
  sad.sin_addr.s_addr = inet_addr("127.0.0.1");

  connect(sd, (struct sockaddr*)&sad, sizeof(sad));

  // takes data input
  char str[50];
  printf("Enter your msg : ");
  scanf("%s", &str);

  // takes polynomial (divisor) as input
  char poly[50];
  printf("Enter your polynomial : ");
  scanf("%s", &poly);

  // the divident(actual data) stored in a seperate place called original_data
  char original_data[50];
  for (int i = 0; i < strlen(str); i++) {
    original_data[i] = str[i];
  }

  // dividend appeneded with n-1 number of 0's, n being the polynomials size
  int size = strlen(poly);
  for (int i = 1; i < size; i++) {
    strcat(str, "0");
  }

  // performing the actual division
  for (int i = 0; i < (strlen(str) - strlen(poly) + 1); i++) {
    if (str[i] == '1') {
      int j = 0;
      int k = i;
      while (j < strlen(poly)) {
        if (str[k] == poly[j]) str[k] = '0';
        else str[k] = '1';
        k++;
        j++;
      }
    }
  }

  // original data appended added to str again because the front part has changed after
  // division, which we donot want (we want front part to be back to old, only the appened part remains unchanged)
  for (int i = 0; i < strlen(original_data); i++) {
    str[i] = original_data[i];
  }

  for (int j = 0; j < strlen(str); j++) printf("%c ", str[j]);

  send(sd, str, sizeof(str), 0);
  send(sd, poly, sizeof(poly), 0);

  close(sd);
}
