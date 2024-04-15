//Find the sum s=1+x+(x^2/2!)+(x^3/3!)+ ... n terms
#include<stdio.h>
#include<math.h>
int main (){
	float n,x;
	printf("Enter x ");
	scanf("%f",&x);
	printf("Enter no of terms ");
	scanf("%f",&n);
	float sum=0,fact=1;
	sum=sum+1;
	for (int i=1;i<=(n-1);i++){
		fact=fact*i;
		sum=sum+(pow(x,i)/fact);
	}
	printf("%.2f",sum);
	return 0;
}
