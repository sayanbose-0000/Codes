//calc total no of alphabets, digits and spacial character in strings
#include<stdio.h>
#include<ctype.h>
#include <string.h>

int main (){
	char str[100];
	printf("Enter the string\n");
	fgets(str, sizeof(str), stdin);

	
	int alpha=0, digit=0, special_char=0;
	
	int i=0;
	while(str[i]!='\0'){
		if (isalpha(str[i])){
			alpha++;
		}
		else if(isdigit(str[i])){
			digit++;
		}
		
		else {
			special_char++;
		}
		i++;
	}
	
	printf("Total no of alphabets: %d\n",alpha);
	printf("Total no of digits: %d\n",digit);
	printf("Total no of special characters: %d\n",special_char-1); 
	
	/*to exclude the new line special character, the variable special_char
	is subtracted by 1*/
	
	return 0;
}