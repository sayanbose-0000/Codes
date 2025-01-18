// Create an interface named Shape with a field pie (=3.14). Create two subclasses of it named Circle and Rectangle create object of
// the two classes and calculate their area

interface Shape {
  static final double PIE = 3.14;
}

class Circle implements Shape {
  void area(int r) {
    System.out.println("Area is: " + Shape.PIE * r * r);
  }
}

class Rectangle implements Shape {
  void area(int l, int b) {
    System.out.println("Area is: " + l * b);
  }
}

class InterfaceShape {
  public static void main(String[] args) {
    Circle c = new Circle();
    c.area(5);

    Rectangle r = new Rectangle();
    r.area(6, 4);
  }
}