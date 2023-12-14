/*
var is global variable
let is block level variable
const is block level constant
*/

let a=10;
var MY_GLOBAL_NAME="Sayan";
const PI=3.14;


{
    let a=20; //block level
    console.log(a);

    var MY_GLOBAL_NAME="Bose"; //changing it here changes both  console.log()'s
    console.log(MY_GLOBAL_NAME);

    console.log(PI);
    PI=3.14; //we CAN'T reassign another value to it
}

console.log(MY_GLOBAL_NAME);
console.log(a);

console.log(PI);