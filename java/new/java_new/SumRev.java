// Write a program to find the sum of digits and reverse of a given integer number

class SumRev {
  public static void main (String[] args) {
    int num = Integer.parseInt(args[0]);
    int sum = sumDigits(num);
    int rev = reverseDigits(num);

    System.out.println("Sum of all digits is: " + sum + ", and rev of all digits: " + rev);
  }

  static int sumDigits(int num) {
    int sum = 0;

    while (num > 0) {
      sum += num % 10;
      num = num / 10;
    }

    return sum;
  }

  static int reverseDigits(int num) {
    int rev = 0;

    while (num > 0) {
      rev = rev * 10 + (num % 10);
      num = num / 10;
    }

    return rev;
  }
}