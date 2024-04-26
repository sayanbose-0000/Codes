interface Test1 {
  int x = 10;

  void myMethod();
}

interface Test2 {
  int x = 20;

  void myMethod2();
}

class Test3 {
  int x = 30;
  void myMethod3() {
    System.out.println("meow");
  }
}

class TestOther extends Test3 implements Test1, Test2 { // write extends before implements
  @Override
  public void myMethod() {
    System.out.println("Hello " + Test1.x);
  }

  @Override
  public void myMethod2() {
    System.out.println("World " + Test2.x);
  }

  void myMethod4() {
    System.out.println(super.x);
  }
}

class Main {
  public static void main(String[] args) {
    TestOther test = new TestOther();
    test.myMethod();
    test.myMethod2();
    test.myMethod3();
    test.myMethod4();
  }
}