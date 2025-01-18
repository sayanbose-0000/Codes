// WAP to calculate GCD/HCF and LCM of two numbers.

import java.util.Scanner;

class LcmHcf {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a and b: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    int lcm = 0;
    for (int i = 1; i <= a*b; i++) {
      if (i % a == 0 && i % b == 0) {
        lcm = i;
        break;
      }
    }

    System.out.println("lcm is: " + lcm);

    int hcf = 0;
    for (int i = 1; i <= a && i <= b; i++) {
      if (a % i == 0 && b % i == 0) {
        hcf = i;
      }
    }

    System.out.println("hcf is: " + hcf);
  }
}