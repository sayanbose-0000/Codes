#include <iostream>
#include <algorithm>
using namespace std;
#define MAX 5

int profit[MAX], deadline[MAX], res[MAX] = {-1};
bool slot[MAX] = {false};

void initialize();
void bubbleSort();
void jobSequencing();
void printJobSequencing();

int main () {
  initialize();
  bubbleSort();
  jobSequencing();
  printJobSequencing();
}

void initialize() {
  profit[0] = 100;
  profit[1] = 19;
  profit[2] = 27;
  profit[3] = 25;
  profit[4] = 15;

  deadline[0] = 2;
  deadline[1] = 1;
  deadline[2] = 2;
  deadline[3] = 1;
  deadline[4] = 3;
}

void bubbleSort() {
  for (int i = 0; i < MAX-1; i++) {
    for (int j = 0; j < MAX-i-1; j++) {
      if (profit[j] < profit[j+1]) {
        int temp1 = profit[j];
        int temp2 = deadline[j];

        profit[j] = profit[j+1];
        deadline[j] = deadline[j+1];

        profit[j+1] = temp1;
        deadline[j+1] = temp2;
      }
    }
  }
}

void jobSequencing() {
  for (int i = 0; i < MAX; i++) {
    for (int j = min(MAX, deadline[i])-1; j >= 0; j--) {
      if (!slot[j]) {
        res[j] = i;
        slot[j] = true;
        break;
      }
    }
  }
}

void printJobSequencing() {
  for (int i = 0; i < MAX; i++) {
    if (slot[i]) cout << res[i] << " ";
  }
  cout << endl;
}