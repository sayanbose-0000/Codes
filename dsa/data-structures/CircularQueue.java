import java.util.Scanner;

class CircularQueueImplementation {
  private int front;
  private int rear;
  private int[] queue;
  private int size;

  CircularQueueImplementation(int size) {
    front = -1;
    rear = -1;
    this.size = size;
    queue = new int[size];
  }


  boolean isEmpty() {
    return front == -1;
  }

  boolean isFull() {
    return front == (rear + 1) % size;
  }

  void enqueue(int val) {
    if (isFull()) {
      System.out.println("Queue is already full");
      return;
    }

    if (front == -1) front = 0;
    rear = (rear + 1) % size;
    queue[rear] = val;
  }

  void dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is already empty");
      return;
    }

    if (front == rear) front = rear = -1;
    front = (front + 1) % size;
  }

  void display() {
    if (isEmpty()) {
      System.out.println("Queue is already empty");
      return;
    }

    for (int i = front; i != rear; i = (i + 1) % size) {
      System.out.print(queue[i] + " ");
    }
    System.out.println();
  }
}

class CircularQueue {
  public static void main(String[] args) {
    CircularQueueImplementation cq = new CircularQueueImplementation(5);

    Scanner sc = new Scanner(System.in);
    System.out.println("1- Enqueue, 2- Dequeue, 3- Print, 4- Exit");

    while(true) {
      System.out.println();
      System.out.print("Enter choice: ");
      int choice = sc.nextInt();

      switch(choice) {
        case 1:
          System.out.print("Enter val: ");
          int val = sc.nextInt();
          cq.enqueue(val);
          break;

        case 2:
          cq.dequeue();
          break;

        case 3:
          cq.display();
          break;

        case 4:
          System.exit(0);
          break;
        
        default:
          System.out.println("Wrong Choice!");
          break;
      }
    }
  }
}