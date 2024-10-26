import java.util.Scanner;

class LinearSearchImplementation {
  private int arr[];
  private int size;

  LinearSearchImplementation(int size) {
    this.size = size;
    arr = new int[size];
  }

  void initialize() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Inittialize arr: ");

    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
  }

  int search(int val) {
    for (int i = 0; i < size; i++) {
      if (val == arr[i]) {
        return i;
      }
    }
    
    return -1;
  }
}

class LinearSearch {
  public static void main(String[] args) {
    LinearSearchImplementation ls = new LinearSearchImplementation(5);

    ls.initialize();

    Scanner sc = new Scanner(System.in);

    while(true) {
      System.out.print("Enter number to be searched: ");
      int val = sc.nextInt();

      int found = ls.search(val);

      System.out.println(found != -1 ? "Found at " + found : "Not found");
    }
  }
}