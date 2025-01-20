class Helper { 
  void div() {
    int a = 10 / 0;
    System.out.println(a);
  }
}

class ArithExec {
  public static void main(String[] args) {
    Helper h = new Helper();
    // System.out.println(h.div());
    try {
      h.div();
    }

    catch (ArithmeticException ae) {
      System.out.println(ae);
    }
  }
}