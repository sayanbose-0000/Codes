//converts an array from lower case to uppercase
#include<stdio.h>
int main (){
	int n,vowel=0,consonant=0;
	printf("Enter array size");	
	scanf("%d",&n);
	char a[n];

	for (int i=0;i<n;i++){
		scanf(" %c",&a[i]); //space ensures that enter pressed doesnot come inside array
	}

	for(int j=0;j<n;j++){
		if (a[j]>='a'&&a[j]<='z'){
			printf("%c",a[j]-32);
		}
		else {
			printf("%c",a[j]);
		}
	}

return 0;
}
