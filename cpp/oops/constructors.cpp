#include <iostream>
using namespace std;

class Students
{
public:
    string name; // "this->" refers to this variable name
    int roll;
    double gpa;

    Students(string name, int roll, double gpa)
    {
        this->name = name; // "this->" is the variable before constructor, not the consturctor's parameter
        this->roll = roll;
        this->gpa = gpa;
    }
};

int main()
{
    Students student1("Sayan Bose", 123, 90.8);

    cout << student1.name << endl;
    cout << student1.roll << endl;
    cout << student1.gpa << endl;

    return 0;
}
