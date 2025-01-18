// Generate password from initials of one’s first_name, middle_name, last_name and with last four digit of your roll_no.(if middle
// name not presents ,it won't come

import java.util.Scanner;

class PasswordGenerator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first name: ");
    String first_name = sc.next();

    System.out.print("Enter middle name: ");
    String middle_name = sc.next();

    System.out.print("Enter last name: ");
    String last_name = sc.next();

    System.out.print("Enter roll no: ");
    String roll_no = sc.next();

    System.out.println("Password is: " + first_name.charAt(0) + middle_name.charAt(0) + last_name.charAt(0) + roll_no.substring(roll_no.length() - 4));
  }
}