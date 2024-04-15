console.log("Hello World");

for(let i=0;i<5;i++){
    console.log(i);
}

let Employee={
    myName:"Sayan Bose",
    salary:10000,
    age:20,
}

for (i in Employee){
    console.log(`The ${i} of employee is ${Employee[i]}`);
}

names=["Sayan","Mohan","Rohan","Kohan"];
names.forEach(element => { //do this
    console.log(element);
});

newnames=["Wow","Hew","Mew","Sew"];
 //or this
newnames.forEach(function func(i) {
    console.log(i);
});

animals=["Hay","Mat","Vat"];
for (i of animals){
    console.log(i);
}