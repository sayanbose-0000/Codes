// abstraction- hiding unnecessary data from outside the class
// getters- function that makes private attribute readable
// setters- function that makes private attribute writable
#include <iostream>
using namespace std;

class Stove
{
private:
    int temperature = 100;

public:
    int getTemperature() // getter function
    {
        return temperature;
    }

    void setTemperature(int temperature) // setter
    {
        this->temperature = temperature;
    }
};

int main()
{
    Stove stove1;

    cout << stove1.getTemperature() << endl; // we read the temperature using getter

    stove1.setTemperature(200);
    cout << stove1.getTemperature() << endl; // we update temperature using setter

    Stove stove2;
    cout << stove2.getTemperature() << endl;

    return 0;
}