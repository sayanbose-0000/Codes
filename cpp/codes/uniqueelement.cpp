//finds the element that has occured only once in array
#include<iostream>
using namespace std;

int main (){
	int a[7]={2,3,1,3,2,4,1};
	
	for (int i=0;i<7;i++){
		int count=0;
		for (int j=0;j<7;j++){
			if (a[i]==a[j]&&(i!=j)){
				count++;
			}
		}
		if (count==0){
			cout<<"Unrepeated element is "<<a[i];
			break;
		}
	}
	return 0;
}
