public class CounterSynchronized {
  static int counter;

  static synchronized void increment() { // using synchronnized keyword;
    counter++;
  }

  public static void main(String[] args) {
    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 10000000; i++) {
        increment();
      }
    });

    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 10000000; i++) {
        increment();
      }
    });

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException ie) {
      System.out.println(ie);
    }

    System.out.println("Expected: " + (10000000 + 10000000));
    System.out.println("Actual: " + counter); // Value  correct as counter is syncronized
  }
}
