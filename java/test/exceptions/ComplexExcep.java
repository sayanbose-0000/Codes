// Write a program that takes one string and two integers as command line argument and prints the reverse of the substring of
// the string specified by the two numbers. The program should handle all possible exception that may arise due to bad input.

class ComplexExcep {
  public static void main(String[] args) {
    try {
      String s = args[0];
      int a = Integer.parseInt(args[1]);
      int b = Integer.parseInt(args[2]);
      StringBuilder sb = new StringBuilder(s.substring(a,b));
      sb = sb.reverse();
      System.out.println(sb);
    }

    catch (ArrayIndexOutOfBoundsException aioobe) {
      System.out.println("Perhaps you didn't give all of those params in after writing 'java ComplexExcep'");
    }

    catch (StringIndexOutOfBoundsException sioobe) {
      System.out.println("Perhaps you didn't gave a range that is impossible with the string you gave'");
    }

    catch (NumberFormatException nfe) {
      System.out.println("Perhaps you should have provided numbers in place of strings");
    }
  }
}