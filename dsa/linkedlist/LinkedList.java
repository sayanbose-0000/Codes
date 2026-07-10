// Creation, Insertion, Deletion, Traversal, Search, Reversal

class LinkedListImpl {
  // struct Node {int data, Node next}
  static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  Node head;

  public void insert(int val) {
    Node newNode = new Node(val);

    // No nodes -> make first node as head
    if (head == null) {
      head = newNode;
      return;
    }

    // elements already present -> Traverse to the last element and add element
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }

    temp.next = newNode;
  }

  public void print() {
    // No elements
    if (head == null) {
      System.out.println("Empty List");
      return;
    }

    Node temp = head;
    System.out.print("The list is: ");
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public boolean search(int key) {
    if (head == null) {
      return false;
    }

    Node temp = head;

    while (temp != null) {
      if (key == temp.data) {
        return true;
      }
      temp = temp.next;
    }

    return false;
  }

  void delete(int key) {
    if (head == null) {
      System.out.println("Empty");
      return;
    }

    // Only one node
    if (head.data == key) {
      head = head.next;
      return;
    }

    Node temp = head;

    while (temp.next != null) {
      if (temp.next.data == key) {
        temp.next = temp.next.next;
        return;
      }
      temp = temp.next;
    }

    System.err.println("Not found");
    return;
  }

  public void reverse() {
    if (head == null) {
      System.out.println("Empty");
      return;
    }

    // prevNode is null, curr is first node, nextNode is 2nd node (initially)
    Node prevNode = null;
    Node currNode = head;
    Node nextNode = head.next;

    while (currNode != null) {
      nextNode = currNode.next;
      currNode.next = prevNode;
      prevNode = currNode;
      currNode = nextNode;
    }

    head = prevNode; // Makes last element the new head
  }

}

public class LinkedList {
  public static void main(String[] args) {
    LinkedListImpl ll = new LinkedListImpl();

    ll.print();
    ll.insert(0);
    ll.print();
    ll.insert(1);
    ll.insert(2);
    ll.insert(3);
    ll.insert(4);
    ll.insert(5);
    ll.print();

    System.out.println(ll.search(2));
    System.out.println(ll.search(100));

    ll.delete(100);
    ll.print();
    ll.delete(2);
    ll.print();
    ll.reverse();
    ll.print();
  }
}
