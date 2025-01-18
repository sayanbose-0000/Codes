// Create a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type that you define. In f( ), call g( ), catch
// its exception and, in the catch clause, throw a different exception (of a second type that you define). Test your code in main( )

class ExceptionOne extends Exception {}
class ExceptionTwo extends Exception {}

class ExceptionalMaze {
  void f() throws ExceptionTwo {
    try {
      g();
    }

    catch(ExceptionOne eo) {
      throw new ExceptionTwo();
    }
  }

  void g() throws ExceptionOne {
    throw new ExceptionOne();
  }

  public static void main(String[] args) {
    ExceptionalMaze em = new ExceptionalMaze();


    try {
      em.f();
    }

    catch (Exception e ) {
      System.out.println(e);
    }
  }
}