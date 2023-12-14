//prints the fibonacci sequence
#include<stdio.h>
int main (){
	int a=1,b=1,n,sum=0;
	scanf("%d",&n);
	printf("%d ",a);
	printf("%d ",b);
	for (int i=2;i<n;i++){
		sum=a+b;
		printf("%d ",sum);
		a=b;
		b=sum;
		
	}
return 0;  
}
