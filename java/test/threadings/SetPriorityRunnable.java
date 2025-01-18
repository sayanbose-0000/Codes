// Make several threads (say 5) with names (by extending thread), set their priority and run them to see what happens

class MyThread implements Runnable {
  int x;

  MyThread(int x){
    this.x = x;
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(x + ": " + i);

      try {
        Thread.sleep(1000);
      }

      catch(Exception e) {
        System.out.println(e);
      }
    }
  }
}

class SetPriorityRunnable {
  public static void main(String[] args) {
    MyThread mt1 = new MyThread(1);
    MyThread mt2 = new MyThread(2);
    MyThread mt3 = new MyThread(3);
    MyThread mt4 = new MyThread(4);
    MyThread mt5 = new MyThread(5);


    Thread t1 = new Thread(mt1);
    Thread t2 = new Thread(mt2);
    Thread t3 = new Thread(mt3);
    Thread t4 = new Thread(mt4);
    Thread t5 = new Thread(mt5);

    t1.setPriority(3);
    t2.setPriority(2);
    t3.setPriority(1);
    t4.setPriority(4);
    t5.setPriority(5);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
  }
}