//sort an array such hat even numbers come first and then odd numbers(relative order doesnot matter)
#include<iostream>
#include<algorithm>
using namespace std;
void sortz(int[] ,int);

int main (){
  int n;
  cout<<"Enter array size: ";
  cin>>n;

  int a[n];
  for (int i=0;i<n;i++){
    cin>>a[i];
  }
  sortz(a,n);
  for (int i=0;i<n;i++){
    cout<<a[i];
  }
  return 0;
}

void sortz(int a[],int size){
  int ptr_l=0, ptr_r=(size-1);
  while (ptr_l<ptr_r){
    if(a[ptr_l]%2==1 && a[ptr_r]%2==0){
      swap(a[ptr_l],a[ptr_r]);
      ptr_l++;
      ptr_r--;
    }

    if (a[ptr_l]%2==0){
      ptr_l++;
    }

    if (a[ptr_r]%2==1){
      ptr_r--;
    }
    
  }

  return ;
}
