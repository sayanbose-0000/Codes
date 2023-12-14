//difference of the sum of odd and even places of a vector
#include<iostream>
#include<vector>
using namespace std;

int main (){
	vector<int> vec;
	for (int i=0;i<5;i++){
		int ele;
		cin>>ele;
		vec.push_back(ele);
	}
	int sum_odd=0,sum_even=0;
	for (int i=0;i<vec.size();i++){
		if (i%2==0){
			sum_odd=sum_odd+vec[i];
		}
		else{
			sum_even=sum_even+vec[i];
		}
	}
	int diff=sum_odd-sum_even;
	if (diff >=0){
		cout<<"The answer is "<<diff;
	}
	else{
		cout<<"The answer is "<<-diff;
	}

	return 0;
}
