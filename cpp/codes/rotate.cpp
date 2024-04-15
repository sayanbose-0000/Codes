#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main (){
	vector<int> a={1,2,3,4,5};
	int n=a.size();
	int k=2;
	k=k%n;
	
	reverse (a.begin(),a.end());
	reverse(a.begin(),a.begin()+k);
	reverse (a.begin()+k,a.end());
	
	for (int i=0;i<n;i++){
		cout<<a[i]<<" ";
	}
	
}
