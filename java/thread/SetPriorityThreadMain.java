// Make several threads (say 5) with names (by extending thread), set their priority and run them to see what happens

class Helper extends Thread {
  int n;

  Helper(int n) {
    this.n = n;
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(n + ": " + i);
    }

    try {
      Thread.sleep(2000);
    }

    catch (InterruptedException ie) {
      System.out.println(ie);
    }
  }
}


class SetPriorityThreadMain {
  public static void main(String[] args) {
    Helper h1 = new Helper(1);
    Helper h2 = new Helper(2);
    Helper h3 = new Helper(3);
    Helper h4 = new Helper(4);
    Helper h5 = new Helper(5);

    h1.setPriority(1);
    h2.setPriority(2);
    h3.setPriority(3);
    h4.setPriority(4);
    h5.setPriority(5);

    h1.start();
    h2.start();
    h3.start();
    h4.start();
    h5.start();
  }
}