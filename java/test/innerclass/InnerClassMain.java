class Outer {
  int outerVariable = 10;

  class Inner {
    int innerVariable = 20;

    void show() {
      System.out.println(innerVariable + " " + outerVariable);
    }
  }
}

class InnerClassMain {
  public static void main(String[] args) {
    Outer.Inner i = new Outer().new Inner();
  }
}