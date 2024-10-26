#include <iostream>
using namespace std;
struct Node
{
    Node *lchild;
    int data;
    Node *rchild;
};
class BST
{
    Node *root;

public:
    BST()
    {
        root = NULL;
    }
    Node *getRoot()
    {
        return root;
    }
    void insert(int);
    void preorderTraversal(Node *);
    void inorderTraversal(Node *);
    void postorderTraversal(Node *);
    bool search(int);
    void remove(int);
    int findSmallestElement(Node *);
    int findLargestElement(Node *);
    int totalNodes(Node *);
    int totalExternalNodes(Node *);
    int totalInternalNodes(Node *);
    int Height(Node *);
};

void BST::insert(int value)
{
    Node *curr = new Node;
    curr->lchild = NULL;
    curr->data = value;
    curr->rchild = NULL;
    if (root == NULL)
    {
        root = curr;
        return;
    }
    Node *temp = root;
    Node *parent;
    while (temp != NULL)
    {
        parent = temp;
        if (value < temp->data)
        {
            temp = temp->lchild;
        }
        else if (value > temp->data)
        {
            temp = temp->rchild;
        }
        else
        { // if value==temp->data
            cout << "Input data is already present!" << endl;
            return;
        }
    }
    if (value < parent->data)
    {
        parent->lchild = curr;
    }
    else // value>parent->data
    {
        parent->rchild = curr;
    }
}

void BST::preorderTraversal(Node *r)
{
    if (r == NULL)
    {
        return;
    }
    else
    {
        cout << r->data << " ";
        preorderTraversal(r->lchild);
        preorderTraversal(r->rchild);
    }
}

void BST::inorderTraversal(Node *r)
{
    if (r == NULL)
    {
        return;
    }
    else
    {
        inorderTraversal(r->lchild);
        cout << r->data << " ";
        inorderTraversal(r->rchild);
    }
}

void BST::postorderTraversal(Node *r)
{
    if (r == NULL)
    {
        return;
    }
    else
    {
        postorderTraversal(r->lchild);
        postorderTraversal(r->rchild);
        cout << r->data << " ";
    }
}

bool BST::search(int key)
{
    Node *temp = root;
    if (root == NULL)
    {
        return 0;
    }
    while (temp != NULL)
    {
        if (temp->data == key)
        {
            return 1; // returns 1 if found
        }
        else if (key < temp->data)
        {
            temp = temp->lchild;
        }
        else
        { // key>temp->data;
            temp = temp->rchild;
        }
    }
    return 0; // returns 0 if not found
}

void BST::remove(int key) // there is another smaller way to do it given in the copy...check it
{
    if (root == NULL)
    {
        cout << "Element not found!" << endl;
        return;
    }

    Node *current = root;
    Node *parent = NULL;

    // Search for the node to delete and keep track of its parent
    while (current != NULL && current->data != key)
    {
        parent = current;
        if (key < current->data)
        {
            current = current->lchild;
        }
        else
        {
            current = current->rchild;
        }
    }

    if (current == NULL)
    {
        cout << "Element not found!" << endl;
        return;
    }

    // Case 1: Node to delete has no children
    if (current->lchild == NULL && current->rchild == NULL)
    {
        if (current == root)
        {
            delete root;
            root = NULL;
        }
        else if (parent->lchild == current)
        {
            delete parent->lchild;
            parent->lchild = NULL;
        }
        else
        {
            delete parent->rchild;
            parent->rchild = NULL;
        }
        return;
    }

    // Case 2: Node to delete has one child
    if (current->lchild == NULL || current->rchild == NULL)
    {
        Node *child = (current->lchild != NULL) ? current->lchild : current->rchild;
        if (current == root)
        {
            delete root;
            root = child;
        }
        else if (parent->lchild == current)
        {
            delete parent->lchild;
            parent->lchild = child;
        }
        else
        {
            delete parent->rchild;
            parent->rchild = child;
        }
        return;
    }

    // Case 3: Node to delete has two children
    Node *successor = current->rchild;
    Node *parent_successor = current;

    while (successor->lchild != NULL)
    {
        parent_successor = successor;
        successor = successor->lchild;
    }

    current->data = successor->data;

    if (parent_successor == current)
    {
        current->rchild = successor->rchild;
    }
    else
    {
        parent_successor->lchild = successor->rchild;
    }

    delete successor;
}

int BST::findSmallestElement(Node *root)
{
    if (root == NULL)
    {
        cout << "The tree is empty." << endl;
        return -1;
    }
    Node *current = root;
    while (current->lchild != NULL)
    {
        current = current->lchild;
    }
    return current->data;
}

int BST::findLargestElement(Node *root)
{
    if (root == NULL)
    {
        cout << "The tree is empty." << endl;
        return -1;
    }
    Node *current = root;
    while (current->rchild != NULL)
    {
        current = current->rchild;
    }
    return current->data;
}

