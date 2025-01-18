// Create two interfaces, each with two methods. Inherit a new interface from the two, adding a new method. Create a class by im-
// plementing the new interface and also inheriting from a concrete class. In main (), create an object of derived class and call the
// methods. [do all without package statement]

interface ParentInterfaceOne {
  void showParentInterfaceOne();
}

interface ParentInterfaceTwo {
  void showParentInterfaceTwo();
}

interface ChildInterface extends ParentInterfaceOne, ParentInterfaceTwo {
  void showChildInterface();
}

class ParentClass {
  void showparentClass() {
    System.out.println("Parent Class Method");
  }
}

class ChildClass extends ParentClass implements ChildInterface {
  @Override
  public void showParentInterfaceOne() {
    System.out.println("Parent Interface One");
  }

  @Override
  public void showParentInterfaceTwo() {
    System.out.println("Parent Interface Two");
  }

  @Override
  public void showChildInterface() {
    System.out.println("Child Interface");
  }
}

class InterfaceInterface {
  public static void main(String[] args) {
    ChildClass c = new ChildClass();
    c.showParentInterfaceOne();
    c.showParentInterfaceTwo();
    c.showChildInterface();
    c.showparentClass();
  }
}