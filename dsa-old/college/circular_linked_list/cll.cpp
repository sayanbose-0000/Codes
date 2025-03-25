//circular linked list
//addBeg, addEnd, delBeg, delEnd, delAny, forward traverse, backward traverse

#include<iostream>
using namespace std;

struct Node{
	int data;
	Node *next;
};

class CLL{
	Node *last;
	
	public:
		CLL(){ //constructor
			last=NULL;
		}
		
		void addBeg();
		void addEnd();
		void delBeg();
		void delEnd();
		void display();
};

void CLL::addBeg(){
	Node *curr=new Node;

	int value;
	cout<<"Enter the item to be inserted: ";
	cin>>value;
	
	curr->data=value;
	
	if(last==NULL){  //when the list is empty
		curr->next=curr;
		last=curr;
		return;
	}
	
	curr->next=last->next;
	last->next=curr;
	return;
}

void CLL::addEnd(){
	Node *curr=new Node;
	
	int value;
	cout<<"Enter the item to be inserted: ";
	cin>>value;

	curr->data=value;
	
	if(last==NULL){
		curr->next=curr;
		last=curr;
		return;	
	}
	
	curr->next=last->next;
	last->next=curr;
	last=curr;
	return;
	
}

void CLL::delBeg(){
	if (last==NULL){
		cout<<"List is Empty!"<<endl;
		return;
	}
	Node *temp=last;
	temp=temp->next;
	last->next=temp->next;
	delete temp;
	
}

void CLL::delEnd(){
	Node *temp=last;
	if (last==NULL){
		cout<<"Empty!"<<endl;
		return;
	}

	while(temp->next!=last){
		temp=temp->next;
	}
	temp->next=last->next;
	delete last;
	last=temp;
}

void CLL::display(){
	Node *temp=last;
	if(last==NULL){
		cout<<"List is Empty!"<<endl;
		return;
	}
	
	temp=temp->next;
	while(temp!=last){
		cout<<temp->data<<" ";
		temp=temp->next;
	}
	cout<<temp->data;
	cout<<endl;
}


int main(){
	CLL cll;
	int choice;
	cout<<"1- addBeg, 2-addEnd, 3-delBeg, 4-delEnd, 5-display, 6-exit: "<<endl;
	do{
		cout<<"Enter choice: ";
		cin>>choice;
		switch(choice){
			case 1:
				cll.addBeg();
				break;
			case 2:
				cll.addEnd();
				break;
			case 3:
				cll.delBeg();
				break;
			case 4:
				cll.delEnd();
				break;
			case 5:
				cll.display();
				break;
			case 6:
				exit(0);
				break;
			default:
				cout<<"Wrong Choice"<<endl;
				break;
		}
	}while(1);
return 0;
}

/*
Output
======
F:\Codes\DSA\circular-linked-list>g++ cll.cpp

F:\Codes\DSA\circular-linked-list>a.exe
1- addBeg, 2-addEnd, 3-delBeg, 4-delEnd, 5-display, 6-exit: 
Enter choice: 1
Enter the item to be inserted: 10
Enter choice: 1
Enter the item to be inserted: 20
Enter choice: 5
20 10
Enter choice: 2
Enter the item to be inserted: 30
Enter choice: 5
20 10 30
Enter choice: 3
Enter choice: 5
10 30
Enter choice: 4
Enter choice: 5
10
Enter choice: 10
Wrong Choice
Enter choice: 6
*/
