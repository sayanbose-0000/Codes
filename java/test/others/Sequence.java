// Write a Java Program to display the sequence ABA, BCB, CDC, DED,…

public class Sequence {
  public static void main(String[] args) {
    
    for (char i = 'A'; i <= 'Z'; i++) {
      StringBuilder s = new StringBuilder();
      s.append(i);
      s.append(i != 'Z' ? (char) (i + 1) : "A");
      s.append(i);
      System.out.print(s.toString() + " "); 
    }
  }
}
