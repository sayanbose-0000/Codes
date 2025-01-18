// Write a Java Program to demonstrate arithmetic operations between two numbers using command line arguments.

class ArithmeticOps {
  public static void main(String[] args) {
    System.out.println("Additionj is: " + (Double.parseDouble(args[0]) + Double.parseDouble(args[1])));
    System.out.println("Subtraction is: " + (Double.parseDouble(args[0]) - Double.parseDouble(args[1])));
    System.out.println("Division is: " + (Double.parseDouble(args[0]) / Double.parseDouble(args[1])));
    System.out.println("Multiplication is: " + (Double.parseDouble(args[0]) * Double.parseDouble(args[1])));
  }
}