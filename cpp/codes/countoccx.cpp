//how many times an element has occured in a vector
#include<iostream>
#include<vector>
using namespace std;

int main (){
	vector<int> vec={1,2,3,2,1};
	
	int search,count=0;
	cout<<"Enter element to be searched ";
	cin>>search;
	for (int i=0;i<vec.size();i++){
		if(search==vec[i]){
			count++;
		}
	}
	cout<<count<<endl;
}