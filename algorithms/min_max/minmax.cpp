// Min-Max, merge and quick sort algorithm using Divide and Conquer approach 
#include<iostream>
using namespace std;

int Min;
int Max;
  
void MinMax(int arr[], int i, int j){
  int Max1,Min1;
  if (i == j){ // only one element
    Min=arr[i];
    Max=arr[i];
  }
  
  else if (i+1 == j){ // only 2 elements
    if (arr[j] > arr[i]){
      Min = arr[i];
      Max = arr[j];
    }
    else{
      Min = arr[j];
      Max = arr[i]; 
    }
  }
  
  else{ // more than 2 elements
    int mid = (i+j)/2;
    
    MinMax(arr, i, mid);
    
    Max1=Max;
    Min1=Min;
    
    MinMax(arr, mid+1, j);
    
    Max = (Max>Max1) ? Max : Max1;
    Min = (Min<Min1) ? Min : Min1;
  }
}

int main(){
  int n;
  cout<<"Enter n: ";
  cin>>n;
  int arr[n];
  
  for (int i=0; i<n; i++){
    cin >> arr[i];
  }
  
  
  MinMax(arr, 0, n-1);
  cout<<"Min element is: " << Min <<endl;
  cout<<"Max element is: " << Max <<endl;
  
  return 0;
}

/*

Output

D:\sayan\Codes\algorithms\min_max>g++ minmax.cpp

D:\sayan\Codes\algorithms\min_max>a.exe
Enter n: 5
-96 4 55 -62 59
Min element is: -96
Max element is: 59

*/