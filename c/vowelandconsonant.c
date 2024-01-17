// how many vowels and consonants are there in an array
#include<stdio.h>
int main (){
	int n,vowel=0,consonant=0;
	printf("Enter array size");	
	scanf("%d",&n);
	char a[n];

	for (int i=0;i<n;i++){
		scanf(" %c",&a[i]); //space ensures that enter pressed doesnot come inside array
	}
	
	for (int i=0;i<n;i++){
		if (a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'){
			vowel++;
		}
		else {
			consonant++;
		}
	}

	printf("Vowels= %d ",vowel);
	printf("Consonants= %d",consonant);
return 0;
}
