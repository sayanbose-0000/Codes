// Create a class which contains an inner class. Show that inner class can use member of outer class directly, but Outer class can use
// member of Inner class only through its object. Check the name of class file, you created.

class Outer {
  int outerVariabe = 10;

  class Inner {
    int innerVariable = 20;
    
    void show() {
      System.out.println(innerVariable + " " + outerVariabe); // Inner class can access outer class variable
    }
  }

  void show() {
    Inner i = new Inner(); // Outer class variable can't access inner class vars without creating an obj first
    System.out.println(i.innerVariable + " " + outerVariabe);
  }
}

class InnerClassMain {
  public static void main(String[] args) {
    // Outer.Inner i = new Outer.Inner(); // iff inner method is static
    Outer.Inner i = new Outer().new Inner(); // if inner method is non-static

    i.show();


    Outer o = new Outer();

    o.show();
  }
}