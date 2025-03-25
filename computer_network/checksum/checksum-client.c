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

  char str[50];
  int sep;

  printf("Enter your message: ");
  scanf("%[^\n]s", &str);
  
  printf("Enter sperator size: ");
  scanf("%d", &sep); 

  // counting no of digits needed to make it seperatable
  int count = 0;
  while (count < strlen(str)) {
    count += sep;
  }
  
  char appended_data[50] = {0};
  for (int i = 0; i < count; i++) {
    appended_data[i] = '0';
  }
  appended_data[count] = '\0';

  int m = strlen(appended_data) - 1;
  int n = strlen(str) - 1;

  // copying the string
  while (n >= 0) {
    appended_data[m--] = str[n--];
  }

  // appending the data to the beginning
  while (m >= 0) {
    appended_data[m--] = '0';
  }

  // str(appended_data) / sep;
  char matrix[50][50] = {0};
  
  int i = 0, j = 0;

  while (i < strlen(sep)) {
    while (j < strlen(appended_data) / sep) {
      matrix[i][j] = appended_data[i];
      j++;
    }
    i++;
  }

  for (int i = 0; i < strlen(appended_data); i++) {
    printf("%d", appended_data[i]);
  }

  for (int i = 0; i < strlen(sep); i++) {
    for (int j = 0; j < strlen(appended_data) / sep; j++) {
      printf("%d ", appended_data[i][j]);
    }
    printf("\n");
  }

  send(sd, appended_data, sizeof(appended_data), 0);
  send(sd, &sep, sizeof(int), 0);

  close(sd);

  return 0;
}