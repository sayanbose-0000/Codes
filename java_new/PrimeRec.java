import java.io.Console;

class PrimeHelper {
  boolean primeFind (int n, int i, int k) {

    if (i == n) {
      if (k == 1) return true;
      else return false;
    }

    if (n % i == 0) return primeFind(n, i+1, k+1);
    else return primeFind(n, i+1, k);
  }
}

class PrimeRec {
  public static void main(String[] args) {

    Console c = System.console();
    int n = Integer.parseInt(c.readLine("Enter number: "));

    PrimeHelper p = new PrimeHelper();
    boolean res = p.primeFind(n, 1, 0);
    System.out.println(res ? "Is Prime" : "Is Not Prime");
  }
}