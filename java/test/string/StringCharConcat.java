// Take a string from keyboard and a char array (of length 5). Now append the string to that char array

import java.util.Scanner;

class StringCharConcat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter String: ");
    String s = sc.nextLine();

    System.out.print("Enter Char Array: ");
    char[] ch = new char[5];

    for (int i = 0; i < ch.length; i++) {
      ch[i] = sc.next().charAt(0);
    }

    char[] sToChar = s.toCharArray();

    char res[] = new char[ch.length + sToChar.length];

    int count = 0, i = 0;

    while (i < ch.length) {
      res[count] = ch[i];
      i++;
      count++;
    }

    i = 0;
    while (i < sToChar.length) {
      res[count] = sToChar[i];
      i++;
      count++;
    }

    for (char x : res) System.out.print("[" + x + "]");
  }
}