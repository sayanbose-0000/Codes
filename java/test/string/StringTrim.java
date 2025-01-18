import java.util.Scanner;

class StringTrim {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String s = sc.nextLine();

    System.out.println("'" + s + "'");
    System.out.println(s.length());

    System.out.println();

    s = s.trim();
    System.out.println("'" + s + "'");
    System.out.println(s.length());
  }
}