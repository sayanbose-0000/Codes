// Operations-  isEmpty, isFull, push, pop, peek, display
import java.util.Scanner;

class Stack {
  int size;
  int top;
  int[] stack = new int[0]; // first creating a 0 size array

  Stack(int size) {
    top = -1;
    this.size = size;
    this.stack = new int[size]; // re-initializing it to our desired size
  }

  boolean isEmpty() {
    if (top == -1) return true;
    return false;
  }

  boolean isFull() {
    if (top == size - 1) return true;
    return false;
  }
 
  boolean push(int val) {
    if (!isFull()) {
      stack[++top] = val;
      return true;
    }

    return false;
  }

  int pop() {
    if (!isEmpty()) {
      int temp = stack[top--];
      return temp;
    }

    return -1;
  }

  int peek() {
    if (!isEmpty()) {
      return stack[top];
    }

    return -1;
  }

  boolean display() {
    if (!isEmpty()) {
      for (int i = 0; i < top + 1; i++) {
        System.out.print(stack[i] + " ");
      }
      return true;
    }

    return false;
  }
}

class StackMain {
  public static void main(String[] args) {
    Stack s = new Stack(5);
    Scanner scChoice = new Scanner(System.in);
    Scanner scInput = new Scanner(System.in);
    int choice;

    System.out.println("1- Push, 2- Pop, 3- Display, 4- Peek, 5- Exit");
    while (true) {
      System.out.print("Enter choice: ");
      choice = scChoice.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter number: ");
          int val = scInput.nextInt();

          boolean res1 = s.push(val);
          if (res1) System.out.println("Insered: " + val);
          else System.out.println("Stack is full!");

          break;

        case 2:
          int res2 = s.pop();
          if (res2 != -1) System.out.println("Popped: " + res2);
          else System.out.println("Stack is empty!");

          break;

        case 3:
          boolean res3 = s.display();
          if (!res3) System.out.println("Stack is Empty");

          break;

        case 4:
          int res4 = s.peek();
          if (res4 == -1) System.out.println("Stack is Empty");
          else System.out.println("Top is: " + res4);

          break;

        case 5:
          return;
        
        default:
          System.out.println("Entered wrong choice!");
      }

      System.out.println();
    }
  }
}