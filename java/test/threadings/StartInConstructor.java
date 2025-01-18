// Inherit a class from Thread and override the run( ) method. Inside run( ), print name of thread , and then call sleep( ). Repeat this
// three times, then return from run( ). Put a start-up message in the constructor. Make your thread object and main thread run to see
// what happens.

class MyThread extends Thread {
  int x;
  MyThread(int x) {
    this.x = x;
    start();
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

public class StartInConstructor {
  public static void main(String[] args) {
    MyThread mt1 = new MyThread(1);
    MyThread mt2 = new MyThread(2);
  }
}