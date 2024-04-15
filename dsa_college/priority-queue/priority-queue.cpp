#include <iostream>
using namespace std;

struct Node
{
    int data;
    int priority;
    Node *next;
};

class PQ
{
    Node *front;

public:
    PQ()
    {
        front = NULL;
    }

    // Function to check if the priority queue is empty
    bool isEmpty()
    {
        return front == NULL;
    }

    void enqueue()
    {
        int data;
        int prior;
        cout << "Enter the data: ";
        cin >> data;
        cout << "Enter the priority: ";
        cin >> prior;

        Node *curr = new Node;
        curr->data = data;
        curr->priority = prior;
        curr->next = NULL;

        // If the priority priority is empty or the new element has higher priority than the front
        if (front == NULL || prior < front->priority)
        {
            curr->next = front;
            front = curr;
        }
        else
        {
            Node *temp = front;

            // Traverse the list to find the correct position to insert the new element
            while (temp->next != NULL && temp->next->priority <= prior)
            {
                temp = temp->next;
            }

            curr->next = temp->next;
            temp->next = curr;
        }
    }

    void dequeue()
    {
        if (isEmpty())
        {
            cout << "Priority Queue is empty." << endl;
            return;
        }

        Node *temp = front;
        front = front->next;
        delete temp;
    }

    void display()
    {
        if (isEmpty())
        {
            cout << "Priority Queue is empty." << endl;
            return;
        }

        Node *temp = front;
        cout << "Priority Queue elements:" << endl;
        while (temp != NULL)
        {
            cout << "Data: " << temp->data << " Priority: " << temp->priority << endl;
            temp = temp->next;
        }
    }
};

int main()
{
    PQ pq;
    int choice;
    cout << "1-enqueue, 2-dequeue, 3-display, 4-exit" << endl;

    do
    {
        cout << "Enter choice: ";
        cin >> choice;

        switch (choice)
        {
        case 1:
            pq.enqueue();
            break;
        case 2:
            pq.dequeue();
            break;
        case 3:
            pq.display();
            break;
        case 4:
            exit(0);
            break;
        default:
            cout << "Wrong choice!" << endl;
            break;
        }
    } while (1);

    return 0;
}

/*
Output
======
F:\Codes\DSA\priority-queue>a.exe
1-enqueue, 2-dequeue, 3-display, 4-exit
Enter choice: 1
Enter the data: 10
Enter the priority: 1
Enter choice: 1
Enter the data: 20
Enter the priority: 2
Enter choice: 3
Priority Queue elements:
Data: 10 Priority: 1
Data: 20 Priority: 2
Enter choice: 1
Enter the data: 50
Enter the priority: 0
Enter choice: 3
Priority Queue elements:
Data: 50 Priority: 0
Data: 10 Priority: 1
Data: 20 Priority: 2
Enter choice: 1
Enter the data: 10
Enter the priority: 6
Enter choice: 3
Priority Queue elements:
Data: 50 Priority: 0
Data: 10 Priority: 1
Data: 20 Priority: 2
Data: 10 Priority: 6
Enter choice: 2
Enter choice: 3
Priority Queue elements:
Data: 10 Priority: 1
Data: 20 Priority: 2
Data: 10 Priority: 6
Enter choice: 10
Wrong choice!
Enter choice: 4
*/