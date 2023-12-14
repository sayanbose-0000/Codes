//find the sum s=1+3+5+....n terms
#include<stdio.h>
int main (){
	int n,sum=0;
	printf("Enter last term ");
	scanf("%d",&n);
	for (int i=1;i<=n;i++){
		if(i%2==0){
			continue;
		}
		else{
			sum=sum+i;	//CSSV
		}
	}
	printf("Sum is %d",sum);
return 0;
}
