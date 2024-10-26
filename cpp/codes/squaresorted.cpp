//Given array in non-decrasing order. Return an array of the squares of each no sorted in non decreasing order

#include<iostream>
using namespace std;

void squarearr(int [],int,int []);
void sortarr(int [],int,int[]);

int main (){
	int n;
	cout<<"Enter array size: ";
	cin>>n;
	int a[n];
	for (int i=0;i<n;i++){
		cin>>a[i];
	}
	int new_arr[n];
  
	squarearr(a,n,new_arr);
	sortarr(a,n,new_arr);
  
	for (int i=0;i<n;i++){
		cout<<new_arr[i]<<" ";
	}
  
	return 0;
 }

void squarearr(int a[],int size,int new_a[]){
	for (int i=0;i<size;i++){
		new_a[i]=a[i]*a[i];
	}
	return;
}

void sortarr(int a[],int size,int new_a[]){
	for (int i=0;i<size-1;i++){
		int flag=0;
		for (int j=0;j<size-i-1;j++){
			if (new_a[j]>new_a[j+1]){
				int temp=new_a[j];
				new_a[j]=new_a[j+1];
				new_a[j+1]=temp;
				flag=1;
			}
		}
		if (flag==0){
		break;
		}
	}
	return;
}
