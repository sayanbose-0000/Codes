class Pizza { //parent class
    constructor(pizzaType) {
        this._pizzaType = pizzaType;
        this._pizzaCrust = "original";
    }
}

//SpecialPizza child inherits from Pizza parent
class SpecialPizza extends Pizza { //extends is the keyword for inheritance
    constructor(pizzaType) {
        super(pizzaType); //constructor of superclass
        this._pizzaSize = "Big";
    }

    slice() {
        console.log(`Our pizza named ${this._pizzaType}, of crust ${this._pizzaCrust} and of size ${this._pizzaSize}`)
    }
}

const mySpecialPizza = new SpecialPizza("Pepperonii");
mySpecialPizza.slice();