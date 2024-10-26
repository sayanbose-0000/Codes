import java.io.Console;

class AllPrimeHelper {
  boolean isPrime(int val) {

    for (int i = 2; i < val; i++) {
      if (val % i == 0) return false;
    }

    return true;
  }
}

class AllPrime {
  public static void main (String[] args) {
    Console c = System.console();
    int ll = Integer.parseInt(c.readLine("Enter lower limit: ")); // lower limit
    int ul = Integer.parseInt(c.readLine("Enter upper limit: ")); // upper limit

    if (ll < 2) {
      System.out.print("Lower limit can't be less than 0");
      System.exit(0);
    }

    AllPrimeHelper p = new AllPrimeHelper();

    for (int i = ll; i <= ul; i++) {
      if (p.isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }
}