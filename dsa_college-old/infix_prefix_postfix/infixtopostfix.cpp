// infixtopostfix.cpp
#include <iostream>
#include "stack_program_for_infix.cpp"
using namespace std;

char infix[100], postfix[100];

int precd(char ch)
{
    if (ch == '*' || ch == '/')
        return 2;
    if (ch == '+' || ch == '-')
        return 1;
    else
        return 0;
}

int isOperator(char ch)
{
    if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
        return 1;
    else
        return 0;
}

int isAlphaNum(char ch)
{
    if (ch >= 'a' && ch <= 'z')
        return 1;
    if (ch >= 'A' && ch <= 'Z')
        return 1;
    if (ch >= '0' && ch <= '9')
        return 1;
    else
        return 0;
}

int isOperand(char ch)
{
    if (isAlphaNum(ch))
        return 1;
    else
        return 0;
}

void infixToPostfix()
{
    int i = 0, j = 0;
    Stack s;
    bool flag = true; // flag to check if the expression is balanced

    while (infix[i] != '\0')
    {
        char ch = infix[i];
        if (isOperand(ch))
        {
            postfix[j++] = ch;
        }
        else if (ch == '(')
            s.push(ch);
        else if (ch == ')')
        {
            while (s.peek() != '(')
            {
                postfix[j++] = s.peek();
                s.pop();
            }
            s.pop();
        }
        else if (isOperator(ch))
        {
            while (!s.isEmpty() && s.peek() != '(' && precd(ch) <= precd(s.peek()))
            {
                postfix[j++] = s.peek();
                s.pop();
            }
            s.push(ch);
        }
        else
        {
            flag = false;
            cout << "ERROR:INVALID INFIX EXPRESSION" << endl;
            break;
        }
        i++;
    }

    if (flag)
    {
        while (!s.isEmpty())
        {
            postfix[j++] = s.peek();
            s.pop();
        }
        postfix[j] = '\0';
    }
    else
    {
        cout << "ERROR:UNBALANCED EXPRESSION" << endl;
    }
}

int evalPostfix(char postfix[])
{
    int i, operand1, operand2, result;
    Stack s;

    for (i = 0; postfix[i] != '\0'; i++)
    {
        if (isOperand(postfix[i]))
        {
            s.push(postfix[i] - '0'); // convert character to integer
        }
        else
        {
            operand2 = s.peek();
            s.pop();
            operand1 = s.peek();
            s.pop();
            switch (postfix[i])
            {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            }
            s.push(result);
        }
    }

    result = s.peek();
    return result;
}

int main()
{
    cout << "Enter an infix string...: ";
    cin >> infix;

    infixToPostfix();
    cout << "Postfix Expression...: " << postfix << endl;

    int result = evalPostfix(postfix);
    cout << "The result is: " << result << endl;

    return 0;
}
