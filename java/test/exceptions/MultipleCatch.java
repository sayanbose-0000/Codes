// Write a program for multiple catch to fire ArrayIndexOutOfBoundsException and StringIndexOutOfBoundsException both.

class MultipleCatch {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    String str = "Hello";

    try {
      System.out.println(arr[0]);
      System.out.println(str.charAt(0));

      int[] arr2 = new int[-55];
    }

    catch (ArrayIndexOutOfBoundsException aioobe) {
      System.out.println("Array er index thik kore de!!");
    }

    catch (StringIndexOutOfBoundsException sioobe) {
      System.out.println("Array thik korlo to ebar string er gondogol badhalo -_- !!");
    }

    catch (NegativeArraySizeException nase) {
      System.out.println("Ha ha -ve de aaro kore :)");
    }
  }
}