// Show that static block is executed at the time of class loading and also the order of execution of these blocks (for multiple blocks/
// inherited block).

class Helper {
  { // called every time when obj is created
    System.out.println("Block 1");
  }

  Helper() {
    System.out.println("Constructor called");
  }

  void show() {
    System.out.println("Hi");
  }

  static { // only called when class is loaded
    System.out.println("Static Block");
  }
}

class StaticBlock {
  public static void main(String[] args) {
    Helper h = new Helper();
    h.show();

    System.out.println("---");

    Helper h2 = new Helper();
    h2.show();
  }
}