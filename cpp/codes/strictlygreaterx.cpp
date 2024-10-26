//no of elements strictly greater than inputed element in vector
#include<iostream>
#include<vector>
using namespace std;

int main (){
	vector<int> vec={1,2,3,4,5,6};
	
	int count=0,great;
	cout<<"Enter element to be searched ";
	cin>>great;
	for (int i=0;i<vec.size();i++){
		if(vec[i]>great){
			count++;
		}
	}
	cout<<count<<endl;
	return 0;
}
