import java.util.Scanner;

class StackImplementation {
  private int size;
  private int[] stack;
  private int top;

  StackImplementation(int size) {
    this.size = size;
    top = -1;
    stack = new int[size];
  }

  boolean isEmpty() {
    return top == -1;
  }

  boolean isFull() {
    return top == size - 1;
  }

  void display() {
    if (isEmpty()) {
      System.out.println("Stack is empty!");
      return;
    }

    for (int i = 0; i <= top; i++) {
      System.out.print(stack[i] + " ");
    }
    System.out.println();
  }

  int peek() {
    if (isEmpty()) {
      System.out.println("Stack is empty!");
      return -1;
    }
    return stack[top];
  }

  void push(int val) {
    if (isFull()) {
      System.out.println("Stack already full");
      return;
    }

    stack[++top] = val;
  }

  int pop() {
    if (isEmpty()) {
      System.out.println("Stack already empty");
      return -1;
    }
    return stack[top--];
  }
}

class Stack {
  public static void main(String[] args) {
    
    StackImplementation stack = new StackImplementation(5);

    System.out.println("1- Push, 2- Pop, 3- Display, 4- Peek, 5- Exit");

    while (true) {
      System.out.println();
      System.out.print("Enter choice: ");
      Scanner sc = new Scanner(System.in);
      int choice = sc.nextInt();

      switch(choice) {
        case 1:
          System.out.print("Enter val to be pushed: ");
          int val = sc.nextInt();
          stack.push(val);
          break;

        case 2:
          int poppedVal = stack.pop();
          if (poppedVal != -1) System.out.println("Popped val: " + poppedVal);
          break;

        case 3:
          stack.display();
          break;

        case 4:
          int peekedVal = stack.peek();
          if (peekedVal != -1) System.out.println("Top val:" + peekedVal);
          break;

        case 5:
          System.exit(0);
          break;

        default:
          System.out.println("Wrong choice!");
          break;
      }
    }   
  }
}