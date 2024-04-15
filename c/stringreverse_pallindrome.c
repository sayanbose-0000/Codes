//reverse a string. Pallindrome or not?
#include<stdio.h>
#include<string.h>
int main (){
	char str1[100],str2[100];
	fgets(str1,100,stdin);
	
	
	str1[strlen(str1)-1]='\0';
	
	for (int i=0;i<strlen(str1);i++){
		str2[i]=str1[strlen(str1)-i-1];
	}
	
	str2[strlen(str1)] = '\0';
	
	int i=0,count=0;
	while(str1[i]!='\0'&& str2[i]!='\0'){
		if (str1[i]==str2[i]){
			count++;
		}
		i++;
	}
	if ((count==strlen(str1)) && (count==strlen(str2))){
		printf("Pallindrome");
	}
	else {
		printf("Not pallindrome");
	}
	
	return 0;
}