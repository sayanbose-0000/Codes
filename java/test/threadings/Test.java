class ProdCon {
  int count;
  boolean flag;

  synchronized void producer() throws InterruptedException {
    while (true){
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

  synchronized void consumer() throws InterruptedException {
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

class Prod implements Runnable {
  ProdCon pc;

  Prod(ProdCon pc) {
    this.pc = pc;
  }

  @Override
  public void run() {
    try {pc.producer();}
    catch (InterruptedException ie) { System.out.println(ie); }
  }
}

class Con implements Runnable {
  ProdCon pc;

  Con(ProdCon pc) {
    this.pc = pc;
  }

  @Override
  public void run() {
    try {pc.consumer();}
    catch (InterruptedException ie) { System.out.println(ie); }
  }
}

class Test {
  public static void main(String[] args) throws InterruptedException {
    ProdCon pc = new ProdCon();

    Prod p = new Prod(pc);
    Con c = new Con(pc);

    Thread pt = new Thread(p);
    Thread ct = new Thread(c);

    pt.start();
    ct.start();

    pt.join();
    ct.join();
  }
}