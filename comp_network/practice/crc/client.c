#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <arpa/inet.h>
#include <string.h>

int main() {
  // establshing connection
  int sd = socket(AF_INET, SOCK_STREAM, 0);
  struct sockaddr_in server = { .sin_family = AF_INET, .sin_port = htons(9995), .sin_addr.s_addr = inet_addr("127.0.0.1")};
  connect(sd, (struct sockaddr*)&server, sizeof(server));

  // taking necessary inputs
  char data[99], poly[99];
  printf("Enter data: ");
  scanf(" %[^\n]s", data);
  printf("Enter poly: ");
  scanf(" %[^\n]s", poly);
  
  // making dividend array by padding (adding polylen - 1) to data
  int datalen = strlen(data), polylen = strlen(poly), divilen = datalen + polylen - 1;
  char divi[divilen + 1]; // for null character
  for (int i = 0; i < datalen; i++) divi[i] = data[i];
  for (int i = datalen; i < divilen; i++) divi[i] = '0';

  // perform division
  for (int i = 0; i <= divilen - polylen; i++)
    if (divi[i] == '1') 
      for (int j = 0; j < polylen; j++) 
        divi[i+j] = '0' + ((divi[i+j] - '0') ^ (poly[j] - '0'));

  // re-adding data to the frot of divi
  for (int i = 0; i < datalen; i++) divi[i] = data[i];

  // adjusting for null character
  divi[divilen] = '\0';
  poly[polylen] = '\0';

  // sending final data and the polynomial
  send(sd, data, datalen, 0);
  send(sd, divi, divilen + 1, 0);
  send(sd, poly, polylen + 1, 0);
  
  return 0;
}