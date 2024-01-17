//calculates 2nd largest element in array
#include<stdio.h>
int main (){
	int n;
	printf("Enter size of array ");
	scanf("%d",&n);
	int a[n];
	
	for (int i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	
	int min,min2;
	if (a[0]<a[1]){
		min=a[0];
		min2=a[1];
	}
	else{
		min=a[1];
		min2=a[0];
	}
	
	int temp;
	
	for (int i=2;i<n;i++){
		if (a[i]<min){
			temp=min;
			min=a[i];
			min2=temp;
		}
		else if(a[i]>min && a[i]<min2){
			min2=a[i];
		}
	}
	printf("The smallest no is %d\n",min);
	printf("Second smallest no is %d",min2);
	return 0;
}