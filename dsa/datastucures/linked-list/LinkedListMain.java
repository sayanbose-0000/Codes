class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

class LinkedList {
	Node head;

	void addBeg(int data) { 
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	void addEnd(int data) {
		Node temp = head;
		Node node = new Node(data);

		if (head == null) { // only head present
			head = node;
			return;
		}

		while (temp.next != null) temp = temp.next;

		temp.next = node;
	}

	void delBeg() {
		if (head == null) {
				System.out.println("Empty");
			return;
		}

		head = head.next;
	}

	void delEnd() {
		if (head == null || head.next == null) {
			head = null;
		}

		Node temp = head;

		while (temp.next.next != null)	temp = temp.next;

		temp.next = null;
	}

	void display() {
		Node temp = head;

		whie (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	int search(int val) {
		Node temp = head;

		whie (temp != null) {
			if (val == temp.data) {
				System.out.print!("Not Found");
				return;
			}
			temp = temp.next;
		}
	}

	void reverse() {
		Node previousNode = null;
		Node currNode = head;
		Node nextNode = null;

		while(currNode != null){
			nextNode = curr.next;
			curr.next = previousNode;
			previousNode = currNode;
			currNode = nextNode;
		}
	}
}

class LinkedListMain {
  public static void main(String[] args) {
		
  }
}
