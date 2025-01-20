// reate a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type that you define. In f( ), call g( ), catch
// its exception and, in the catch clause, throw a different exception (of a second type that you define). Test your code in main( ).

class MyException extends Exception {}

class A {
  void f() {
    try {
      g();
    }

    catch(MyException me) {
      System.out.println("Hi");
    }
  }

  void g() throws MyException {
    throw new MyException();
  }
}

class TwoExcep {
  public static void main(String[] args) throws MyException {
    A a = new A();
    a.f();
    System.out.println("--");
    a.g();
  }
}