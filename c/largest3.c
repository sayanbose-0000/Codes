//finds the largest among 3 elements
#include<stdio.h>
int main (){
	int a,b,c;
	printf("Enter 3 nos");
	scanf("%d%d%d",&a,&b,&c);
	if(a>b&&a>c){
		printf("%d is greatest",a);
	}
	
	else if(b>c&&b>a){
		printf("%d is greatest",b);
	}

	else if(c>a&&c>b){
		printf("%d is greatest",c);
	}
	
	else {
		printf("Two/more nos are equal");
	}
return 0;
}
