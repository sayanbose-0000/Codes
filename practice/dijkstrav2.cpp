#include <iostream>
#include <fstream>
using namespace std;
const int INF = 999;
int n;
int graph[INF][INF], sptSet[INF], dist[INF];

bool readFile () {
  ifstream myFile("dijkstra_graph.txt");
  if (!myFile) return false;
  myFile >> n;
  for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j++)
      myFile >> graph[i][j];
  return true;
}

int findMin () {
  int minIdx = -1, minVal = INF;
  for (int i = 0; i < n; i++)
    if (dist[i] < minVal && !sptSet[i])
      minVal = dist[i], minIdx = i;
  return minIdx;
}

void initialize() {
  for (int i = 0; i < n; i++)
    sptSet[i] = false, dist[i] = INF;
}

void print(int start) {
  for (int i = 0; i < n; i++)
    cout << start << "->" << i << "\t" << dist[i] << endl;
}

void dijkstra (int start) {
  initialize();

  dist[start] = 0;
  for (int i = 0; i < n; i++) {
    int u = findMin();
    sptSet[u] = true;
    for (int v = 0; v < n; v++)
      if (graph[u][v] && !sptSet[v] && dist[v] > dist[u] + graph[u][v])
        dist[v] = dist[u] + graph[u][v];
  }
  print(start);
}

int main () {
  int x = readFile();
  if (!x) {
    cout << "Error in reading file";
  }
  else {
    int start;
    cout << "Enter start vertex: ";
    cin >> start;
    dijkstra(start);
  }

  return 0;
}
