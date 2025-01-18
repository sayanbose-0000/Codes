class Q {
  int n;
  boolean valueset = false;

  synchronized int get() {
    while (!valueset) 
      try {
        wait();
      } catch (InterruptedException e) {}
    System.out.println("Got: " + n);
    valueset = false;
    notify();
    return n;
  }

  synchronized void put(int n) {
    while (valueset)
      try {
        wait();
      } catch (InterruptedException e) {}
    this.n = n;
    System.out.println("Put: " + n);
    valueset = true;
    notify();
  }
}

class Producer extends Thread {
  Q q;

  Producer(Q q) {
    this.q = q;
  }

  public void run() {
    int i = 0;
    while (true)
      q.put(i++);

  }
}

class Consumer extends Thread {
  Q q;
  Consumer(Q q) {

    this.q = q;
  }

  public void run() {

    while (true)
      q.get();
  }
}

class ProducerConsumerSRS {
  public static void main(String args[]) {
    Q q = new Q();
    Producer pr = new Producer(q);
    Consumer co = new Consumer(q);
    pr.start();
    co.start();
  }
}