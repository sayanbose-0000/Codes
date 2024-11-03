// show that static block is executed at the time of class loading and also the order of execution of these blocks (for multiple/inherited blocks)

class Parent {
  {
    System.out.println("Parent Block 1");
  }

  {
    System.out.println("Parent Block 2");
  }

  Parent() {
    System.out.println("Constructor of Parent");
  }
}

class Child extends Parent {
  {
    System.out.println("Child Block 1");
  }

  {
    System.out.println("Child Block 2");
  }

  Child() {
    System.out.println("Constructor of Child");
  }
}

class Block {
  public static void main(String[] args) {
    System.out.println("Creating instance of Parent ->");
    Parent p = new Parent();

    System.out.println();

    System.out.println("Creating instance of Child->");
    Child c = new Child();
  }
}