// Convert decimal to binary
import java.util.Scanner;

class DecimalToBinary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n: ");
    int n = sc.nextInt();

    int stored = n;
    StringBuilder res = new StringBuilder();

    while (stored != 0) {
      int temp = stored % 2;
      res.append(Integer.toString(temp));

      stored = stored / 2;
    }

    System.out.println("Res is: " + res.reverse().toString());
  }
}