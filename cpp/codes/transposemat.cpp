//transpose of a matrix
#include<iostream>
using namespace std;
int main (){
	int m,n;
	cout<<"Enter no of rows and columns: ";
	cin>>m>>n;
	int a[m][n],b[n][m];
	
	for (int i=0;i<m;i++){
		for (int j=0;j<n;j++){
			cin>>a[i][j];
		}
	}
	
	for (int i=0;i<m;i++){
		for (int j=0;j<n;j++){
			b[j][i]=a[i][j];
		}
	}
	
	cout<<"Transpose is: "<<endl;
	for (int i=0;i<n;i++){
		for (int j=0;j<m;j++){
			cout<<b[i][j]<<"\t";
		}
		cout<<endl;
	}
}