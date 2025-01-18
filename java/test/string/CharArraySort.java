import java.util.Scanner;

class CharArraySort {
  static char[] sortStr(char[] arr) {
    int n = arr.length;

    for (int i = 0; i < n-1; i++) {
      for (int j = 0; j < n-i-1; j++) {
        if (arr[j] > arr[j+1]) {
          char temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

    return arr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String input = sc.nextLine();

    char[] arr = input.toCharArray();

    char[] res = sortStr(arr);

    System.out.println(res);
  }
}