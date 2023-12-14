/*calculates 2ndlargest no in array. 
	low time complexity	*/
#include<iostream>
#include<climits>
using namespace std;

	int great(int[],int);
	
	int main(){
    int a[7]={2,3,5,7,6,1,7};
		int idx=great(a,7);		//function returns index of largest no
		int m=a[idx];


		for (int i=0;i<7;i++){		//largest element replaces by minimum value
			if (m==a[i]){
				a[i]=INT_MIN;
			}
		}			


		int idx2=great(a,7);	//again function runs, here, largest element is 2nd largest of original array
		cout<<"Second largest element is "<<a[idx2]<<endl;
		
		return 0;
	}

	int great(int a[],int size){
    	int min=INT_MIN,x;
    	for (int i=0;i<size;i++){
    		if (min<a[i]){
    			min=a[i];
				x=i;	
				}
    	}
    return x;
}
