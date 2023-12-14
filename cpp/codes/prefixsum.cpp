//prefix sum: [5,4,1,2,3]=[5,5+4,5+4+1,5+4+1+2,5+4+1+2+3]=[5,9,10,12,15]
#include<iostream>
using namespace std;
int main (){
	int n;
	cout<<"Enter array size ";
	cin>>n;
	int a[n];
	
	for (int i=0;i<n;i++){
		cin>>a[i];
	}
	
	for (int i=1;i<n;i++){
		a[i]=a[i]+a[i-1];
	}
	
	for (int i=0;i<n;i++){
		cout<<a[i]<<" ";
	}
	
	return 0;
}