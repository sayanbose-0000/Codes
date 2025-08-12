package com.example;

class ZeroException extends Exception {
  public ZeroException(String mssg) {
    super(mssg);
  }
}

public class ExceptionThrower {
  public int throwException(int a) throws ZeroException {
    if (a == 0) {
      throw new ZeroException("Value is 0");
    }

    return 1;
  }
}
