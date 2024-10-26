#include <iostream>
using namespace std;
#define MAX 4
int bagSize = 60;
int profit[MAX], weight[MAX];
float ratio[MAX], ans[MAX];

void initialize () {
  profit[0] = 280;
  profit[1] = 100;
  profit[2] = 120;
  profit[3] = 120;
  
  weight[0] = 40;
  weight[1] = 10;
  weight[2] = 20;
  weight[3] = 24;
  
  for (int i = 0; i < MAX; i++) {
    ratio[i] = weight[i] / profit[i];
  }
}

void bubbleSort() {
  for (int i = 0; i < MAX; i++) {
    for (int j = 0; j < MAX-i-1; j++) {
      if (ratio[j] < ratio[j+1]) {
        int temp1 = ratio[j];
        int temp2 = profit[j];
        int temp3 = weight[j];

        ratio[j] = ratio[j+1];
        profit[j] = profit[j+1];
        weight[j] = weight[j+1];

        ratio[j+1] = temp1;
        profit[j+1] = temp2;
        weight[j+1] = temp3;
      }
    }
  }
}

void knapsack () {
  for (int i = 0; i < bagSize; i++) {
    if (bagSize < weight[i]) {
      ans[i] = (bagSize * 1.0) / weight[i];
      break;
    }
    ans[i] = 1;
    bagSize = bagSize - weight[i];
  }
}

void print () {
  for (int i = 0; i < MAX; i++) cout << ans[i] << " ";
}

int main () {
  initialize();
  bubbleSort();
  knapsack();
  print();

  return 0;
}