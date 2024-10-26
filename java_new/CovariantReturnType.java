class Parent {
  Parent show() {
    return new Parent();
  }
}

class Child extends Parent {
  @Override
  Child show() { // Covariant return type
    return new Child();
  }
}

class CovariantReturnType {
  public static void main(String[] args) {
    Parent p = new Parent();
    Child c = new Child();

    System.out.println(p.show());
    System.out.println(c.show());
  }
}