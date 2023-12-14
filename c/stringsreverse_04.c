//strings_04-reverse
#include<stdio.h>
int main (){
	char str[100];
	fgets(str,100,stdin);
	
	int i=0,strlength=0;
	while(str[i]!='\0'){
		strlength++;
		i++;
	}
	
	int j=strlength;
	for (int j=strlength-1;j>=0;j--){
		printf("%c",str[j]);
	}
	
	
	
	return 0;
}