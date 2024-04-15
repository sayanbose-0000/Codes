//setTimeOut->allows us to run the function for once after a time interval

//setInterval->allows us to run the function repeatedly after a regular time interval

function goodMorning(myName,takeCare){
    console.log("Good Morning",myName,takeCare);
}

//setTimeOut(function_name_withoutbraces,timeout,some_extra_output)
let x=setTimeout(goodMorning, 5000,"Sayan","Take Care"); //in ms...1s=1000ms


//to cancel the timeout
console.log(x)
//the setTimeOut function returns a unique id that can be used to clear the timeout

//now, we can use clearTimeOut(returned_id) to prevent the execution of the goodMorning function alltogether

function meow(myName2){
    console.log("Cat says meow😸 to",myName2);
}

setInterval(meow,2000,"Sayan Bose");
//clearInterval is also there like clearTimeOut


function timeNow(){
    newTime=new Date();
    document.querySelector(".time").innerHTML=newTime;
}

setInterval(timeNow,1000) //1000ns==1s.So, time gets updated every 1s