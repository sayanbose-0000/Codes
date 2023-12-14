//strings_05-removespace
#include<stdio.h>
#include<string.h>
int main (){
	char str[100];
	gets(str);
	
	int i=0,strlength=0;
	while(str[i]!=0){
		strlength++;
		i++;
	}
	
	for (int i=0; i<strlength; i++){
		if (str[i]==32){
			continue;
		}
		else {
			printf("%c",str[i]);
		}
	}
	
	return 0;
}