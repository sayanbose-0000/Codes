#include <iostream>
using namespace std;
#define MAX 4
#define SIZE 60

int profit[MAX], weight[MAX]; // ratio[i] = profit[i] / weight[i]
float ratio[MAX], res[MAX] = {0.0};

void initialize ();
void bubbleSort ();
void fractionalKnapsack ();
void printRes ();

int main () {
  initialize();
  bubbleSort();
  fractionalKnapsack();
  printRes();
  return 0;
}

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
    ratio[i] = profit[i] / weight[i];
  } 
}

void bubbleSort () {
  for (int i = 0; i < MAX - 1; i++) {
    for (int j = 0; j < MAX - i - 1; j++) {
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

void fractionalKnapsack () {
  int currWeight = SIZE;

  for (int i = 0; i < MAX; i++) {
    if (currWeight < weight[i]) {
      res[i] = currWeight*1.0 / weight[i];
      break;
    }
    res[i] = 1;
    currWeight -= weight[i];
  }
}

void printRes () {
  for (int i = 0; i < MAX; i++) cout << res[i] << " ";
}