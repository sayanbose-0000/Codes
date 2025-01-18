//  Write your own method called deleteMe(String str, int m) that returns the input string with the m-th element removed.

import java.util.Scanner;

class RemoveCharFromString {
  static String deleteMe(String str, int m) {
    String res = str.substring(0, m) + str.substring(m+1, str.length());
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = sc.nextInt();

    System.out.println(deleteMe(s, n));
  }
}