public class CounterUnsynchronized {
  static int counter;

  public static void main(String[] args) {
    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 10000000; i++) {
        counter++;
      }
    });

    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 10000000; i++) {
        counter++;
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
    System.out.println("Actual: " + counter); // Value never correct as counter is not syncronized
  }
}
