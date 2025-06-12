#include <stdio.h>
#include <string.h>
#include <unistd.h> // provides close()
#include <arpa/inet.h> // provides inet_addr() and htons

int main() {
  int sd, cd; // server and client socket descriptor

  struct sockaddr_in sad, cad; // sad and cad are instances of sockaddr_in. They store client and server socket info

  sd = socket(AF_INET, SOCK_STREAM, IPPROTO_TCP); // AF_INET - IPv4; SOCK_STREAM - two way, connection based; IPPROTO_TCP - TCP connection

  sad.sin_family = AF_INET; // IPv4
  sad.sin_port = htons(9995); // convert integer from host byte order
  sad.sin_addr.s_addr = inet_addr("127.0.0.1"); // localhost IP

  bind(sd, (struct sockaddr*)&sad, sizeof(sad));
  listen(sd, 10);

  int cadl = sizeof(cad); // size of cad
  cd = accept(sd, (struct sockaddr*)&cad, &cadl);

  char str[50];
  char poly[50];
  char original_data[50];

  
  recv(cd, str, sizeof(str), 0); // recieve
  recv(cd, poly, sizeof(poly), 0); // recieve

  for (int i = 0; i < strlen(str); i++) {
    original_data[i] = str[i];
  }

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

  int count = 0;
  for (int j = 0; j < strlen(str); j++) {
    if (str[j] == '0') {
      count++;
    } 
  }

  if (count == strlen(str)) {
    for (int j = 0; j < strlen(str) - strlen(poly) + 1; j++) printf("%c ", original_data[j]);
  }

  else {
    printf("Error present!");
  }

  close(sd);
  close(cd);

  return 0;
}