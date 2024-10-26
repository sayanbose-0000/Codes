// child can recieve attributes and methods of parent class
#include <iostream>
using namespace std;

class Animal
{
public:
    bool alive = "true";
    void eat()
    {
        cout << "This animal is eating" << endl;
    }
};

// inheritance
class Dog : public Animal // public here means that the attributes and methods of Animal class will become public for the Dog class
{
public:
    void bark() // dog classes own attribute and methods
    {
        cout << "The dog barks- bow bow!!" << endl;
    }
};

class Cat : public Animal
{
public:
    void meow()
    {
        cout << "Cat goes Meow!!" << endl;
    }
};

int main()
{
    Dog dog;
    cout << dog.alive << endl; // dog inherits alive attribute of Animal class
    dog.eat();                 // dog inherits eat method of Animal class

    dog.bark(); // dog class's own method

    Cat cat;
    cout << cat.alive << endl;
    cat.eat();
    cat.meow();

    return 0;
}