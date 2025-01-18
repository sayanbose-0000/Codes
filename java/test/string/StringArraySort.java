// Write a program to take a sentence and convert it into string arrays and sort the words using any Sorting technique.

import java.util.Scanner;

class StringArraySort {
  static String[] sortString(String[] arr) {
    int n = arr.length;

    for (int i = 0; i < n-1; i++) {
      for (int j = 0; j < n-i-1; j++) {
        if (arr[j].compareTo(arr[j+1]) > 0) {          
          String temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

    return arr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();

    String[] arr = input.split(" ");

    String[] res = sortString(arr);

    for (String i : res) System.out.print("[" + i + "]");
  }
}