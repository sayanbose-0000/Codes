#include <iostream>
#include <set>
using namespace std;
#define MAX 4
char board[MAX][MAX];
set <int> cols;
set <int> posDiag;
set <int> negDiag;

void initialize () {
  for (int i = 0; i < MAX; i++)
    for (int j = 0; j < MAX; j++)
      board[i][j] = '.';
}


void print () {
  cout << "Possible sol: " << endl;
  for (int i = 0; i < MAX; i++) {
    for (int j = 0; j < MAX; j++) {
      cout << board[i][j] << " ";
    }
    cout << endl;
  }
  cout << endl;
}

void nqueen (int r) {
  if (r == MAX) {
    print();
    return;
  }

  for (int c = 0; c < MAX; c++) {
    if (cols.count(c) > 0 || posDiag.count(r+c) > 0 || negDiag.count(r-c) > 0) 
      continue;

    cols.insert(c);
    posDiag.insert(r+c);
    negDiag.insert(r-c);
    board[r][c] = 'Q';

    nqueen(r+1);

    cols.erase(c);
    posDiag.erase(r+c);
    negDiag.erase(r-c);
    board[r][c] = '.';
  }
} 

int main () {
  initialize();
  nqueen(0);
}