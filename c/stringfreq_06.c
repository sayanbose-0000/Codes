//strings 06-frequency  XXXXXX
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
	
	for (int j=0;j<strlength;j++){
		for(char i='a';i<='z';i++){
			if(str[j]==i){
				printf("%c is present %d times\n",i,j);
			}
		}
	}
	
	return 0;
}