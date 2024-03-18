#include <stdio.h>
#include <stdlib.h>

// node list
struct Node {
  char data;
  struct Node *next;
};

void insert(char val, int i, struct Node **head, int *arr[]) {
  struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
  newNode->data = val;
  newNode->next = NULL;

  // 0 notes initially
  if (*head == NULL) {
    *head = newNode;
    arr[i] = *head;
  } else {
    // atleast one node initially
    struct Node *temp = *head;
    while (temp->next != NULL) {
      temp = temp->next;
    }
    temp->next = newNode;
  }
}

int main() {
  FILE *fp;
  fp = fopen("ex.txt", "r");  // reading file

  if (fp == NULL) {  // no file in specified location
    printf("Error reading file!");
    return 0;
  }

  int n;
  fscanf(fp, "%d", &n);  // reads the first character of the file and stores in variable 'n'

  int graph[n][n];

  // reading rest of the graph, excluding first character which was already read
  // and adding it to graph array
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      fscanf(fp, "%d", &graph[i][j]);
    }
  }

  // printing the stored graph
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      printf("%d ", graph[i][j]);
    }
    printf("\n");
  }

  // reading total no of degrees. Equal to number of 1's in the graph
  int degrees = 0;
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      if (graph[i][j] == 1) {
        degrees++;
      }
    }
  }
  printf("No of degrees are: %d \n", degrees);

  int edges = degrees / 2;
  printf("No of edges: %d\n", edges);

  // writing out the vertices that are adjacent to each vertex
  for (int i = 0; i < n; i++) {
    printf("%c -> ", i + 65);
    for (int j = 0; j < n; j++) {
      if (graph[i][j] == 1) {
        printf("%c ", j + 65);
      }
    }
    printf("\n");
  }

  // array to store address of head node
  struct Node *arr[n];

  // adjacency matrix creation
  for (int i = 0; i < n; i++) {
    struct Node *head = NULL;
    for (int j = 0; j < n; j++) {
      char ch = j + 65;
      if (graph[i][j] == 1) {
        insert(ch, i, &head, arr);
      }
    }
  }

  // printing out adjacency matrix
  for (int i = 0; i < n; i++) {
    printf("%c -> ", i + 65);
    struct Node *temp = arr[i];
    while (temp != NULL) {
      printf("%c ", temp->data);
      temp = temp->next;
    }
    printf("\n");
  }

  fclose(fp);

  return 0;
}
