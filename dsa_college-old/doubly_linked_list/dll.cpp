//double linked list
//addBeg, addEnd, delBeg, delEnd, delAny, forward traverse, backward traverse

#include<iostream>
using namespace std;

struct Node{
	Node *prev;
	int data;
	Node *next;
};

class DLL{
	Node *head;
	
	public:
		DLL(){ //constructor
			head=NULL;
		}
		
		void addBeg();
		void addEnd();
		void delBeg();
		void delEnd();
		void delAny();
		void forwardTraverse();
		void backwardTraverse();
};

void DLL::addBeg(){
	int value;
	cout<<"Enter the item to be inserted: ";
	cin>>value;
	
	Node *curr=new Node;
	curr->data=value;
	curr->prev=NULL;
	curr->next=head;
	if (head!=NULL){
		head->prev=curr;
	}
	head=curr;
}

void DLL::addEnd(){
	int value;
	cout<<"Enter the item to be inserted: ";
	cin>>value;
	Node *curr=new Node;
	curr->data=value;
	curr->next=NULL;
	 if (head==NULL){
	 	curr->prev=NULL;
	 	head=curr;
	 	return;
	 }
	 Node *temp=head;
	 
	 while (temp->next!=NULL){
	 	temp=temp->next;
	 }
	 temp->next=curr;
	 curr->prev=temp;
	 return;
}

void DLL::delBeg(){
	if (head==NULL){
		cout<<"List is Empty!"<<endl;
		return;
	}
	Node *temp=head;
	head=head->next;
	if (head!=NULL){
		head->prev=NULL;
	}
	delete temp;
}

void DLL::delAny(){
	if (head==NULL){
		cout<<"List is Empty!"<<endl;
		return;
	}
	int key;
	cout<<"Enter element to be deleted: ";
	cin>>key;
	Node *temp=head;
	while(temp!=NULL){
		if(temp->data==key){
			if(temp==head){
				delBeg();
				return;
			}
			else if(temp->next==NULL){
				delEnd();
				return;
			}
			else{
				temp->prev->next=temp->next;
				temp->next->prev=temp->prev;
				delete temp;
				return;
			}	
		}
		temp=temp->next;
	}
	cout<<"Empty!"<<endl;
}

void DLL::delEnd(){
	if (head==NULL){
		cout<<"Empty!"<<endl;
		return;
	}

	 if (head->next == NULL) {
        delete head;
        head = NULL;
        return;
    }

	Node *temp=head;
	while(temp->next->next!=NULL){
		temp=temp->next;
	}
	delete temp->next;
	temp->next=NULL;
}

void DLL::forwardTraverse(){
	Node *temp=head;
	if(head==NULL){
		cout<<"List is Empty!"<<endl;
		return;
	}
	while(temp!=NULL){
		cout<<temp->data<<" ";
		temp=temp->next;
	}
	cout<<endl;
}

void DLL::backwardTraverse(){
	Node *temp=head;
	if(head==NULL){
		cout<<"Empty"<<endl;
		return;
	}
	while(temp->next!=NULL){
		temp=temp->next;
	}
	while(temp!=NULL){
		cout<<temp->data<<" ";
		temp=temp->prev;
	}
	cout<<endl;
}


int main(){
	DLL dll;
	int choice;
	cout<<"1- addBeg, 2-addEnd, 3-delBeg, 4-delEnd, 5-delAny, 6-forwardTraverse, 7-backwardTraverse, 8-exit: ";
	do{
		cout<<"Enter choice: ";
		cin>>choice;
		switch(choice){
			case 1:
				dll.addBeg();
				break;
			case 2:
				dll.addEnd();
				break;
			case 3:
				dll.delBeg();
				break;
			case 4:
				dll.delEnd();
				break;
			case 5:
				dll.delAny();
				break;
			case 6:
				dll.forwardTraverse();
				break;
			case 7:
				dll.backwardTraverse();
				break;
			case 8:
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
PS F:\Codes\DSA\doubly-linked-list> g++ dll.cpp
PS F:\Codes\DSA\doubly-linked-list> ./a.exe
1- addBeg, 2-addEnd, 3-delBeg, 4-delEnd, 5-delAny, 6-forwardTraverse, 7-backwardTraverse, 8-exit: Enter choice: 1
Enter the item to be inserted: 10
Enter choice: 1
Enter the item to be inserted: 20
Enter choice: 1
Enter the item to be inserted: 30
Enter choice: 6
30 20 10      
Enter choice: 2
Enter the item to be inserted: 50
Enter choice: 2
Enter the item to be inserted: 60
Enter choice: 6
30 20 10 50 60 
Enter choice: 7
60 50 10 20 30 
Enter choice: 10
Wrong Choice
Enter choice: 3
Enter choice: 6
20 10 50 60
Enter choice: 4
Enter choice: 6
20 10 50
Enter choice: 5
Enter element to be deleted: 10
Enter choice: 6
20 50
Enter choice: 8
PS F:\Codes\DSA\doubly-linked-list>
*/
