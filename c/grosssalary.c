#include<stdio.h>
int main (){
	float base,da,hra,gross;
	printf("Enter basic salary ");
	scanf("%f",&base);
	da=(35.0/100)*base;
	hra=(15.0/100)*base;
	gross=base+da+hra;
	printf("%.2f",gross);
	return 0;  
}
