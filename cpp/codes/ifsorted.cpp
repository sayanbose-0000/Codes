//checks if vector is sorted or not
#include<iostream>
#include<vector>
using namespace std;

int main (){
	cout<<"Enter the elements of the array "<<endl;
	vector<int> vec;
	for (int i=0;i<5;i++){		//take input
		int ele;
		cin>>ele;
		vec.push_back(ele);
	}
	int count=0;
	for (int i=1;i<vec.size();i++){		//actual code
		if (vec[i]>vec[i-1]){
			count++;
		}
	}
	if(count==vec.size()-1){
		cout<<"The array is sorted ";
	}
	else {
		cout<<"The array is not sorted";
	}
	return 0;
}
