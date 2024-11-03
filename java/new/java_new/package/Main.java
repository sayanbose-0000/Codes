// Create a class with variables and methods (all default) under package pOne. Now create a class under package pTwo which is a subclass of the firstly created class. In this method here (in pTwo) call variables and methods of previous class (pOne). If errors come, rectify them. Now from main (under working directory) access second classes Methods
class Main {
  public static void main(String[] args) {
    PTwo p = new PTwo();
    p.show();
  }
}