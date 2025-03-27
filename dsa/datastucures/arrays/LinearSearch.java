import java.util.Scanner;

class LinearSearch {
  public static void main(String[] args) {

    System.out.print("Enter size: ");    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();


    int[] arr = new int[n];

    System.out.print("Enter array: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }    

    System.out.println("Enter element to be searched: ");    
    int search = sc.nextInt();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == search) {
        System.out.println("Found at loc: " + i);
      }
    }
  }
}