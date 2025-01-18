// Show that ordinary block is executed when object is created and also the order of execution of these blocks (for multiple blocks/
// inherited block)

class Helper {
  {
    System.out.println("Block 1");
  }

  Helper() {
    System.out.println("Constructor called");
  }

  void show() {
    System.out.println("Hi");
  }

  {
    System.out.println("Block 2");
  }
}

class OrdinaryBlock {
  public static void main(String[] args) {
    Helper h = new Helper();
    h.show();
  }
}