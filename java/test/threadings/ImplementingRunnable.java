// Implement program of locking of common method by several threads. (Using the keyword ‘synchronized’).

class Counter {
  private int count;

  synchronized void increment() {
    count = count + 1;
  }

  int getCount() {
    return count;
  }
}

class MyThread implements Runnable {
  Counter c;

  MyThread(Counter c) {
    this.c = c;
  }

  @Override
  public void run() {
    for (int i = 0; i < 9999; i++) {
      c.increment();
    }
  }
}

class ImplementingRunnable {
  public static void main(String[] args) {
    Counter c = new Counter();
      
    MyThread mt1 = new MyThread(c);
    MyThread mt2 = new MyThread(c);

    Thread t1 = new Thread(mt1);
    Thread t2 = new Thread(mt2);

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    }

    catch(Exception e) {
      System.out.println(e);
    }

    System.out.println("Counter val: " + c.getCount());
  }
}