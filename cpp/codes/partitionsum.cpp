/*  	->check if an array can be partitioned such that subarray have same sum
	->this also means that the prefix sum of 1st subarray==suffix sum of 2nd array
	->subarrys may not be of equal size	*/
#include<iostream>
using namespace std;
int tot_sum(int [],int);

int main (){
	int n;
	cout<<"Enter array size: ";
	cin>>n;
	int a[n];
	for (int i=0;i<n;i++){	//input array
		cin>>a[i];
	}
	int totsum=tot_sum(a,n);
	
	int sfx_sum=0,pfx_sum=0,count=0;
		
	for (int i=0;i<n;i++){				//actual code
		sfx_sum=sfx_sum+a[i];			
		pfx_sum=(totsum-sfx_sum);
		
		if(sfx_sum==pfx_sum){
			cout<<"Possible ";
			count++;
		}
		
	}
	if (count==0){
		cout<<"Not possible ";
	}
	return 0;
}

int tot_sum(int a[],int size){		//total sum of all elements of array
	int sum=0;
	for (int i=0;i<size;i++){
		sum=sum+a[i];
	}
	return sum;
}