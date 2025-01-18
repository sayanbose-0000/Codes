// Write a program to find the factorial of a given integer number using dynamic programming.
import java.util.Scanner;

class FactorialDynamicProg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n: ");
    int n = sc.nextInt();

    int[] arr = new int[n+1];
    arr[0] = 1;
    arr[1] = 1;

    for (int i = 2; i <= n; i++) {
      arr[i] = arr[i-1] * i;
    }

    System.out.println("Ans is: " + arr[n]);
  }
}

// 1 * 2 * 3 * 4 * 5

//  0  1  2  3  4
// [] [] [] [] []