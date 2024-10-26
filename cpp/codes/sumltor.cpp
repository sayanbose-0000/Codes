//calculating the sum of values of array btwn position l and r. 1-base indexing
#include<iostream>
using namespace std;
int sumquerry(int [],int,int,int);

int main (){
	int n;
	cout<<"Enter array size: ";
	cin>>n;
	int arr[n];
	
	for (int i=0;i<n;i++){
		cin>>arr[i];
	}
	int l,r;
	cout<<"ENter l and r: ";
	cin>>l>>r;
	
	cout<<sumquerry(arr,n,l,r);
}

int sumquerry (int a[], int size,int l,int r){
	int sum=0;
	for (int i=1;i<l-r-1;i++){
		sum=sum+a[i];
	}
	
	return sum;
	
}