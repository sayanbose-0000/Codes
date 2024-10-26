#include <iostream>
#include <fstream>
using namespace std;
#define MAX 100
int n, graph[MAX][MAX];
bool visited[MAX];

void dfs(int node) {
  visited[node] = true;
  cout << node << " ";
  for (int i = 0; i < n; i++) 
    if (graph[node][i] && !visited[i]) dfs(i);
}

int main () {
  ifstream myFile("graphbfs.txt");
  if (!myFile) return 1;
  myFile >> n;
  for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j++)
      myFile >> graph[i][j];
  int start;
  cout << "Enter start node: ";
  cin >> start;
  dfs(start);
  return 0;
}