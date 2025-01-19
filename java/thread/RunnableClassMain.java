class Helper implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 3; i++) {
      System.out.println(i);

      try {
        Thread.sleep(1000);
      }

      catch (InterruptedException ie) {
        System.out.println(ie);
      }
    }
  }
}

class RunnableClassMain {
  public static void main(String[] args) {
    Helper h1 = new Helper();
    Helper h2 = new Helper();

    Thread t1 = new Thread(h1);
    Thread t2 = new Thread(h2);

    t1.start();
    t2.start();
  }
}