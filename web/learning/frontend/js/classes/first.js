class Pizza {
    constructor(pizzatype, pizzasize) {
        this._pizzatype = pizzatype; // Use _pizzatype as the backing variable
        this.pizzasize = pizzasize;
        this.crust = "original";
        this.toppings = [];
    }

    bake() {
        console.log(`Baking a  ${this.crust} crust pizza and the name is ${this._pizzatype} of size ${this.pizzasize}`);
    }

    // Getter for pizzatype
    get pizzatype() { //can be used to print the value
        return this._pizzatype;
    }

    // Setter for pizzatype
    set pizzatype(pizzatype) { //can be used to change the value
        this._pizzatype = pizzatype;
    }

    //insted of using getter and setter, we can do this:
    getToppings(){ 
        //a normal function names setToppings, to be used as getter
        return this.toppings;
    }

    setToppings(topping){ 
        //normal function named setToppings, to be used as setter
        this.toppings.push(topping);
    }
}

const myPizza = new Pizza("pepperoni", 50);
myPizza.pizzatype = "thin"; //using the setter
console.log(myPizza.pizzatype); //using the getter
myPizza.bake();

myPizza.setToppings("sausage");
myPizza.setToppings("olives");

console.log(myPizza.getToppings());
