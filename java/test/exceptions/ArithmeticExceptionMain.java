// Write a program to handle the ArithmeticException

import java.util.Scanner;

class ArithmeticExceptionMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b =sc.nextInt();
    
    try {
      int z = a/b;
      System.out.println(z);
    }
    catch(ArithmeticException ae) {
      System.out.println("Cant div by rosogolla");
    }
  }
}