// Write a program to create a user defined exception named PayOutOfBoundsException (provided the monthly salary of a per-
// son is less than Rs. 10,000 /-) and fire the exception.

class PayOutOfBoundsException extends Exception{
  PayOutOfBoundsException(String s) {
    super(s);
  }
}

class Pay {
  public static void main(String[] args) throws PayOutOfBoundsException {
    int n = 999;
    if (n < 10000) throw new PayOutOfBoundsException("Bla bla bla");
    System.out.println("Hi");
  }
}