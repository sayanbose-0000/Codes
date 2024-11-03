class Main {
  static class CustomException extends Exception {
    CustomException(String s) {
      super(s);
    }
  }

  public static void main(String[] args) {
    try {
      int x = 2;
      if (x == 1) throw new CustomException("I am custom");
    }

    catch (CustomException e) {
      System.out.println(e);
    }
  }
}