#include <iostream>
using namespace std;

class Human
{
public:
    string name = "Any Person"; // default attributes- taken when no value is passed
    string occupation = "SDE";
    int age = 16;

    void eat()
    {
        cout << "This person is eating" << endl;
    }

    void drink()
    {
        cout << "This person is drinking" << endl;
    }

    void sleep()
    {
        cout << "This person is sleeping" << endl;
    }
};

int main()
{
    Human human1;

    human1.name = "Sayan Bose";
    human1.occupation = "Software Developer";
    human1.age = 70;

    cout << human1.name << endl;
    cout << human1.occupation << endl;
    cout << human1.age << endl;
    human1.eat();
    human1.drink();
    human1.sleep();

    cout << endl;

    Human human2;

    human2.name = "Rick Altman";
    human2.occupation = "Photographer";
    human2.age = 53;

    cout << human2.name << endl;
    cout << human2.occupation << endl;
    cout << human2.age << endl;
    human2.eat();
    human2.drink();
    human2.sleep();

    Human human3; // takes default modifiers values
    cout << human3.name << endl;
    cout << human3.occupation << endl;
    cout << human3.age << endl;
    human3.eat();
    human3.drink();
    human3.sleep();
}