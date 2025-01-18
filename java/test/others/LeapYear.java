// Write a Java Program to check Leap Year
import java.util.Scanner;

class LeapYear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter year: ");
    int y = sc.nextInt();

    // yaers (div by 400) or year (div by 4 and not by 100)
    if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) System.out.println("Leap Year");
    else System.out.println("Not Leap Year");
  }
}