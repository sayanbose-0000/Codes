function goodMorning(myName, greetText="Good Night"){ 
    console.log(`Hello, my name is ${myName}...${greetText} Everyone!`);
} //greetText has a default argument named "Good Night". If there is no input of greetText, it will be taken as default

function addTwoNum(m,n){
    return m+n;
}

function main(){
    let name1="Sayan";
    let name2="Ayan";
    let name3="Pyan";
    let name4="Gayan";
    let name5="Layan";

    goodMorning(name1,"good morning");

    let a=10;
    let b=20;
    z=addTwoNum(a,b);
    console.log(z);
}

main();




