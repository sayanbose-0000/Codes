// Make several threads (say 5) with names (by extending thread), set their priority and run them to see what happens

class MyThread extends Thread {
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

class SetPriorityThread {
  public static void main(String[] args) {
    MyThread mt1 = new MyThread(1);
    MyThread mt2 = new MyThread(2);
    MyThread mt3 = new MyThread(3);
    MyThread mt4 = new MyThread(4);
    MyThread mt5 = new MyThread(5);

    mt1.setPriority(3);
    mt2.setPriority(2);
    mt3.setPriority(1);
    mt4.setPriority(4);
    mt5.setPriority(5);

    mt1.start();
    mt2.start();
    mt3.start();
    mt4.start();
    mt5.start();
  }
}