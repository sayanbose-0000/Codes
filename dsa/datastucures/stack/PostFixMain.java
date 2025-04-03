import java.util.Stack;
import java.util.Scanner;

class PostFixMain {
  static String postFixEval(String input) {
    Stack<String> s = new Stack<String>();
    String res = "";

    s.push("" + input.charAt(0));

    int i = 1;
    while (!s.isEmpty() && i < input.length()) {
      if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '/') {
        int operandOne = Integer.parseInt(s.pop());
        int operandTwo = Integer.parseInt(s.pop());
        int operand = input.charAt(i);

        int eval = 0;
        switch (operand) {
          case '+':
            eval = operandOne + operandTwo;
            break;
          case '-': 
            eval = operandOne - operandTwo;
            break;
          case '*': 
            eval = operandOne * operandTwo;
            break;
          case '/': 
            eval = operandOne / operandTwo;
            break;
        }

        s.push(String.valueOf(eval));
      } 
      
      else {
        s.push("" + input.charAt(i));
      }

      res += s.peek();
      System.out.println(res);
      i++;
    }

    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter expression: ");
    String input = sc.nextLine();

    String res = postFixEval(input);
    System.out.println("Result is: " + res);
  }
}