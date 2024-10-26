// infixtoprefix.cpp
#include <iostream>
#include <cstring>
#include "stack_program_for_infix.cpp"

using namespace std;

int isOperator(char ch)
{
    if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
        return 1;
    else
        return 0;
}

int precd(char ch)
{
    if (ch == '+' || ch == '-')
        return 1;
    if (ch == '*' || ch == '/')
        return 2;
    else
        return 0;
}

void infixToPrefix(char infix[], char prefix[])
{
    Stack s;
    int i, j = 0;
    char symbol, temp;

    for (i = strlen(infix) - 1; i >= 0; i--)
    {
        symbol = infix[i];
        if (symbol == ')')
            s.push(symbol);
        else if (symbol == '(')
        {
            while ((temp = s.peek()) != ')')
            {
                prefix[j++] = temp;
                s.pop();
            }
            s.pop();
        }
        else if (isOperator(symbol))
        {
            while (!s.isEmpty() && precd(symbol) < precd(s.peek()))
            {
                temp = s.peek();
                prefix[j++] = temp;
                s.pop();
            }
            s.push(symbol);
        }
        else
            prefix[j++] = symbol;
    }

    while (!s.isEmpty())
    {
        temp = s.peek();
        prefix[j++] = temp;
        s.pop();
    }

    prefix[j] = '\0';
    strrev(prefix);
}

int evalPrefix(char prefix[])
{
    Stack s;
    int i, operand1, operand2, result;
    char symbol;

    for (i = strlen(prefix) - 1; i >= 0; i--)
    {
        symbol = prefix[i];
        if (isOperator(symbol))
        {
            operand1 = s.peek();
            s.pop();
            operand2 = s.peek();
            s.pop();

            switch (symbol)
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
        else
            s.push(symbol - '0');
    }

    result = s.peek();
    return result;
}

int main()
{
    char infix[100], prefix[100];
    cout << "Enter an infix expression: ";
    cin >> infix;

    infixToPrefix(infix, prefix);
    cout << "Prefix expression: " << prefix << endl;

    int result = evalPrefix(prefix);
    cout << "Result: " << result << endl;

    return 0;
}
