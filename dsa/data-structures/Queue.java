import java.util.Scanner;

class QueueImplementation {
  // front->[1][2][3][4][5][6]<-rear
  private int front; // at the start, used for dequeue
  private int rear; // at the end, used for enqueue
  private int size;
  private int[] queue;

  QueueImplementation(int size) {
    this.size = size;
    queue = new int[size];
    front = -1;
    rear = -1;
  }

  void display() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return;
    }
    
    for (int i = front; i <= rear; i++) {
      System.out.print(queue[i] + " ");
    }
    System.out.println();
  }

  boolean isEmpty() {
    return front == -1;
  }

  boolean isFull() {
    return rear == size - 1;
  }

  void enqueue(int val) {
    if (isFull()) {
      System.out.println("Queue is already full");
      return;  
    }

    if (front == -1) front = 0;
    queue[++rear] = val;
  }

  int dequeue() {
    if (!isEmpty()) return queue[front++];
    System.out.println("Queue is already empty");
    return -1;
  }
}

class Queue {
  public static void main(String[] args) {
    QueueImplementation queue = new QueueImplementation(5);

    System.out.println("1- Enqueue, 2- Dequeue, 3- Display, 4- Exit");
    while(true) {
      System.out.println();
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter choice: ");
      int choice = sc.nextInt();
      
      switch(choice) {
        case 1:
          System.out.print("Enter val: ");
          int val = sc.nextInt();
          queue.enqueue(val);
          break;

        case 2:
          int poppedVal = queue.dequeue();
          if (poppedVal != -1) System.out.println("Popped val is: " + poppedVal);
          break;

        case 3:
          queue.display();
          break;

        case 4:
          System.exit(0);
          break;

        default:
          System.out.println("Wrong choice!");
          break;
      }
    }
  }
}
