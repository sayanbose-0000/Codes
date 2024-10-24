// Take a string from keyboard and convert into character array (new one)

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.print("Enter string: ");
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();

    char[] newStr = str.toCharArray();

    for (int i = 0; i < newStr.length; i++) {
      System.out.print("[" + newStr[i] + "]");
    }
  }
}