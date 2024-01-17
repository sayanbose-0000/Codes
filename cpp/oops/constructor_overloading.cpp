#include <iostream>
using namespace std;

class Pizza
{
public:
    string topping1;
    string topping2;

    Pizza() // constructor with no params
    {
        // no params in this constructor, no nothiing written inside this
    }

    Pizza(string topping1) // constructor with one params
    {
        this->topping1 = topping1;
    }

    Pizza(string topping1, string topping2) // constructor with two params
    {
        this->topping1 = topping1;
        this->topping2 = topping2;
    }
};

int main()
{
    Pizza pizza3; // constructor with no params

    Pizza pizza1("Pepperoni"); // using the constructor with one params
    cout << pizza1.topping1 << endl;

    Pizza pizza2("Mushrooms", "Peppers"); // constructor with two params
    cout << pizza2.topping1 << endl;
    cout << pizza2.topping2 << endl;
}