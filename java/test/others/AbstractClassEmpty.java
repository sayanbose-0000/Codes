// Check without having any abstract method/s whether a class can be abstract; if so, then use that concrete method/s from another
// class having main method.

class AbstractClass {
  void show() {
    System.out.println("Hi");
  }
}

public class AbstractClassEmpty {
  public static void main(String[] args) {
    AbstractClass ace = new AbstractClass();

    ace.show();
  }
}