//calculates 2nd largest element in array
#include<iostream>
using namespace std;

int main (){
	int n;
	cout<<"Enter size of array ";
	cin>>n;
	int a[n];
	
	for (int i=0;i<n;i++){
		cin>>a[i];
	}
	
	int max,max2;
	if (a[0]>a[1]){
		max=a[0];
		max2=a[1];
	}
	else{
		max=a[1];
		max2=a[0];
	}
	
	int temp;
	
	for (int i=2;i<n;i++){
		if (a[i]>max){
			temp=max;
			max=a[i];
			max2=temp;
		}
		else if(a[i]<max && a[i]>max2){
			max2=a[i];
		}
	}
	cout<<"Largest no is "<<max<<endl;
	cout<<"Second largest no is "<<max2;
	return 0;
}