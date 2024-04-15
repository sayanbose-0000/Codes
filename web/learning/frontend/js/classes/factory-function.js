//best way to create an object in js because in normal classes, a problem of no private variables arrises

function pizzaFactory(myType, mySize) { //factoryfunction
    const type = myType; //we can directly use the argument too, no need to assign a different variable...but not done here, you can do it
    const size = mySize; //we can directly use the argument too, no need to assign a different variable...but not done here, you can do it
    const crust = "original";
    return { //returning a method
        bake: () => console.log(`Baking a ${type}, of size ${size} and ${crust} crusted`),
    };
}

const myPizza = pizzaFactory("Pepperoni", 50);

myPizza.bake();