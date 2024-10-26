//lower case to upper case
#include<stdio.h>
#include<string.h>
int main (){
	char str1[100];
	gets(str1);
	
	int i=0,strlength=0;
	while(str1[i]!=0){
		strlength++;
		i++;
	}
	char str2[strlength];
	//lower to upper
	int j=0;
	for ( j=0;j<strlength;j++){
		if (str1[j]>='a'&&str1[j]<='z'){
			str2[j]=str1[j]-32;
		}
		else{
			str2[j]=str1[j];
		}
	}
	str2[j]='\0';
	printf("%s\n",str2);
	
	int str3[strlength];
	//upper to lower
	int k=0;
	for ( k=0;k<strlength;k++){
		if (str1[k]>='A'&&str1[k]<='Z'){
			str3[k]=str1[k]+32;
		}
		else{
			str3[k]=str1[j];
		}
	}
	str3[k]='\0';
	printf("%s\n",str3);
	
	return 0;
}