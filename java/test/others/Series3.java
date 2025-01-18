// Write a Java Program to display the sequence A1, B2, C3, ....Y25, Z26, A1, B2,........

public class Series3 {
  public static void main(String[] args) {
    char ch = 'A';

    for (int i = 1; i <= 26; i++) {
      StringBuilder s = new StringBuilder();
      s.append(ch);
      s.append(i);
      System.out.print(s + " ");

      ch += 1;
    }
  }
}
