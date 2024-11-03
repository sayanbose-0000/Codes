import java.util.Scanner;

class MehtodOverload {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Overloader ov = new Overloader();

    System.out.print("Enter a & b (integers): ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    int res = ov.add(a, b);
    System.out.println("Addition is (Integer): " + res);

    System.out.print("Enter a & b (double): ");
    double x = sc.nextDouble();
    double y = sc.nextDouble();

    ov.add(x, y);

    sc.close();
  }
}

class Overloader {
  int add (int a, int b) {
    return a+b;
  }

  void add (double a, double b) {
    System.out.println("Addition is (Double): " + (a+b));
  }
}