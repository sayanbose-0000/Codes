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
  int sep;

  recv(cd, str, sizeof(str), 0); // recieve
  recv(cd, &sep, sizeof(int), 0); // recieve

  printf("Recieved string: %s\n", str);
  printf("Recieved sep: %d\n", sep);

  close(sd);
  close(cd);

  return 0;
}