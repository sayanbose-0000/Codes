//binary search
#include<stdio.h>
int main (){
	int n;
	scanf("%d",&n);
	int a[n];
	for (int i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	int l=0,r=n-1;
	
	int x;
	printf("Enter element to be searched ");
	scanf("%d",&x);
	
	while(l<=r){
		int m=(l+r)/2;
		if (a[m]==x){
			printf("Element found at position %d",m);
			break;
		}
		else if(a[m]>x){
			r=m-1;
		}
		else {
			l=m+1;
		}
	}
	return 0;
}