#include <iostream>
#include <fstream>
using namespace std;
#define INF 999

int n, graph[INF][INF], dist[INF];

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

bool bellmanFord(int start) {
  // initialize dist array
  for (int i = 0; i < n; i++) dist[i] = INF;

  dist[start] = 0;

  for (int i = 0; i < n; i++)
    for (int u = 0; u < n; u++)
      for (int v = 0; v < n; v++)
        if (graph[u][v] != INF && dist[v] > dist[u] + graph[u][v])
          dist[v] = dist[u] + graph[u][v];

  for (int u = 0; u < n; u++)
    for (int v = 0; v < n; v++)
      if (graph[u][v] != INF && dist[v] > dist[u] + graph[u][v]) 
        return false;

  return true;
}

void print(int start) {
  for (int i = 0; i < n; i++)
    cout << start << "->" << i << ": " << dist[i] << endl;
}

int main () {
  bool file = readFile();
  if (!file) {
    cout << "Error reading file";
    return 1;
  }
  else {
    int start;
    cout << "Enter start: ";
    cin >> start;
    int bellok = bellmanFord(start);
    if (!bellok) {
      cout << "Negative weight cycle present";
      return 1;
    }
    else {
      print(start);
    }
  }
  return 0;
}