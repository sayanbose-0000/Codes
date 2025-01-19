class Counter {
  private int count;

  synchronized void increment() {
    count++;
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
    for (int i = 0; i < 10000; i++) {
      c.increment();
    }
  }
}

class CounterMain { 
  public static void main(String[] args) throws InterruptedException {
    Counter c = new Counter();

    MyThread mt1 = new MyThread(c);
    MyThread mt2 = new MyThread(c);

    Thread t1 = new Thread(mt1);
    Thread t2 = new Thread(mt2);

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(c.getCount());
  }
}
