#include <iostream>
#include <fstream>
using namespace std;
#define MAX 100
int n;
int graph[MAX][MAX], mstSet[MAX], parent[MAX], key[MAX];

bool readFile() {
  ifstream myFile("prim_graph.txt");
  if (!myFile) return false;
  myFile >> n;
  for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j++)
      myFile >> graph[i][j];
  myFile.close();
  return true;
}

void initialize() {
  for (int i = 0; i < n; i++)
    key[i] = MAX, mstSet[i] = false, parent[i] = -1;
}

int findMin() {
  int minVal = MAX, minIdx = -1;
  for (int i = 0; i < n; i++)
    if (minVal > key[i] && !mstSet[i])
      minVal = key[i], minIdx = i;
  return minIdx;
}

void print () {
  int sum = 0;
  for (int i = 0; i < n; i++) {
    if (parent[i] != -1) {
      cout << parent[i] << "->" << i << "\t" << key[i] << endl;
      sum += key[i];
    }
  }
  cout << "MST cost is: " << sum;
}

void prim(int start) {
  initialize();

  key[start] = 0;
  for (int i = 0; i < n; i++) {
    int u = findMin();
    mstSet[u] = true;
    for (int v = 0; v < n; v++) 
      if (graph[u][v] && !mstSet[v] && key[v] > graph[u][v])
        key[v] = graph[u][v], parent[v] = u;
  }

  print();
}

int main () {
  int x = readFile();
  if (!x) {
    cout << "Error reading file!";
  }
  else {
    int start;
    cout << "Enter start: ";
    cin >> start;
    prim(start);
  }

  return 0;
}