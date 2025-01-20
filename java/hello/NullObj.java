class Helper {
  void hello() {
    System.out.println("Hello");
  }
}

class NullObj {
  public static void main(String[] args) {
    Helper h = null;

    try {
      h.hello();
    }

    catch (NullPointerException npe) {
      System.out.println(npe);
    }
  }
}