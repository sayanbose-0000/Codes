//min and max elements of an array
#include<iostream>
using namespace std;

void input(int [], int);
int min(int [], int);
int max(int[], int);

int main(){
    int n;
    cout<<"Enter the size of array: ";
    cin>>n;

    int arr[n];
    input(arr,n);

    int min_ele=min(arr,n);
    int max_ele=max(arr,n);
    cout<<"Max element is: "<<max_ele<<endl;
    cout<<"Min element is: "<<min_ele<<endl;
    return 0;
}
void input(int arr[],int n){
    cout<<"Enter the elements:";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
}

int min(int arr[], int n){
    int ele=arr[0];
    for (int i=0;i<n;i++){
        if(arr[i]<ele){
           ele=arr[i]; 
        }
    } 
    return ele;
}

int max(int arr[], int n){
    int ele=arr[0];
    for (int i=0;i<n;i++){
        if(arr[i]>ele){
           ele=arr[i]; 
        }
    } 
    return ele;
}