//how many couple elements add up to inputted number in array
#include<iostream>
using namespace std;

int main (){
	int a[5]={3,4,6,7,1};
	int x,count=0;
	cout<<"Enter the sum needed ";
	cin>>x;
	
	for (int i=0;i<=5;i++){
		for (int j=i+1;j<=5;j++){
			if (a[i]+a[j]==x){
				count++;
			}
		}
	}
	cout<<"The no of occurences of the sum is "<<count;
	return 0;
}
