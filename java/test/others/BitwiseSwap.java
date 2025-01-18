// Write a Java Program to swap two numbers using the bitwise operator
class BitwiseSwap {
  public static void main(String[] args) {
    
  int x = 10, y = 20;

  x = x ^ y;
  y = x ^ y;
  x = x ^ y;

  System.out.println("x is: " + x + " and y is: " + y);
  }
}