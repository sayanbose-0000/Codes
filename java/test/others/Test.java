class Parent {
  static {
    System.out.println("Hi");
  }

  {
    System.out.println("Bye");
  }
}

class Child extends Parent {}

class SecondChild extends Parent {}

class Test {
  public static void main(String[] args) {
    Child c = new Child();

    System.out.println("----");

    SecondChild sc = new SecondChild();
  }
}