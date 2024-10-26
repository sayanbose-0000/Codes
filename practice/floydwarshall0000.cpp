#include <iostream>
#include <fstream>
using namespace std;
#define MAX 100
int n;
int graph[MAX][MAX], dist[MAX][MAX];

bool readFile() {
  ifstream myFile("fw.txt");
  if (!myFile) {
    return false;
  }

  myFile >> n;

  for (int i = 0; i < n; i++) 
    for (int j = 0; j < n; j++)
      myFile >> graph[i][j];

  return true;
}

void print () {
  for (int i = 0; i < n; i++) {
    for (int j = 0 ; j < n; j++) {
      cout << dist[i][j] << " ";
    }
    cout << endl;
  }
  cout << endl;
}

void floydwarshall() {
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      dist[i][j] = graph[i][j];
    }
  }

  for (int k = 0; k < n; k++) {
    for (int i = 0 ; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (dist[i][j] > dist[i][k] + dist[k][j]) {
          dist[i][j] = dist[i][k] + dist[k][j];
        }
      }
    }
  }
}

int main() {
  bool x =  readFile();
  if (!x) {
    cout << "Error reading file";
  }
  else {
    floydwarshall();
    print();
  }
}