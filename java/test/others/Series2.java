// Write a Java Program to display the sequence AMM, COO, EQQ ,..........

public class Series2 {
  public static void main(String[] args) {
    char first = 'A';
    char second = 'M';

    while (first <= 'Z' && second <= 'Z') {
      StringBuilder s = new StringBuilder();
      s.append(first);
      s.append(second);
      s.append(second);

      System.out.print(s + " ");
      first += 2;
      second += 2;
    }
  }
}
