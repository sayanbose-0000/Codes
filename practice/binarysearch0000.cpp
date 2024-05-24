#include <iostream>
using namespace std;

int binarysearch(int arr[], int left, int right, int find) {
  if (left > right) return -1;
  int mid = (left + right) / 2;
  if (find == arr[mid]) return mid;
  if (find < arr[mid]) return binarysearch(arr, left, mid-1, find);
  if (find > arr[mid]) return binarysearch(arr, mid+1, right, find);
}

int main () {
  int n;
  cout << "Enter size: ";
  cin >> n;
  int arr[n];
  cout << "Enter array: ";
  for (int i = 0; i < n; i++) cin >> arr[i];
  int find;
  cout << "Enter find: ";
  cin >> find;
  int x = binarysearch(arr, 0, n-1, find);
  if (x != -1) {
    cout << "Found at: " << x;
  }
  else {
    cout << "Not found!";
  }
}