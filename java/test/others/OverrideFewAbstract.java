// Create an abstract class with three abstract methods check whether you can we override 
// only few methods (not all methods) in subclass or not

abstract class AbstractClass {
  abstract void methodOne();
  abstract void methodTwo();
  abstract void methodThree();
}

class Class extends AbstractClass {
  @Override
  void methodOne() {
    System.out.println("Method One");
  }

  // @Override
  // void methodTwo() {
  //   System.out.println("Method Two");
  // }

  // @Override
  // void methodThree() {
  //   System.out.println("Method Three");
  // }
}

class OverrideFewAbstract {
  public static void main(String[] args) {
    Class ac = new Class();
    ac.methodOne();
  }
}