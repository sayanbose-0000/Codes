// Check if "Tech" presents in "University of Technology" or not. If yes return its position.

import java.util.Scanner;

class SubString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the strings");

    String a = sc.nextLine();
    String b = sc.nextLine();

    System.out.println(a.contains(b));
    System.out.println(a.indexOf(b));
  }
}