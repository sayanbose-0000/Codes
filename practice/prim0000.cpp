#include <iostream>
#include <fstream>
using namespace std;

#define MAX 100
int n;
int graph[MAX][MAX], mstSet[MAX], parent[MAX], key[MAX];

void initialize() {
  for (int i = 0; i < n; i++) 
    mstSet[i] = false, parent[i] = -1, key[i] = MAX;
}

int findMin() {
  int minIdx = -1, minVal = MAX;
  for (int i = 0; i < n; i++) {
    if (minVal > key[i] && !mstSet[i]) {
      minVal = key[i];
      minIdx = i;
    }
  }
  return minIdx;
}

void print() {
  int sum = 0;
  for (int i = 0; i < n; i++) {
    if (parent[i] != -1) {
      cout << parent[i] << "->" << i << "  " << key[i] << endl;
      sum += key[i];
    }
  }
  cout << "Sum is: " << sum; 
}

void prim(int start) {
  key[start] = 0;

  for (int i = 0; i < n; i++) {
    int u = findMin();
    mstSet[u] = true;
    for (int v = 0; v < n; v++) {
      if (graph[u][v] && !mstSet[v] && key[v] > graph[u][v]) {
        parent[v] = u;
        key[v] = graph[u][v];
      }
    }
  }

  print();
}

int main () {
  ifstream myFile("prim_graph.txt");
  if (!myFile) {
    cout << "Error opening file!!" << endl;
    return 1;
  }

  myFile >> n;

  for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j++)
      myFile >> graph[i][j];

  initialize();
  prim(0);

  return 0;
}