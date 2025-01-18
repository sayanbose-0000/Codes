// Write a program to find the factorial of a given integer number using recursion

class FactorialRec {
  static int fact(int n) {
    if (n == 0 || n == 1) return n;
    return n * fact(n-1);
  }

  public static void main(String[] args) {
    System.out.println(fact(5));
  }
}