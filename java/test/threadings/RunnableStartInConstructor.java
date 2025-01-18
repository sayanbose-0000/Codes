// Implement a class from Runnable and override the run( ) method. Inside run( ), print full qualified name of thread, and then call
// sleep( ). Repeat this three times, then return from run( ). Put a start-up message in the constructor. Make your thread object and
// main thread run to see what happens.

class MyThread implements Runnable {
  int x;
  MyThread(int x) {
    this.x = x;

    Thread t = new Thread(this);
    t.start();
  }

  @Override 
  public void run() {
    for (int i = 0; i < 3; i++) {
      System.out.println(x + ": " +i);

      try {
        Thread.sleep(1000);
      }

      catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

public class RunnableStartInConstructor {
  public static void main(String[] args) {
    MyThread mt1 = new MyThread(1);
    MyThread mt2 = new MyThread(2);
  }
}