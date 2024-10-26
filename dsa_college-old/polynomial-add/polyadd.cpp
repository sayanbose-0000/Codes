//polynomial addition using priority queue
#include <iostream>
using namespace std;

struct Node {
    int coeff;
    int power;
    Node *next;
};

class polynomial {
    Node *front;

public:
    polynomial(){
        front = NULL;
    }
    void enqueue(int, int);
    Node *getFront();
    void display();
};

Node *polynomial::getFront(){
    return front;
}

void polynomial::display(){
    if (front == NULL){
        cout << "power Queue is empty." << endl;
        return;
    }

    Node *temp = front;
    cout << "Result:" << endl;
    while (temp != NULL){
        cout << temp->coeff << "x^" << temp->power << "+";
        temp = temp->next;
    }
}

void polynomial::enqueue(int coeff, int power){

    Node *curr = new Node;
    curr->coeff = coeff;
    curr->power = power;
    curr->next = NULL;

    if (front == NULL || power < front->power){
        curr->next = front;
        front = curr;
    }
    else{
        Node *temp = front;

        while (temp->next != NULL && temp->next->power <= power){
            temp = temp->next;
        }

        curr->next = temp->next;
        temp->next = curr;
    }
}

void addPolynomials(polynomial p1, polynomial p2, polynomial &p3){
    Node *temp1 = p1.getFront();
    Node *temp2 = p2.getFront();

    while (temp1 != NULL && temp2 != NULL){
        if (temp1->power == temp2->power){
            int sumCoeff = temp1->coeff + temp2->coeff;
            p3.enqueue(sumCoeff, temp1->power);
            temp1 = temp1->next;
            temp2 = temp2->next;
        }
        else if (temp1->power > temp2->power){
            p3.enqueue(temp1->coeff, temp1->power);
            temp1 = temp1->next;
        }
        else{
            p3.enqueue(temp2->coeff, temp2->power);
            temp2 = temp2->next;
        }
    }

    // If there are remaining terms in p1, add them to p3
    while (temp1 != NULL){
        p3.enqueue(temp1->coeff, temp1->power);
        temp1 = temp1->next;
    }

    // If there are remaining terms in p2, add them to p3
    while (temp2 != NULL){
        p3.enqueue(temp2->coeff, temp2->power);
        temp2 = temp2->next;
    }
}

int main(){
    polynomial p1;
    int choice1;
    cout << "1-enqueue, 2-display, 3-exit" << endl;

    cout << "For polynomial 1--->" << endl;

    do{
        cout << "Enter choice: ";
        cin >> choice1;

        switch (choice1){
        case 1:
            int coeff;
            cout << "Enter ele: ";
            cin >> coeff;

            int power;
            cout << "Enter power: ";
            cin >> power;

            p1.enqueue(coeff, power);
            break;
        case 2:
            p1.display();
            cout << endl;
        case 3:
            break;
        default:
            cout << "Wrong choice!" << endl;
            break;
        }
    } while (choice1 != 3);
    
    cout<<"-----------"<<endl;
    cout << "For polynomial 2--->" << endl;

    polynomial p2;
    int choice2;
    do{
        cout << "Enter choice: ";
        cin >> choice2;

        switch (choice2){
        case 1:
            int coeff;
            cout << "Enter ele: ";
            cin >> coeff;

            int power;
            cout << "Enter power: ";
            cin >> power;

            p2.enqueue(coeff, power);
            break;
        case 2:
            p2.display();
            cout << endl;
        case 3:
            break;
        default:
            cout << "Wrong choice!" << endl;
            break;
        }
    } while (choice2 != 3);

    polynomial p3;
    addPolynomials(p1, p2, p3);
    cout<<"-----------"<<endl;
    p3.display();
    return 0;
}


/*

F:\Codes\DSA\polynomial-add>g++ polyadd.cpp

F:\Codes\DSA\polynomial-add>a.exe
1-enqueue, 2-display, 3-exit
For polynomial 1--->
Enter choice: 1
Enter ele: 2
Enter power: 3
Enter choice: 1
Enter ele: 5
Enter power: 4
Enter choice: 1
Enter ele: 2
Enter power: 1
Enter choice: 2
power Queue elements:
2x^1+2x^3+5x^4+
Enter choice: 3
-----------
For polynomial 2--->
Enter choice: 1
Enter ele: 3
Enter power: 1
Enter choice: 1
Enter ele: 5
Enter power: 3
Enter choice: 1
Enter ele: 3
Enter power: 2
Enter choice: 1
Enter ele: 3
Enter power: 6
Enter choice: 2
power Queue elements:
3x^1+3x^2+5x^3+3x^6+
Enter choice: 3
-----------
Result:
5x^1+3x^2+2x^3+5x^3+5x^4+3x^6+
F:\Codes\DSA\polynomial-add>

*/