public class MyThreadJoin {
  public static void main(String[] args) {
    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 20; i++) {
        if (i == 10) {
          try {
            Thread.sleep(5000);
          } catch (Exception e) {
            System.out.println(e);
          }
        }

        System.out.println("Thread 1 running");
      }
    });

    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 20; i++) {
        System.out.println("Thread 2 running");
      }
    });

    t1.start();

    try {
      t1.join();
    } catch (InterruptedException ie) {
      System.out.println(ie);
    }

    t2.start();
  }
}
