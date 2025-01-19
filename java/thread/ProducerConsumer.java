class ProducerConsumerDS {
  int count;
  boolean flag;

  synchronized void produce() throws InterruptedException {
    while (true) {
      while (flag) {
        wait();
      }

      count++;
      System.out.println("Produce: " + count);
      flag = true;

      notify();

      Thread.sleep(1000);
    } 
  }

  synchronized void consume() throws InterruptedException {
    while (true) {
      while (!flag) {
        wait();
      }

      System.out.println("Consume: " + count);
      flag = false;

      notify();

      Thread.sleep(1000);
    } 
  }
}

class Producer implements Runnable{
  ProducerConsumerDS pc;

  Producer(ProducerConsumerDS pc) {
    this.pc = pc;
  }

  @Override
  public void run() {
    try {
      pc.produce();
    }

    catch (InterruptedException ie) {
      System.out.println(ie);
    }
  }
}

class Consumer implements Runnable {
  ProducerConsumerDS pc;

  Consumer(ProducerConsumerDS pc) {
    this.pc = pc;
  }

  @Override
  public void run() {
    try {
      pc.consume();
    }

    catch (InterruptedException ie) {
      System.out.println(ie);
    }
  }
}

class ProducerConsumer {
  public static void main(String[] args) throws InterruptedException {
    ProducerConsumerDS pc = new ProducerConsumerDS();

    Producer p = new Producer(pc);
    Consumer c = new Consumer(pc);

    Thread t1 = new Thread(p);
    Thread t2 = new Thread(c);

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    if (!t1.isAlive() && !t2.isAlive()) {
      System.out.println("Exection Complete");
    }
  }
}