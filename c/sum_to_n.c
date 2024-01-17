//sum=1+2+3+...n
#include<stdio.h>
int main (){
	float n,sum=0;
	printf("Enter the number n ");
	scanf ("%f",&n);
	for (int i=0;i<=n;i++){
	sum=sum+i;
	}
	printf("Sum is %.2f", sum);
	return 0;
}
