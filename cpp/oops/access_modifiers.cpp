#include <iostream>
using namespace std;

// by deafault, if we don't give anything, the access modifier is private
class Employees

{
    // Public: Public members are accessible from any part of the program, both within and outside the class, providing full visibility and access.

    // Private: Private members are only accessible within the class where they are defined, ensuring encapsulation and data hiding.They are NOT visible to child-classes too

    // Protected: Protected members are accessible within the class and by child-classes, allowing limited access for inheritance and specialization. They are NOT accessible elsewhere

private:
    string name;
    string company;
    int age;
};

int main()
{
    Employees e1;
}