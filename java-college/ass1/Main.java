abstract class Test {
  void print () {
    System.out.println("Hello");
  }
}

class Test1 extends Test {
  void method2() {
    System.out.println("World");
  }
}

class Main extends Test{
  public static void main (String[] args) {
    Test1 t1 = new Test1();
    t1.print();
    t1.method2();
  }
}