//strings_02-vowel consonants
#include<stdio.h>
#include<strings.h>
int main (){
	char str[100];
	gets(str);
	
	int i=0,strlength=0;
	while (str[i]!='\0'){
		strlength++;
		i++;
	}
	
	int vowel=0,consonant=0;
	for (int i=0;i<strlength;i++){
		if (str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U'||str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'){
			vowel++;
		}
		else {
			if (str[i]==32){
				continue;
			}
			else{
				consonant++;
			}
		}
	}
	printf("No of vowels are: %d\n",vowel);
	printf("No of consonants are: %d", consonant);
	
	return 0;
}