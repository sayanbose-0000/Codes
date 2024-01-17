//solves the quadratic formula
#include<stdio.h>
#include<math.h> 

int main ()	{
	float a,b,c,disc;  	  			   
	printf("A quadratic equation is of the form ax^2+bx+c\n");
	printf("Enter a");
	scanf("%f",&a);
	printf("Enter b");
	scanf("%f",&b);
	printf("Enter c");
	scanf("%f",&c);
	disc=(b*b)-(4*a*c);
	printf("Discriminant is %.2f \n",disc);

	if(disc>0){
		float r1=(-b+sqrt(disc))/(2*a);
		float r2=(-b-sqrt(disc))/(2*a);
		printf("Real and distinct roots: %.2f, %.2f",r1,r2);
	}

	else if(disc==0){
		float r3=(-b)/(2*a);
		printf("Real and equal roots: %.2f, %.2f",r3,r3);
	}
	
	else {
		float re=(-b)/(2*a);
		float img=(sqrt(-(disc)))/(2*a);
		printf("Imaginary roots: %.2f+%.2fi, %.2f-%.2fi",re,img,re,img);
	}
	
	return 0;
}
