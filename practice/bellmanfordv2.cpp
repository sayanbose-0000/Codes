#include <iostream>
#include <fstream>
using namespace std;
const int INF = 999;
int graph[INF][INF], dist[INF], n;

bool readFile() {
  ifstream myFile("bf.txt");
  if (!myFile) return false;

  myFile >> n;
  for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j++)
      myFile >> graph[i][j];

  myFile.close();
  return true;
}

bool bellmanFord (int start) {
  for (int i = 0; i < n; i++) dist[i] = INF;

  dist[start] = 0;

  for (int i = 0; i < n; i++)
    for (int u = 0; u < n; u++)
      for (int v = 0; v < n; v++)
        if (graph[u][v] && dist[v] > dist[u] + graph[u][v])
          dist[v] = dist[u] + graph[u][v];

  for (int u = 0; u < n; u++) 
    for (int v = 0; v < n; v++)
      if (dist[v] > dist[u] + graph[u][v]) return false;

  return true;
}

void print (int start) {
  for (int i = 0; i < n; i++) {
    cout << start << "->" << i << "\t" << dist[i] << endl;
  }
}

int main () {
  if (!readFile()) {
    cout << "Error reading file";
  }
  else {
    int start;
    cout << "Enter start: ";
    cin >> start;
    int y = bellmanFord(start);
    if (!y) {
      cout << "There is a negative weight cycle";
    }
    else {
      cout << "Answer is:" << endl;
      print(start);
    }
  }
  return 0;
}