import tools.*;

class Main {
  public static void main(String[] args) {
    Calc c = new Calc();
    AdvCalc advC = new AdvCalc();

    c.add(1,2);
    advC.add(1,2,3,4,5,6);
  }
}