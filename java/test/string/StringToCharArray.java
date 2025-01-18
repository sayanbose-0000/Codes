import java.util.Scanner;

class StringToCharArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    char[] ch = s.toCharArray();

    for (char c : ch) System.out.print("[" + c + "]");
  }
}