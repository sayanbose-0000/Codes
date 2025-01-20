class IdxOutMain {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};

    String s = "Hi";

    try {
      System.out.println(arr[5]);
      System.out.println(s.charAt(5));
    }

    catch (ArrayIndexOutOfBoundsException aioub) {
      System.out.println(aioub);
    }

    catch (StringIndexOutOfBoundsException sioub) {
      System.out.println(sioub);
    }
  }
}