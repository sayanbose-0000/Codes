// WAP to print all perfect numbers within a given range

import java.util.Scanner;

class PerfectNos {
  static boolean isPerfect(int n) {
    int res = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        res += i;
      }
    }

    if (res == n)
      return true;
    else
      return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a num: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      if (isPerfect(i))
        System.out.print(i + " ");
    }

    sc.close();
  }
}