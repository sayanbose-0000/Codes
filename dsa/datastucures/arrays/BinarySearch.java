import java.util.Scanner;

class BinarySearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.print("Enter arr: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }


    System.out.print("Enter val to search: ");
    int val = sc.nextInt();

    int left = 0, right = n-1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (val > arr[mid]) {
        left = mid + 1;
      } else if (val < arr[mid]) {
        right = mid - 1;
      } else {
        System.out.println("Idx is: " + mid);
        return;
      }
    }

    System.out.println("No element found");
  }
}