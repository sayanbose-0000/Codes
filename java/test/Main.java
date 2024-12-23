import java.util.Scanner;

public class Main {
  public static void main(String[] main) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String sInput = sc.nextLine();

    StringBuilder s = new StringBuilder(sInput);

    int n = s.length();

    for (int i = 0; i < n-1; i++) {
      for (int j = 0; j < n-i-1; j++) {
        if (s.charAt(j) > s.charAt(j+1)) {
          char temp = s.charAt(j);
          s.setCharAt(j, s.charAt(j+1)); 
          s.setCharAt(j+1, temp);
        }
      }
    }

    System.out.println(s);
  }
}