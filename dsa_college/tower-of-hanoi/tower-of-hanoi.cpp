// Mnemomic=> Sunny days are always special days

#include <iostream>
using namespace std;
void tower_of_hanoi(int n, char source, char auxiliary, char destination) {
    if (n == 1) {
        cout << "Move disk 1 from " <<source<< " to " <<destination<<endl;
        return;
    }
    
    tower_of_hanoi(n - 1, source, destination, auxiliary); // sunny days are
    cout << "Move disk " <<n<< " from "<<source<< " to "<<destination <<endl;
    tower_of_hanoi(n - 1, auxiliary, source, destination); // always special days
}

int main() {
    int n;
    cout<<"Enter no of disks: ";
    cin>>n;
    tower_of_hanoi(n, 's','a','d');
    return 0;
}
