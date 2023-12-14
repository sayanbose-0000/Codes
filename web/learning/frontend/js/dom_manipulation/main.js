let home=document.getElementById("main");
console.log(home);

let nav=document.getElementById("nav");
console.log(nav);

let about=document.getElementById("about");
about.innerHTML="Hello World";

let containers=document.getElementsByClassName("container");
console.log(containers);

//for use in css
let sel=document.querySelector(".container");
console.log("Thiz Returnz ",sel);

let sel2=document.querySelectorAll("#nav>li");
console.log(sel2)
