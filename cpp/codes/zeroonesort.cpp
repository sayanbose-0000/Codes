//sort an array which has only zero and one as their element
#include<iostream>
using namespace std;

int main (){
	int n;
	cout<<"Enter array size: ";
	cin>>n;
	int a[n];
	for (int i=0;i<n;i++){
    cin>>a[i];
	}
  
	int count_zero=0,count_one=0;
  
	int zero=0;int one=1;
	for (int i=0;i<n;i++){
		if (a[i]==zero){
			count_zero++;
		}
		if (a[i]==one){
			count_one++;
		}
	}


	for (int i=0;i<count_zero;i++){
		a[i]=0;
	}
	for (int i=count_zero;i<count_one+count_zero;i++){
		a[i]=1;
	}

	for (int i=0;i<n;i++){
	cout<<a[i];
	}
  
	return 0;
 }
