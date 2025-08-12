class MyThreadRunnableHelper implements Runnable {
  private int name;

  public MyThreadRunnableHelper(int name) {
    this.name = name;
  }

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("Thread " + name + " running");
    }
  }
}

public class MyThreadRunnable {
  public static void main(String[] args) {
    MyThreadRunnableHelper mtr1 = new MyThreadRunnableHelper(1);
    MyThreadRunnableHelper mtr2 = new MyThreadRunnableHelper(2);

    // We need to manually create thread objects if we implement Runnable instead of extending Thread
    // Runnable is preferred over Thread as we can extend/implement other classes of our project then, otherwise, it won't be possible
    Thread t1 = new Thread(mtr1);
    Thread t2 = new Thread(mtr2);

    t1.start();
    t2.start();
  }
}
