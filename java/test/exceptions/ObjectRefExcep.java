// Define an object reference and initialize it to null. Try to call a method through this reference.
// Now wrap the code in a try-catch clause to catch the exception

class MyClass {
  void show() {
    System.out.println("Hi");
  }
}

class ObjectRefExcep {
  public static void main(String[] args) {

    try {
      MyClass m = null;
      m.show();
    }

    catch (NullPointerException npe) {
      System.out.println("Hello World");      
    }
  }
}


