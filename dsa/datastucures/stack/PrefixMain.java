import java.util.Stack;
import java.util.Scanner;

class PrefixMain {
  static String prefixEval(String input) {
    Stack<String> s = new Stack<String>();

    s.push("" + input.charAt(input.length() - 1));

    int i = input.length() - 1;
    while (!s.isEmpty() && i >= 0) {
      char ch = input.charAt(i);

      if (ch == '+' ||  ch == '-' || ch == '*' || ch == '/') {
        int operandOne = Integer.parseInt(s.pop());
        int operandTwo = Integer.parseInt(s.pop());

        int eval = 0;
        switch(ch) {
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

        s.push("" + eval);
      }

      // Is operand
      else {
        s.push("" + ch);
      }

      i--;
    }

    String res = s.pop();
    return res;
  }

  public static void main(String[] args) {
    System.out.print("Enter string: ");

    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    String res = prefixEval(input);
    System.out.println("Result is: " + res);
  }
}