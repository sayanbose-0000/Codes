package tools;

public class AdvCalc {
  public void add(int... nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
      System.out.println("Sum is: " + sum);
  }
}