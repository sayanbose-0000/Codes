#include <iostream>
using namespace std;

int binarySearch(int[], int , int, int);

int main() {
  int n;
  cout << "Enter size: ";
  cin >> n;

  int arr[n];
  cout << "Enter array: ";
  for (int i = 0; i < n; i++)
    cin >> arr[i];

  int find;
  cout << "Enter value to be searched: ";
  cin >> find;

  int res = binarySearch(arr, find, 0, n-1);

  res == -1 ? cout << "Value not found" : cout << "Value is at pos(0-indexed): " << res;

  return 0;
}

int binarySearch(int arr[], int find, int left, int right) {
  if (left > right) 
    return -1;

  int mid = left + (right-left)/2;

  if (find == arr[mid])
    return mid;

  if (find < arr[mid])
    return binarySearch(arr, find, left, mid-1);

  if (find > arr[mid])
    return binarySearch(arr, find, mid+1, right);
}