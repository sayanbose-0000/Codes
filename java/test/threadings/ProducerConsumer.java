class ProducerConsumerHelper {
  int count = 0;
  boolean flag = false;

  synchronized void produce() throws InterruptedException {
    while (true) {
      while (flag) {
        wait();
      }

      count++;
      System.out.println("Producer: " + count);
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

      System.out.println("Consumer: " + count);
      flag = false;
      notify();

      Thread.sleep(1000);
    }
  }
}

class Producer implements Runnable {
  ProducerConsumerHelper phc;

  Producer(ProducerConsumerHelper phc) {
    this.phc = phc;
  }

  @Override
  public void run() {
    try {phc.produce();}
    catch(InterruptedException ie) {System.out.println(ie);}
  }
}

class Consumer implements Runnable {
  ProducerConsumerHelper phc;

  Consumer(ProducerConsumerHelper phc) {
    this.phc = phc;
  }

  @Override
  public void run() {
    try { phc.consume(); }
    catch(InterruptedException ie) {System.out.println(ie);}
  }
}

class ProducerConsumer { 
  public static void main(String[] args) {    
    ProducerConsumerHelper pc = new ProducerConsumerHelper();

    Producer p = new Producer(pc);
    Consumer c = new Consumer(pc);

    Thread t1 = new Thread(p);
    Thread t2 = new Thread(c);

    t1.start();
    t2.start();
  }
}