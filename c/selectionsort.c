//selection sort
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
		int min_idx=i;
		for (int j=i+1;j<n;j++){
			if (arr[j]<arr[min_idx]){
				min_idx=j;
			}
		}
		if (min_idx!=i){
			int temp=arr[min_idx];
			arr[min_idx]=arr[i];
			arr[i]=temp;
		}
	}
	
	for (int i=0;i<n;i++){
		printf("%d ",arr[i]);
	}
	
	
	return 0;
}