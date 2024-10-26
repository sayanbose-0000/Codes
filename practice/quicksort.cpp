#include <iostream>
using namespace std;

int partition(int arr[], int low, int high) {
  int i = low - 1, pivot = arr[high];

  for (int j = low; j < high; j++) {
    if (arr[j] < pivot) {
      i++;
      swap (arr[i], arr[j]);
    }
  }

  i++;
  swap(arr[high], arr[i]);
  pivot = arr[i];

  return i;
}

void quickSort(int arr[], int low, int high) {
  if (low < high) {
    int p = partition(arr, low, high);
    quickSort(arr, low, p-1);
    quickSort(arr, p+1, high);
  }
}

int main () {

  int n;
  cout << "Enter size: ";
  cin >> n;
 
  int arr[n];

  cout << "Enter array: ";
  for (int i = 0; i < n; i++) cin >> arr[i];

  quickSort(arr, 0, n-1);

  for (int i = 0; i < n; i++) cout << arr[i] << " ";

  return 0;
}