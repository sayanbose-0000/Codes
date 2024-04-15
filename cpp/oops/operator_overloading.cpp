#include <iostream>
using namespace std;

class Complex
{
public:
    double real;
    double imaginary;

    Complex(double real = 0, double imaginary = 0)
    {
        this->real = real;
        this->imaginary = imaginary;
    }

    Complex operator+(Complex &other) // overloading the + operator
    {
        return Complex(this->real + other.real, this->imaginary + other.imaginary);
    }

    void add(Complex &obj1, Complex &obj2)
    {
        this->real = obj1.real + obj2.real;
        this->imaginary = obj1.imaginary + obj2.imaginary;
    }
};

int main()
{
    Complex c1(2.2, 3.6);
    Complex c2(3.5, 8.2);
    Complex c3;
    c3 = c1 + c2;
    cout << c3.real << " + " << c3.imaginary << "i" << endl;

    Complex c4;
    c4.add(c1, c2);
    cout << c4.real << " + " << c4.imaginary << "i" << endl;
    return 0;
}

// (2.2+3.6i) + (3.5+8.2j) = (5.7 + 11.8)