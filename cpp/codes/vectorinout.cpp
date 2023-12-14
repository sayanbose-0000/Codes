//basic input and output of vector
#include<iostream>
#include<vector>
using namespace std;

int main (){
	vector<int> vec;
	for (int i=0;i<5;i++){		//taking input
		int ele;
		cin>>ele;
		vec.push_back(ele);
	}	
	
	for (int i=0;i<vec.size();i++){		//giving output
		cout<<vec[i];
	}	
	
	return 0;
}
