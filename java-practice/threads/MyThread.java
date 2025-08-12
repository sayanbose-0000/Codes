class MyThreadHelper extends Thread {
  private int name;

  public MyThreadHelper(int name) {
    this.name = name;
  }

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("Thread " + name + " Running");
    }
  }
}

public class MyThread {
  public static void main(String[] args) {
    MyThreadHelper mth1 = new MyThreadHelper(1);
    MyThreadHelper mth2 = new MyThreadHelper(2);

    // No need to create Thread objects seperately if we extend Thread unlike Runnable (see 'MyThreadRunnable.java')

    mth1.start();
    mth2.start();
  }
}
