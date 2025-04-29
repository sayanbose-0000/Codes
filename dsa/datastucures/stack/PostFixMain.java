import java.util.Stack;
import java.util.Scanner;

class PostfixMain {
  static String postFixEval(String input) {
    Stack<String> s = new Stack<String>();
    String res = "";

    s.push("" + input.charAt(0));

    int i = 1;
    while (!s.isEmpty() && i < input.length()) {
      // If it is an operator
      if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '/') {
        int operandOne = Integer.parseInt(s.pop());
        int operandTwo = Integer.parseInt(s.pop());

        int operator = input.charAt(i);

        int eval = 0;
        switch (operator) {
          case '+':
            eval = operandTwo + operandOne;
            break;
          case '-': 
            eval = operandTwo - operandOne;
            break;
          case '*': 
            eval = operandTwo * operandOne;
            break;
          case '/': 
            eval = operandTwo / operandOne;
            break;
        }

        s.push(String.valueOf(eval));
      } 
      
      // It is an operand
      else {
        s.push("" + input.charAt(i));
      }

      i++;
    }

    res = s.pop();
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