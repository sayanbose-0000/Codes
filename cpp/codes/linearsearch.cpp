//linear search
#include<iostream>
using namespace std;

void input(int [], int);
int linearsearch(int[], int);

int main(){
    int n;
    cout<<"Enter the size of array: ";
    cin>>n;

    int arr[n];
    input(arr,n);
    int ele=linearsearch(arr,n);
    cout<<"Position is: "<<ele<<" (0 index)";
    return 0;
}
void input(int arr[],int n){
    cout<<"Enter the elements:";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
}

int linearsearch(int arr[], int n){
    int ele;
    cout<<"Enter element to be searched: ";
    cin>>ele;
    for(int i=0;i<n;i++){
        if(arr[i]==ele){
            return i;
        }
    }
}