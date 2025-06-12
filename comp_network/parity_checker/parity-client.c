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

  connect(sd, (struct sockaddr*)&sad, sizeof(sad));

  char s[50];

  printf("Enter your message: ");
  scanf("%[^\n]s", &s);

  int parity_type;
  printf("0-> Even, 1->Odd: ");
  scanf("%d", &parity_type);

  int count = 0;
  for (int i = 0; i < strlen(s); i++) {
    if (s[i] == '1') count++;
  }
  count = count % 2;

  // adding parity type (even or odd)
  if (parity_type == 0) strcat(s, "0");
  else strcat(s, "1");
  
  // adding actual bit
  if (parity_type == 0) { // even parity 
    if (count == 0) strcat(s, "0");
    else strcat(s, "1");
  }
  
  else {  // odd parity
    if (count == 0) strcat(s, "1");
    else strcat(s, "0");
  }

  send(sd, s, sizeof(s), 0);

  close(sd);

  return 0;
}