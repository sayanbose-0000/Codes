//largest among three elements using ternary(a.k.a conditional) operator
#include<stdio.h>
int main(){
	int a,b,c;
	printf("Enter a,b,c ");
	scanf("%d%d%d",&a,&b,&c);
	
	(a>b&&a>c)?printf("%d is greatest",a):(b>a&&b>c)?printf("%d is greatest",b):(c>a&&c>b)?printf("%d is greatest",c):printf("Two/more nos are equal");

	return 0;
}
