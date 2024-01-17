#include<iostream>
using namespace std;

void input(int arr[],int n){
	for (int i=0; i<n; i++){
		cin>>arr[i];
	}
}

void output(int arr[],int n){
	for (int i=0; i<n; i++){
		cout<<arr[i]<<" ";
	}
}

void selectionSort(int arr[],int n){
	int count=0;
	for (int i=0; i<n-1;i++){
		int minIdx=i;
		for (int j=i+1;j<n;j++){
			if (arr[j]<arr[minIdx]){
				minIdx=j;
			}
		}
		if(minIdx!=i){
			int temp;
			temp=arr[minIdx];
			arr[minIdx]=arr[i];
			arr[i]=temp;
			cout<<endl;
		}
		count++;
		cout<<"Pass #"<<count;
		output(arr,n);
		cout<<endl;
	}
	cout<<endl;
	cout<<"Final Selection Sort Result: ";
	output(arr,n);
	cout<<endl;
}

void bubbleSort(int arr[],int n){
	int count=0;
	for (int i=0;i<n-1;i++){
		int flag=0;
		for (int j=0;j<n-i-1;j++){
			if(arr[j+1]<arr[j]){
				int temp;
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
				count++;
				cout<<"Pass #"<<count<<":";
				output(arr,n);
				cout<<endl;
			}
		}
		if (flag==0){
			break;
		}
	}
	cout<<"Final Bubble Sort Result: ";
	output(arr, n);
	cout<<endl;
	cout<<endl;
}


//fix the count of this
void insertionSort(int arr[], int n){
	int count=0;
	count++;
	for (int i=1;i<n;i++){
		int key=arr[i];
		int j=i-1;
		while(j>=0&&arr[j]>key){
			arr[j+1]=arr[j];
			j--;
			
		}
		arr[j+1]=key;

	}
	cout<<"Pass #"<<count<<": ";
	output(arr,n);
	cout<<endl;
}

int main (){
	int n;
	cout<<"Enter the size of the array: ";
	cin>>n;
	int arr[n];
	
	cout<<"Enter the elements: ";
	input(arr,n);
	
	
	cout<<"1-Selection Sort, 2-Bubble Sort, 3-Insertion Sort"<<endl;
	do{
		int choice;
		cout<<"Enter choice: ";
		cin>>choice;
		
		switch(choice){
			case 1:
				selectionSort(arr,n);
				exit(0);
				break;
			case 2:
				bubbleSort(arr,n);
				exit(0);
				break;
			case 3:
				insertionSort(arr,n);
				exit(0);
				break;
			default:
				cout<<"Wrong Input"<<endl;
				break;
		}
	} while(1);


	return 0;
}

