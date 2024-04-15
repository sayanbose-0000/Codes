//synchronous

console.log("I");
console.log("eat");
console.log("ice cream");
console.log("with");
console.log("a");
console.log("spoon");

console.log("\n")

//asynchronous
console.log("I");
console.log("may");
console.log("eat");

setTimeout(() => {
    console.log("toffee"); 
}, 5000); //the problem here is that js skips this line, runs the entire code and only then prints this, even if the time is well beyond 5 seconds (as given here)

console.log("a");
console.log("with a");

for (let i=0;i<100000;i++){
    console.log("\n");
}
console.log("-----------------------------------------------------------------------------")