class HelloMain {
  static void val (int x) {
    x = 20;
    System.out.println("Inside funcn: " + x);
  }

  static void val2(String s) {
    s = "abcd";
    System.out.println("Inside funcn: " + s);
  }

  public static void main (String[] args) {
    int x = 10;
    String s = "wegweg";
    val(x);
    val2(s);
    System.out.println("Inside main: " + x);
    System.out.println("Inside main: " + s);
  }
}