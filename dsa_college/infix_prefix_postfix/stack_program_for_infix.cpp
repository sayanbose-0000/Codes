// stack_program_for_infix.cpp
#include <iostream>
using namespace std;
#define MAX 100
class Stack
{
private:
    int top;
    char stack[MAX];

public:
    Stack() { top = -1; } // constructor

    int isEmpty();
    int isFull();
    void push(char);
    void pop();
    void display();
    int peek();
};

int Stack::isEmpty()
{
    if (top == -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int Stack::isFull()
{
    if (top >= MAX - 1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

void Stack::push(char val)
{
    if (isFull())
    {
        cout << "Overflow" << endl;
        return;
    }
    else
    {
        stack[++top] = val;
        return;
    }
}

void Stack::pop()
{
    if (isEmpty())
    {
        cout << "Underflow" << endl;
        return;
    }
    else
    {
        top--;
    }
}

void Stack::display()
{
    if (isEmpty())
    {
        cout << "Stack is Empty" << endl;
        return;
    }
    else
    {
        cout << "The elements are: " << endl;
        for (int i = top; i >= 0; i--)
        {
            cout << stack[i] << " ";
        }
        cout << endl;
    }
}

int Stack::peek()
{
    if (isEmpty())
    {
        cout << "Empty" << endl;
        return -1;
    }
    else
    {
        return stack[top];
    }
}
