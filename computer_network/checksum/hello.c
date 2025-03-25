// FOR TESTING PURPOSES

#include <stdio.h>
#include <string.h>
#include <unistd.h>

int main() {
  char str[50];
  int sep;

  printf("Enter your message: ");
  scanf("%[^\n]s", &str);
  
  printf("Enter sperator size: ");
  scanf("%d", &sep); 

  int count = 0;
  while (count < strlen(str)) {
      count += sep;
  }
  
  char appended_data[count];  

  int m = sizeof(appended_data);
  int n = strlen(str) - 1;

  printf("count: %d and m: %d", count, m);

  return 0;
}