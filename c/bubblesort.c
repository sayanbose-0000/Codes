//bubble sort
#include<stdio.h>
int main (){
	int n;
	printf("Enter n: ");
	scanf("%d",&n);
	int arr[n];
	
	for (int i=0;i<n;i++){
		scanf("%d",&arr[i]);
	}
	
	for (int i=0;i<n-1;i++){
		int flag=0;
		for (int j=0;j<n-i-1;j++){
			if(arr[j+1]<arr[j]){
				flag=1;
				int temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
		}
		if (flag==0){
			break;
		}
	}
	
	for (int i=0;i<n;i++){
		printf("%d ",arr[i]);
	}
	
	
	return 0;
}