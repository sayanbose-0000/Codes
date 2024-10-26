//singly linked list
#include<iostream>
using namespace std;

struct Node{
	int data;
	struct Node *next;
};

class LinkedList{
	Node *head;
	
	public:
		LinkedList(){ //constructor
			head=NULL;
		}
		
		void addBeg();
		void addEnd();
		void display();
		void delBeg();
		void delEnd();
		int search(int);
		void reverse();
		void bubbleSort();
		
		~LinkedList(){ 	// destructor=> deletes entire linked list
			Node *temp=head;
			while(temp!=NULL){
				head=head->next;
				delete temp;
				temp=head;
			}
		}
};



void LinkedList::addBeg(){
	int item;
	Node *curr=new Node;
	cout<<"Enter value to be inserted: ";
	cin>>item;
	
	curr->data=item;
	curr->next=head;
	
	head=curr;
	return;
}



void LinkedList::addEnd(){
	Node *curr=new Node;
	int item;
	cout<<"Enter value to be inserted: ";
	cin>>item;
	
	curr->data=item;
	curr->next=NULL;
	
	if(head==NULL){
		head=curr;
		return;
	}
	
	Node *temp=head;
	while(temp->next!=NULL) {
		temp=temp->next;
	}
	temp->next=curr;
}



void LinkedList::display(){
	if(head==NULL){
		cout<<"Empty List"<<endl;
		return;
	}
	struct Node *temp=head;
	
	while(temp!=NULL){
		cout<<temp->data<<" ";
		temp=temp->next;
	}
	cout<<endl;
}



void LinkedList::delBeg(){
	struct Node *temp=head;
	if (head==NULL){
		cout<<"Empty"<<endl;
		return;
	}
	head=head->next;
	delete temp;
}



void LinkedList::delEnd(){
	Node *temp=head;
	if (head==NULL){
		cout<<"Empty"<<endl;
		return;
	}

	while (temp->next->next!=NULL){
		temp=temp->next;
	}

	delete temp->next;
	temp->next=NULL;
}


int LinkedList::search(int item){
	if(head==NULL){
		cout<<"Empty"<<endl;
		return 0;
	}
	Node *temp=head;
	while(temp!=NULL){
		if(temp->data==item) {
			return 1;
		}
		temp=temp->next;
	}
	return 0;
}


// void LinkedList::reverse(){
// 	Node *prv=NULL, *curr=head, *nxt=NULL;
// 	while(curr!=NULL){
// 		nxt=curr;
// 		curr=curr->next;
// 		nxt->next=prv;
// 		prv=nxt;
// 	}
// 	head=nxt;
// }

//			OR

void LinkedList::reverse(){
	Node *prv=NULL;
	Node *curr;
	Node *nxt=NULL;
	while(curr!=NULL){
		nxt=curr->next;
		curr->next=prv;
		prv=curr;
		curr=nxt;
	}
}

// 			OR



void LinkedList::bubbleSort(){
	if(head==NULL){
		cout<<"Empty List"<<endl;
		return;
	}
	Node *temp, *last=NULL;
	int flag;
	do{
		flag=0;
		temp=head;	
		while(temp->next!=NULL){
			if (temp->data > temp->next->data){
				int x=temp->data;
				temp->data=temp->next->data;
				temp->next->data=x;
				flag=1;
			}
			temp=temp->next;
		}
		last=temp;
	} while(flag==1);
}



int main (){
	int choice;
	LinkedList ll;
	cout<<"1-addBeg, 2-addEnd, 3-display, 4-delBeg, 5-delEnd 6-search, 7-reverse, 8-bubbleSort, 9-exit"<<endl;
	do{
		cout<<"Enter your choice: ";
		cin>>choice;
		switch(choice){
			case 1:
				ll.addBeg();
				break;
			case 2:
				ll.addEnd();
				break;
			case 3:
				ll.display();
				break;
			case 4:
				ll.delBeg();
				break;
			case 5:
				ll.delEnd();
				break;
			case 6:
				int key;
				cout<<"Enter element to be searched: ";
				cin>>key;
				int m;
				m=ll.search(key);
				if(m==1){
					cout<<"Element found"<<endl;
				}
				else{
					cout<<"Not found"<<endl;
				}
				break;
			case 7:
				ll.reverse();
				break;
			case 8:
				ll.bubbleSort();
				break;
			case 9:
				break;
			default:
				cout<<"Wrong choice"<<endl;
				break;
		}
	} while(choice!=9);
	return 0;
}