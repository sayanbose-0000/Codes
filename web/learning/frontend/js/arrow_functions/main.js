let greet= ()=>{
    console.log("hi");
}
greet();

let sum=(a,b)=>a+b; //inside bracket->argument, after arrow->return value

let diff=(a,b)=>console.log(a+b); 

let obj={
    names:["Sayan","payan","ayan","jayan"],
    greet:"Morning",

    speak(){
        this.names.forEach((student)=>{
            console.log(this.greet,student); //using arrow function, the this is automatically done
        });
    }
}

obj.speak();