//call by value and call by reference
#include<iostream>
using namespace std;
void meow(int &, int &);

int main (){
	int x=9,y=5;
	meow(x,y);
	cout<<x<<" "<<y;
}
void meow(int &a,int &b){
	int temp=a;
	a=b;
	b=temp;
}