// do factorial using recursion

class FactorialRec {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    long res = factorial(num);
    System.out.println("Result is: " + res);
  }

  static long factorial(int num) {
    if (num == 0) return 1;
    return num * factorial(num - 1);
  }
}