// demonstrate anonymus inner class (using super class and interface)

class A {
  void showA() {
    System.out.println("A is printed (overriden later)");
  }

  void anotherMethod() {
    System.out.println("A is printed");
  }
}

interface B {
  void showB();
}

class AnonInnClass {
  public static void main(String[] args) {
    A a = new A() {
      void showA() { 
        System.out.println("Inner Class A printed");
      }
    };

    a.showA();
    a.anotherMethod();

    B b = new B() {
      public void showB() {
        System.out.println("Inner Class B printed");
      } 
    };
    b.showB();
  }
}