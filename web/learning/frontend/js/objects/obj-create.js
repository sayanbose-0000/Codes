const vehicle={
    wheels:4,
    engine: function (){
        return "Vrooom!";
    },
}

//Inheritance
const truck=Object.create(vehicle); //creating a new obj "truck" that inherits properties of "vehicle" obj

truck.door=2; //creating a new key value pair of the obj

console.log(truck); //only displays normal values, not inherited ones
console.log(truck.wheels); //inherits this from parent vehicle
console.log(truck.engine()); //inherits this from parent vehicle

console.log("\n")

const car=Object.create(vehicle);
car.engine=function(){ //overwriting inherited method
    return "Pachuk...pachuk";
}
console.log(car,"\n\n");

const tesla=Object.create(car); //inheriting car now
tesla.engine=function(){
    return "Shhhh...";
}
console.log(tesla);
console.log(tesla.engine());



console.log(Object.keys(tesla)); //doesn't show inherited values
console.log(Object.values(tesla)); //doesn't show inherited values