#include <iostream>
using namespace std;
#define MAX 7
#define MAXDEADLINE 6

int profit[MAX], deadline[MAX], visites[MAX], res[MAXDEADLINE] = {0};
bool visited[MAX] = {false};

void initialize();
void bubbleSort();
void jobSequencing();

int main () {
  initialize();
  bubbleSort();
  jobSequencing();
}

void initialize() {
  profit[0] = 200;
  profit[1] = 500;
  profit[2] = 600;
  profit[3] = 300;
  profit[4] = 200;
  profit[5] = 400;
  profit[6] = 150;

  deadline[0] = 3;
  deadline[1] = 2;
  deadline[2] = 1;
  deadline[3] = 6;
  deadline[4] = 2;
  deadline[5] = 4;
  deadline[6] = 2;
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
  for (int i = 0; i < MAXDEADLINE; i++) {
    int min = min > 
    for (int j = min)
  }
}