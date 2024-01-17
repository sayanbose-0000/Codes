//sum of numbers to n,recursion
import java.util.Scanner;

public class SumToN {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sum = ToN(n);
        System.out.println(sum);
    }

    public static int ToN(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + ToN(n - 1);
        }
    }
}
