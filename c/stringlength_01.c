//strings_01-string length
#include <stdio.h>
#include <string.h>

int main() {
    char str[100];
    printf("Enter the string\n");
    gets(str);
    
    int i = 0, count = 0;
    while (str[i] != '\0') {
        count++;
        i++;
    }
    printf("The size without library function is %d\n", count);
    printf("The size with library function is %d\n", strlen(str));
    
    return 0;
}
