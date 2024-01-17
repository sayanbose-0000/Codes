let age=17;

if (age>=18){
    console.log("You can Drive");
}

else if (age>0 && age<18){
    console.log("You can't Drive");
}

else{
    console.log("You are too negative");
}

let choice=4;

switch(choice){
    case 1:
        console.log("Option is",1);
        break;
    case 2:
        console.log("Option is",2);
        break;
    case 3:
        console.log("Option is",3);
        break;
    case 4:
        console.log("Option is",4);
        break;
    case 5:
        console.log("Option is",5);
        break;
    default:
        console.log("Wrong Choice");
        break;
}