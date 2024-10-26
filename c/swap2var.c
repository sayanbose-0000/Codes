//swap without 3rd variable
#include<stdio.h>
int main (){
	int a,b,c=0;
	printf("Enter a and b\n");
	scanf("%d",&a);
	scanf("%d",&b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf("The number a is %d and b is %d",a,b);
	return 0;
}
