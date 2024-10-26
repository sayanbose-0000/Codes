//traverse an array
#include<iostream>
using namespace std;

void input(int [], int);
void traverse(int[], int);

int main(){
    int n;
    cout<<"Enter the size of array: ";
    cin>>n;

    int arr[n];
    input(arr,n);
    traverse(arr,n);
    return 0;
}
void input(int arr[],int n){
    cout<<"Enter the elements:";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
}

void traverse(int arr[], int n){
    cout<<"The elements are: ";
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}