// //callbacks-> calling a function inside another function

let stocks= {
    fruits:["strawberry","grapes","banana","apple"],
    liquid:["water","ice"],
    holder:["cone","cup","stick"],
    toppings:["chocolate","peanuts"],
};

let order=(fruit_name, call_production)=>{
    call_production();
}

let production=()=>{
}

order(production);