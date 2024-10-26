#include <iostream>
#include <fstream>
using namespace std;
#define MAX 100

int n, front = -1, rear = -1;
int graph[MAX][MAX], queue[MAX];
bool visited[MAX] = {false};

bool isFull() {
  return rear == MAX-1;
}

bool isEmpty() {
  return front == -1 || front > rear;
}

void enqueue(int val) {
  if (front == -1) front = 0;
  if (!isFull()) queue[++rear] = val;
}

void dequeue() {
  if (!isEmpty()) front++;
}

int peek() {
  if (!isEmpty()) return queue[front];
}

void bfs(int start) {
  visited[start] = true;
  enqueue(start);

  while(!isEmpty()) {
    int node = peek();
    dequeue();
    cout << node << " ";
    for (int i = 0; i < n; i++) {
      if (!visited[i] && graph[node][i]) {
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
  
  int start;
  cout << "Enter starting node: ";
  cin >> start;
  bfs(start);
  
  return 0;  
}