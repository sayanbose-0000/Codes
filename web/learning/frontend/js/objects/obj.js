const myObj={
    myName:"Sayan Bose",
    age:20,
    year: 2,
    hobbies:["Eat","Sleep","Code"],

    beverage:{ //nesting objects
        morning:"coffee",
        afternoon:"Iced Tea",
    },

    greet: function(){ //action is going to be out method name
        return `Welcome, have some ${this.beverage.morning}`;
        //"this" means current object. So, "this" here absically means myObj object and can be used interchangeably
    },
};

console.log(myObj.beverage.morning,"\n"); //accessing nested object
console.log(myObj.hobbies[1],"\n");
console.log(myObj.greet())