// Write a Java Program to implement the following:
// Create an abstract base class TwoD that contains two instance variable length and breadth and an abstract
// method area(). Three subclasses triangle, square and rectangle inherits the base class TwoD and override the
// method area() according to their shape.

abstract class TwoD {
  int length;
  int breadth;
  TwoD (int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }
  abstract void area();
}

class Triangle extends TwoD {
  Triangle(int base, int height) {
    super(base, height);
  }

 @Override
  void area (){
    System.out.println(0.5 * length * breadth);
  }
}

class Square extends TwoD {
  Square(int side) {
    super(side, side);
  }

  @Override
  void area (){
    System.out.println(Math.pow(length, 2));
  }
}

class Rectangle extends TwoD {
  Rectangle(int length, int breadth) {
    super(length, breadth);
  }

  @Override
  void area (){
    System.out.println(length * breadth);
  }
}

class Main {
  public static void main (String[] args) {
    Rectangle r = new Rectangle(10, 20);
    Square s = new Square(10);
    Triangle t = new Triangle(10, 20);

    r.area();
    t.area();
    s.area();
  }
}