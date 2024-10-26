let emlpoyee={  //creating object
    name:"Sayan",
    salary:"50000",
    work:"SDE",
}

console.log(emlpoyee.work);


let names=["Sayan",1,4, 5.0, null, 0, "Google"]; //in js, arrays can have mixed datatypes
console.log(names);
console.log(names[6]);


let names2=new Array("Sayan",1,4, 5.0, null, 0, "Google") //by creating objects
console.log(names2[0]);

console.log(names.length); //length of array

console.log(names.sort());//sorting an array

names.push("Dhiskao"); //adding elements to beginning of array
console.log(names);

names.pop(); //deleting element at last of array
console.log(names);

let arrayz=new Array(10); //creates x10 empty elements
console.log(arrayz);
//To add a single element with 10 as value, do  this:
let arrayz2 = new Array();
arrayz2.push(10);
console.log(arrayz2);