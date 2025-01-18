// Write a Java Program to multiply a number by 2 and divide the same number by 4 using shift operator

class MulDivShift {
  public static void main(String[] args) {
    int x = 40;

    System.out.println("Multiply by 2: " +  (x << 1)); // mul by 2^1 = 2
    
    System.out.println("Divide by 2: " +  (x >> 1)); // div by 2^1 = 2
    System.out.println("Divide by 4: " +  (x >> 2)); // div by 2^2 = 4
  }
}