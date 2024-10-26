interface ParentInterfaceOne {
  void parentInterfaceOneMethodOne();
  void parentInterfaceOneMethodTwo();
}

interface ParentInterfaceTwo {
  void parentInterfaceTwoMethodOne();
  void parentInterfaceTwoMethodTwo();
}

interface ChildInterface extends ParentInterfaceOne, ParentInterfaceTwo{ // "extends" is used if both parent and child are interfaces. Otherwise, "implements" is used
  void childInterfaceMethod();
}

class ConcreteClass {
  void concreteClassMethod() {
    System.out.println("Concrete Class Method");
  }
}

class GrandChildClass extends ConcreteClass implements ChildInterface {
  @Override
  public void parentInterfaceOneMethodOne() {
    System.out.println("Parent Interface One Method One");
  }

  @Override
  public void parentInterfaceOneMethodTwo() {
    System.out.println("Parent Interface One Method Two");
  }

  @Override
  public void parentInterfaceTwoMethodOne() {
    System.out.println("Parent Interface Two Method One");
  }

  @Override
  public void parentInterfaceTwoMethodTwo() {
    System.out.println("Parent Interface Two Method Two");
  }

  @Override
  public void childInterfaceMethod() {
    System.out.println("Child Interface Method");
  }

  // Concrete method
  void grandChildClassMethod() {
    System.out.println("Grand Child Method");
  }
}

class InterfaceMain {
  public static void main (String[] args) {
    GrandChildClass g = new GrandChildClass();
    g.parentInterfaceOneMethodOne();
    g.parentInterfaceOneMethodTwo();
    g.parentInterfaceTwoMethodOne();
    g.parentInterfaceTwoMethodTwo();
    g.childInterfaceMethod();
    g.concreteClassMethod();
    g.grandChildClassMethod();
  }
}