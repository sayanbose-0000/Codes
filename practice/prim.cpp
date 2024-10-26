#include <iostream>
#include <fstream>
using namespace std;
#define MAX 100
int n, graph[MAX][MAX], parent[MAX], key[MAX]; // parent stores parent element's name, key stores path btwn parent and curr node
bool mstSet[MAX];

int findMin() {
  int minIdx = -1, minVal = 9999;

  for (int i = 0; i < n; i++) {
    if (key[i] < minVal && !mstSet[i]) {
     minVal = key[i];
     minIdx = i;
    }
  }
  return minIdx;
}

void print() {
  int sum = 0;
  for (int i = 1; i < n; i++) {
    cout << parent[i] << "->" << i << "\t" << graph[i][parent[i]] << endl;
    sum += graph[i][parent[i]];
  }
  cout << "MST cost is: " << sum;
}

void prim(int start) {
  
  // initialize
  for (int i = 0; i < n; i++) {
    parent[i] = -1;
    key[i] = 9999;
    mstSet[i] = false;
  }

  key[start] = 0;

  for (int i = 0; i < n; i++) {
    int u = findMin();
    mstSet[u] = true;
    for (int v = 0; v < n; v++) {
      if (graph[u][v] && !mstSet[v] && graph[u][v] < key[v]) {
        parent[v] = u;
        key[v] = graph[u][v];
      }
    }
  }

  print();
}

int main() {
  ifstream myFile("prim_graph.txt");
  if (!myFile) {
    cout << "Error opening file!";
    return 1;
  }

  myFile >> n;

  for (int i = 0; i < n; i++) 
    for (int j = 0; j < n; j++)
      myFile >> graph[i][j];

  myFile.close();

  int start;
  cout << "Enter start index: ";
  cin >> start;

  if (start < 0 || start >= n) {
    cout << "Invalid start!";
  }
  else {
    prim(start);
  }

  return 0;

}
