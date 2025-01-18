// Add two numbers by taking input using Command Line Input, Scanner class and BufferedReader class
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class InputMethods {
  public static void main(String[] args) throws IOException {
    int a = Integer.parseInt(args[0]);

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter b: ");
    int b = sc.nextInt();

    System.out.print("Enter c: ");
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int c = Integer.parseInt(bf.readLine());

    System.out.println("Res: " + a + b + c);
  }
}