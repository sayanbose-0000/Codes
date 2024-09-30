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
    if (isFull()) System.out.println("Queue is already full");
    if (front == -1) front = 0;
    rear = (rear + 1) % size;
    queue[rear] = val;
  }

  void dequeue() {
    if (isEmpty()) System.out.println("Queue is already empty");
    if (front == rear) front = rear = -1;
    front = (front + 1) % size;
  } 
}

class CircularQueue {
  public static void main(String[] args) {
    CircularQueueImplementation cq = new CircularQueueImplementation(5);
  }
}