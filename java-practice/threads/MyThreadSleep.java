public class MyThreadSleep {
  public static void main(String[] args) {
    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 20; i++) {
        if (i == 10) {
          try {
            Thread.sleep(5000); // Sleeps this thread
          } catch (InterruptedException ie) {
            System.out.println(ie);
          }
        }
        System.out.println("Thread 1 running");
      }
    });

    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 20; i++) {
        System.out.println("Thread 2 is running");
      }
    });


    t1.start();
    t2.start();
  }
}
