////how many triple elements add up to inputted number in array
#include<iostream>
using namespace std;

int main (){
	int a[6]={3,1,2,4,0,6};
	int x,count=0;
	cout<<"Enter the sum needed ";
	cin>>x;
	
	for (int i=0;i<=6;i++){
		for (int j=i+1;j<=6;j++){
			for (int k=j+1;j<=6;j++){
				if (a[i]+a[j]+a[k]==x){
					count++;
				}
			}
		}
	}
	cout<<"The no of occurences of the sum is "<<count;
	return 0;
}
