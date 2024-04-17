#include<iostream>
#include<fstream>
using namespace std;

int main () {
    ifstream myFile('graph2.txt');

    if (!myFile) {
        cout << "Graph can't be opened!" << endl;
        return 1;
    }

    int n;
    myFile >> n; // size of the graph

    int graph[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            myFile >> graph[i][j]
        }
    }

    myFile.close();

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << myFile;
        }
        cout << endl;
    }

    int adjacent[n];

    // for (int i = 0; i < n; i++) {
    //     for (int j = i+1; j < n; j++) {
    //         adjacent[i];
    //     }
    // }

}