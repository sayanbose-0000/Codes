//Strings no of things
#include <stdio.h>
#include <ctype.h>
#include <string.h>

int main() {
    char str[100];
    int count_dig = 0, count_alpha = 0, count_oth = 0;

    printf("Enter the string: ");
    gets(str);

	int i=0;
    while(str[i]!='\0') {
        if (isdigit(str[i])) {
            count_dig++;
        } else if (isalpha(str[i])) {
            count_alpha++;
        } else {
            count_oth++;
        }
	i++;
    }

    printf("Number of digits: %d\n", count_dig);
    printf("Number of alphabets: %d\n", count_alpha);
    printf("Number of other characters: %d\n", count_oth);

    return 0;
}