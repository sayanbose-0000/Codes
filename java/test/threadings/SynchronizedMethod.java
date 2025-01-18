// Implement program of locking of common method by several threads. (Using the keyword ‘synchronized’).

class Counter {
  int count;

  void increment() {
    count = count + 1;
  }
}

class MyThread implements Runnable{
  @Override
  public void run() {
    Counter c = new Counter();
    for (int i = 0; i < 100000000; i++) {
      c.increment();
    }
  }
}

class SynchronizedMethod {
  public static void main(String[] args) {
    MyThread mt1 = new Thread();
    MyThread mt2 = new Thread();

    Thread t1 = new Thread();
    Thread t2 = new Thread();

    t1.start();
    t2.start();

    System.out.println("Count value is: " + c.count);
  }
}