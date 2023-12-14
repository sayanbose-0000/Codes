//strings_03-contatenation
#include<stdio.h>
#include<string.h>
int main (){
	char str1[100];
	char str2[100];
	gets(str1);
	gets(str2);
	
	int i=0,strlength1=0;
	while (str1[i]!='\0'){
		strlength1++;
		i++;
	}
	int j=0,strlength2=0;
	while (str2[j]!='\0'){
		strlength2++;
		j++;
	}
	
	
	
	for (int m=strlength1,n=0; n<strlength1+strlength2; m++,n++){
		str1[m]=str2[n];
	}
	
	
	int z=0;
	while (str1[z]!='\0'){
		printf("%c",str1[z]);
		z++;
	}
	
}