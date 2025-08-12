public class MyThreadPriority {
  public static void main(String[] args) {
    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 20; i++) {
        System.out.println("Thread 1 is running");
      }
    });

    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 20; i++) {
        System.out.println("Thread 2 is running");
      }
    });

    Thread t3 = new Thread(() -> {
      for (int i = 0; i < 20; i++) {
        System.out.println("Thread 3 is running");
      }
    });

    // Just gives a suggestion to the JVM, not necessarily obeyed
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MAX_PRIORITY);
    t3.setPriority(Thread.NORM_PRIORITY);

    t1.start();
    t2.start();
    t3.start();
  }
}
