public class MyThreadLambda {
  public static void main(String[] args) {
    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 100; i++) {
        System.out.println("Thread 1 is running");
      }
    });

    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 100; i++) {
        System.out.println("Thread 2 is running");
      }
    });

    t1.start();
    t2.start();
  }
}
