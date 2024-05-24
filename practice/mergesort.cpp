#include <iostream>
using namespace std;

void merge (int arr[], int low, int mid, int high) {
  int i = low, j = mid+1, k = low;
  int x[100];

  while (i <= mid && j <=high) {
    if (arr[j] < arr[i]) {
      x[k++] = arr[j++];
    }
    else {
      x[k++] = arr[i++];
    }
  }

  while (i <= mid) x[k++] = arr[i++];

  while (j <= high) x[k++] = arr[j++];

  for (int m = low; m <= high; m++) arr[m] = x[m];

  return;
}

void mergeSort (int arr[], int low, int high) {
  if (low < high) {
    int mid = (low + high) / 2;
    mergeSort (arr, low, mid);
    mergeSort (arr, mid+1, high);
    merge (arr, low, mid, high);
  }
}

int main () {
  int n;
  cout << "Enter size: ";
  cin >> n;

  int arr[n];

  for (int i = 0; i < n; i++) cin >> arr[i];


  mergeSort(arr, 0, n-1); 
  for (int i = 0; i < n; i++) cout << arr[i] << " ";

  return 0;
}