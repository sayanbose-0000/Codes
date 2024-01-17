#include <iostream>
using namespace std;

class Shapes
{
public:
    double Area;
    double Volume;
};

class Cube : public Shapes
{
public:
    double side;
    Cube(double side)
    {
        this->side = side;
        this->Area = (6 * side * side);
        this->Volume = (side * side * side);
    }
};

class Sphere : public Shapes
{
public:
    double radius;
    Sphere(double radius)
    {
        this->radius = radius;
        this->Area = (4 * 3.14 * (radius * radius));
        this->Volume = ((4 / 3.0) * 3.14 * (radius * radius * radius));
    }
};

int main()
{
    Cube cube(10);
    Sphere sphere(5);

    cout << "Area of cube is: " << cube.Area << endl;
    cout << "Volume of cube is: " << cube.Volume << endl;
    cout << "Area of sphere is: " << sphere.Area << endl;
    cout << "Volume of sphere is: " << sphere.Volume << endl;
    return 0;
}