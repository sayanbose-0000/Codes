//normal stack
#include <iostream>
using namespace std;
#define MAX 100
class Stack{
    private:
        int top;
        int stack[MAX];

    public:
        Stack() { top = -1; } // constructor

        int isEmpty();
        int isFull();
        void push(int);
        void pop();
        void display();
        int peek();
};

int Stack::isEmpty(){
    if(top==-1){
        return 1;
    }
    else{
        return 0;
    }
}

int Stack::isFull(){
    if(top>=MAX-1){
        return 1;
    }
    else{
        return 0;
    }
}


void Stack::push(int val){
    if(isFull()){
        cout<<"Overflow"<<endl;
        return;
    }
    else{
        stack[++top]=val;
        return;
    }
}

void Stack::pop(){
    if(isEmpty()){
        cout<<"Underflow"<<endl;
        return;
    }
    else{
        cout<<"Popped: "<<stack[top]<<endl;
        top--;
    }
}

void Stack::display(){
    if(isEmpty()){
        cout<<"Stack is Empty"<<endl;
        return;
    }
    else{
        cout<<"The elements are: "<<endl;
        for (int i=top;i>=0;i--){
            cout<<stack[i]<<" ";
        }
        cout<<endl;
    }
}

int Stack::peek(){
    if(isEmpty()){
        cout<<"Empty"<<endl;
    }
    else{
        return stack[top];
    }
}
int main(){
    Stack s;
    int choice;
    int x;
    do{
        cout<<"Enter choice: 1-Push, 2-Pop, 3-seek, 4-display, 5-quit........:  ";
        cin>>choice;
        switch(choice){
            case 1:
                int val;
                cout<<"Enter element to be inserted: ";
                cin>>val;
                s.push(val);
                break;
            case 2:
                s.pop();
                break;
            case 3:
                x=s.peek();
                cout<<"The poped element is: "<<x<<endl;
                break;
            case 4:
                s.display();
                break;
            case 5:
                exit(0);
                break;
            default:
                cout<<"Wrong input...Type Again"<<endl;
                break;
        }
    } while(1); //do this while true

    return 0;
}