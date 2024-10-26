//checks the last position of an inputed integer in a vector
#include<iostream>
#include<vector>
using namespace std;

int main (){
	vector<int> vec;
	cout<<"Enter the vector "<<endl;
	for (int i=0;i<5;i++){		//taking input
		int ele;
		cin>>ele;
		vec.push_back(ele);
	}	
	
	cout<<"The vector is";
	for (int i=0;i<vec.size();i++){		//giving output
		cout<<vec[i];
	}	
	cout<<endl;
	int x,occ=-1;	//actual code
	/*cout<<"Enter occ of last element";
	cin>>x;
	for (int i=0;i<vec.size();i++){
		if(x==vec[i]){
			occ=i;
		}
	}*/
	
	cout<<"Enter occ of last element";
	cin>>x;
	for (int i=vec.size();i>0;i--){
		if(x==vec[i]){
			cout<<"Position is "<<i;
			break;
		}
	}
	return 0;
}