int BST::totalNodes(Node *r)
{
    if (r == NULL)
    {
        return 0;
    }
    else
    {
        return (totalNodes(r->lchild) + totalNodes(r->rchild) + 1);
    }
}

int BST::totalExternalNodes(Node *r)
{
    if (r == NULL)
        return 0;
    if (r->lchild == NULL && r->rchild == NULL)
        return 1;
    else
        return (totalExternalNodes(r->lchild) + totalExternalNodes(r->rchild));
}

int BST::totalInternalNodes(Node *r)
{
    if (r == NULL)
        return 0;
    if (r->lchild == NULL && r->rchild == NULL)
        return 0;
    else
        return (totalInternalNodes(r->lchild) + totalInternalNodes(r->rchild) + 1);
}

int BST::Height(Node *r)
{
    if (r == NULL)
    {
        return 0;
    }
    else
    {
        int leftHeight = Height(r->lchild);
        int rightHeight = Height(r->rchild);
        return (leftHeight > rightHeight) ? leftHeight + 1 : rightHeight + 1; // ternary operator
    }
}

int main()
{
    BST tree;
    int choice;
    cout << "1: Insert, 2:PreOrder, 3-InOrder, 4-PostOrder, 5-Search, 6-remove, 7- Smallest Element, 8-Largest element, 9- Total Nodes, 10- Internal Nodes, 11-External Nodes, 12-height. 13-EXIT!!" << endl;
    do
    {
        cout << endl;
        cout << "Enter choice: ";
        cin >> choice;
        switch (choice)
        {
        case 1:
            int data;
            cout << "Enter data: ";
            cin >> data;
            tree.insert(data);
            break;
        case 2:
            tree.preorderTraversal(tree.getRoot());
            break;
        case 3:
            tree.inorderTraversal(tree.getRoot());
            break;
        case 4:
            tree.postorderTraversal(tree.getRoot());
            break;
        case 5:
            int key;
            cout << "Enter the data to be searched: ";
            cin >> key;
            bool found;
            found = tree.search(key);
            found ? cout << "Data Found" : cout << "Data not found"; // ternary operator
            break;
        case 6:
            int data1;
            cout << "Enter data to be deleted: ";
            cin >> data1;
            tree.remove(data1);
            break;
        case 7:
            int small;
            small = tree.findSmallestElement(tree.getRoot());
            cout << "The smallest element is: " << small << endl;
            break;
        case 8:
            int large;
            large = tree.findLargestElement(tree.getRoot());
            cout << "The largest element is: " << large << endl;
            break;
        case 9:
            int tN;
            tN = tree.totalNodes(tree.getRoot());
            cout << "Total No of Nodes are: " << tN << endl;
            break;
        case 10:
            int iN;
            iN = tree.totalInternalNodes(tree.getRoot());
            cout << "Total No of Internal Nodes are: " << iN << endl;
            break;
        case 11:
            int eN;
            eN = tree.totalExternalNodes(tree.getRoot());
            cout << "Total No of External Nodes are: " << eN << endl;
            break;
        case 12:
            int h;
            h = tree.Height(tree.getRoot());
            cout << "Height of tree is: " << h << endl;
            break;
        case 13:
            exit(0);
            break;
        default:
            cout << "Wrong choice!" << endl;
            break;
        }
    } while (1);
}

/*

OUTPUT
======
F:\Codes\DSA\binary_search_tree>a.exe
1: Insert, 2:PreOrder, 3-InOrder, 4-PostOrder, 5-Search, 6-remove, 7- Smallest Element, 8-Largest element, 9- Total Nodes, 10- Internal Nodes, 11-External Nodes, 12-height. 13-EXIT!!

Enter choice: 1
Enter data: 10

Enter choice: 1
Enter data: 5

Enter choice: 1
Enter data: 15

Enter choice: 1
Enter data: 3

Enter choice: 1
Enter data: 7

Enter choice: 2
10 5 3 7 15
Enter choice: 3
3 5 7 10 15
Enter choice: 4
3 7 5 15 10
Enter choice: 5
Enter the data to be searched: 5
Data Found
Enter choice: 5
Enter the data to be searched: 100
Data not found
Enter choice: 6
Enter data to be deleted: 5

Enter choice: 2
10 7 3 15
Enter choice: 1
Enter data: 5

Enter choice: 7
The smallest element is: 3

Enter choice: 8
The largest element is: 15

Enter choice: 9
Total No of Nodes are: 5

Enter choice: 6
Enter data to be deleted: 1
Element not found!

Enter choice: 10
Total No of Internal Nodes are: 3

Enter choice: 11
Total No of External Nodes are: 2

Enter choice: 12
Height of tree is: 4

Enter choice: 13

F:\Codes\DSA\binary_search_tree>
*/