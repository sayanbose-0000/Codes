#include<iostream>
using namespace std;

class DSet {
  private:
    int *parent;
    int *rank;

  public:
    DSet (int n) {
      parent = new int[n];
      rank = new int[n];
      for (int i = 0; i < n; i++) {
        parent[i] = -1;
        rank[i] = 1; // I had started rank with 0, they did with 1
      }
    }

    int findUltimateParent (int node) {
      if (node == parent[node]) return;
      return parent[node] = findUltimateParent(parent[node]);
    }

    void union(int u, int v) {
      int u_ult = findUltimateParent(u), v_vlt = findUltimateParent(v); // u_ult & v_ult is ultimate parent of u & v
      if (rank[u_ult] < rank[v_ult])  parent[u_ult] = v_ult;
      if (rank[u_ult] > rank[v_ult])  parent[v_ult] = u_ult;
      else {
        parent[v_ult] = u_ult;
        rank[u_ult] += 1;
      }
    }
};

class Graph {
  private:
    vector < vector<int> > edgeList;
    int v;
  public:
    Graph(int v) {
      this->v = v;
    }

    void addEdge (w , x, y) { // w is weight, x and y the edges
      edgeList.push_back({w, x, y}); // weight is also pusbed so that we can sort it using that;
    }

    void kruskal () {
      sort(edgeList.begin(), edgeList.end());

      DSet s(v);
    }
}