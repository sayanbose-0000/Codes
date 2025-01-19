// Inherit a class from Thread and override the run( ) method. Inside run( ), print name of thread , and then call sleep( ). Repeat this
// three times, then return from run( ). Put a start-up message in the constructor. Make your thread object and main thread run to see
// what happens.

class Helper extends Thread {
  Helper() {
    start();
  }

  @Override
  public void run() {
    for (int i = 0; i < 3; i++) {
      System.out.println(i);

      try {
        Thread.sleep(1000);  
      }

      catch(InterruptedException ie) {
        System.out.println(ie);
      }
    }
  }
}

class ThreadClassMain {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      Helper h1 = new Helper();
    }
  }
}