class MyThreadClass extends Thread {
  int x;
  MyThreadClass(int x) {
    this.x = x;
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {

      System.out.println(x + ": " + i);

      try {
        if (x == 3) throw new ArrayIndexOutOfBoundsException();
        Thread.sleep(1000);
      }

      catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

public class ExtendingThreadClass {
  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {
      MyThreadClass mtc = new MyThreadClass(i);
      mtc.start();
    }

    for (int i = 0; i < 5; i++) {
      System.out.println("Main" + ": " + i);

      try {
        if (i >= 0 && i < 5) throw new StringIndexOutOfBoundsException();
        Thread.sleep(1000);
      }

      catch (Exception e) {
        System.out.println(e);
      }
    }
  
  }
}