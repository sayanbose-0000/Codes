
#include <iostream>
#include <vector>
#include <map>

// Declare a class for a single product
class Product {
    private:
        std::string name;
        double price;
        
    public:
        Product(std::string newName, double newPrice) :
            name(newName), price(newPrice) {}
        std::string getName() {
            return name;
        }
        double getPrice() {
            return price;
        }
};

// Declare a class for a vending machine slot
class Slot {
    private:
        Product *product;
        int quantity;
        
    public:
        Slot(Product *newProduct, int newQuantity) :
            product(newProduct), quantity(newQuantity) {}
        
        Product* getProduct() {
            return product;
        }
        int getQuantity() {
            return quantity;
        }
        void decreaseQuantity() {
            --quantity;
        }
        bool isEmpty() {
            return quantity == 0;
        }
};

// Declare a class for a vending machine
class VendingMachine {
    private:
        std::map<int, Slot*> slots;
        double moneyInserted;
        
    public:
        VendingMachine() : moneyInserted(0) {}
        void addProductToSlot(int slotNumber, Product *product, int quantity) {
            slots[slotNumber] = new Slot(product, quantity);
        }
        void insertMoney(double amount) {
            moneyInserted += amount;
        }
        void dispenseProduct(int slotNumber) {
            if(slots.find(slotNumber) != slots.end()) {
                Slot* slot = slots[slotNumber];
                if(!slot->isEmpty() && moneyInserted >= slot->getProduct()->getPrice()) {
                    moneyInserted -= slot->getProduct()->getPrice();
                    slot->decreaseQuantity();
                    std::cout << "Here is your " << slot->getProduct()->getName() << std::endl;
                }
            }
        }
};

int main() {
    // Instantiate products
    Product* colaProduct = new Product("Cola", 1.0);
    Product* chipsProduct = new Product("Chips", 0.75);
    Product* candyProduct = new Product("Candy", 0.65);

    // Instantiate vending machine and add products to slots
    VendingMachine* machine = new VendingMachine();
    machine->addProductToSlot(1, colaProduct, 5);
    machine->addProductToSlot(2, chipsProduct, 10);
    machine->addProductToSlot(3, candyProduct, 15);

    // Tests
    machine->insertMoney(1.50);
    machine->dispenseProduct(2);
    machine->dispenseProduct(3);

    return 0;
}
