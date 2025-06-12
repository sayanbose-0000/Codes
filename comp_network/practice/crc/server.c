#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <arpa/inet.h>
#include <string.h>

int main() {
  // establishing connection
  int sd = socket(AF_INET, SOCK_STREAM, 0);
  struct sockaddr_in server = {.sin_family = AF_INET, .sin_port = htons(9995), .sin_addr.s_addr = inet_addr("127.0.0.1")};
  bind(sd, (struct sockaddr*)&server, sizeof(server));
  listen(sd, 1);
  int cd = accept(sd, NULL, NULL);

  // recieving data from client
  char divi[99], poly[99], data[99];
  recv(cd, data, sizeof(data), 0);
  recv(cd, divi, sizeof(divi), 0);
  recv(cd, poly, sizeof(poly), 0);

  
  // perform division
  int divilen = strlen(divi), polylen = strlen(poly), datalen = strlen(data);
  // divi[divilen - 1] = '1'; // TESTING
  for (int i = 0; i <= divilen - polylen; i++)
    if (divi[i] == '1') 
      for (int j = 0; j < polylen; j++) 
        divi[i+j] = '0' + ((divi[i+j] - '0') ^ (poly[j] - '0'));

  // checking if remainder is all 0
  int error = 0;
  for (int i = divilen - polylen + 1; i < divilen; i++) 
    if (divi[i] == '1') error = 1;

  // If rem = 0, then data OK, else error
  if (!error) {
    printf("Sent data: %s", data);
  } else {
    printf("Error in sending data");
  }
  printf("\n");

  return 0;
}