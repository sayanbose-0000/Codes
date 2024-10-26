#include <iostream>
#include <fstream>
using namespace std;
#define MAX 100
int n, dist[MAX], graph[MAX][MAX];
bool sptSet[MAX];

int minEle() {
  int minVal = 999, minIdx = -1;
  for (int i = 0; i < n; i++) {
    if (dist[i] < minVal && !sptSet[i]) {
      minVal = dist[i];
      minIdx = i;
    }
  }
  return minIdx;
}

void print(int start) {
  for (int i = 0; i < n; i++) {
    cout << start << "->" << i << "\t " << dist[i] << endl;
  }
}

void dijkstra(int start) {
  // initialize
  for (int i = 0; i < n; i++) {
    dist[i] = 999; // infinity
    sptSet[i] = false;
  }

  dist[start] = 0;
  for (int i = 0; i < n; i++) {
    int u = minEle();
    sptSet[u] = true;

    for (int v = 0; v < n; v++) {
      if (graph[u][v] && !sptSet[v] && dist[u] + graph[u][v] < dist[v]) {
        dist[v] = dist[u] + graph[u][v];
      }
    }
  }

  print(start);
}

int main () {
  ifstream myFile ("dijkstra_graph.txt");
  if (!myFile) {
    cout << "Err reading file";
    return 1;
  }

  myFile >> n;

  for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j++)
      myFile >> graph[i][j];

  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        cout << graph[i][j] << " ";
    }
    cout << endl;
}


  myFile.close();

  int start;
  cout << "Enter starting vertex: ";
  cin >> start;

  dijkstra(start);
}