// Generate password from initials of one’s first_name, middle_name, last_name and with last four digit of your roll_no.(if middle
// name not presents ,it won't come)

import java.util.Scanner;

class Password {

  static String genPass(String firstName, String middleName, String lastName, String rollNo) {
    StringBuilder pass = new StringBuilder("");

    pass.append(firstName.charAt(0));
    if (middleName.length() != 0) {
      pass.append(middleName.charAt(0));
    }
    pass.append(lastName.charAt(0));

    for (int i = 0; i < 4 && i < rollNo.length(); i++) {
      pass.append(rollNo.charAt(i));
    }
    
    return pass.toString();
  }

  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first name: ");
    String firstName = sc.nextLine();

    System.out.print("Enter middle name: ");
    String middleName = sc.nextLine();

    System.out.print("Enter last name: ");
    String lastName = sc.nextLine();

    System.out.print("Enter roll no: ");
    String rollNo = sc.nextLine();

    String pass = genPass(firstName, middleName, lastName, rollNo);

    System.out.println("The pass is: " + pass);
  }
}