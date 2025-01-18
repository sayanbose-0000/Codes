// Write a program to convert the given temperature in Fahrenheit to Celsius using the following conversion formula:
// C = (F-32)/1.8

import java.util.Scanner;

class FarenheitToCelcius {
  public static void main(String[] args) {
    System.out.print("Enter temp in Fahrenheit: ");

    Scanner sc = new Scanner(System.in);

    double f = sc.nextDouble();

    System.out.println("Temperature in Fahrenheit is: " + f + " deg F");

    double c = (f - 32) / 1.8;

    System.out.println("Temperature in Celsius is: " + c + " deg C");
  }
}