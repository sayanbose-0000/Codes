#include <iostream>
using namespace std;

void minmax(int[], int, int, int&, int&);

int main () {
  int n;
  cout << "Enter size: ";
  cin >> n;

  int arr[n];
  cout << "Enter array: ";
  for (int i = 0; i < n; i++) cin >> arr[i];

  int min, max;
  minmax(arr, 0, n-1, min, max);

  cout << "Min: " << min << " and max is: " << max;

  return 0;
}

void minmax(int arr[], int i, int j, int &min, int &max) {
  if (i == j) min = max = arr[i];

  else if (i+1 == j) {
    if (arr[i] < arr[j]) min = arr[i], max = arr[j];
    else min = arr[j], max = arr[i];
  }

  else {
    int mid = i + (j-i)/2;
    int min1, min2, max1, max2;
    minmax(arr, i, mid, min1, max1);
    minmax(arr, mid+1, j, min2, max2);
    max = (max2 > max1) ? max2 : max1;
    min = (min2 < min1) ? min2 : min1;
  }
}