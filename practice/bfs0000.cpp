#include <iostream>
#include <fstream>
using namespace std;
#define MAX 100
int n;
int graph[MAX][MAX];
int queue[MAX];
int visited[MAX] = {false};
int front = -1, rear = -1;

bool isEmpty () {
  return front == -1 || front > rear;
}

bool isFull () {
  return rear == n-1;
}

void enqueue (int val) {
  if (front == -1) front = 0;

  if (!isFull()) {
    queue[++rear] = val;
  }
}

int dequeue() {
  if (!isEmpty()) {
    return queue[front++];
  }
}

void bfs (int start) {
  enqueue(start);
  visited[start] = true;

  while (!isEmpty()) {
    int node = dequeue();
    cout << node << " ";
    for (int i = 0; i < n; i++) {
      if (graph[node][i] && visited[i] != true) {
        visited[i] = true;
        enqueue(i);
      }
    }
  }
}

int main () {
  ifstream myFile("graphbfs.txt");

  myFile >> n;

  for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j++)
      myFile >> graph[i][j];

  bfs(0);
}