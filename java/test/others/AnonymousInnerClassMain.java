// Write a program to demonstrate anonymous inner class (using super class and interface)

class A {
  void show() {
    System.out.println("Hello World!");
  }
}

class AnonymousInnerClassMain {
  public static void main(String[] args) {
    A a = new A() {
      @Override
      void show() {
        System.out.println("Hello Indians!");
      }
    };

    a.show(); // Hello Indians

    A b = new A();
    b.show(); // Hello World
  }
}