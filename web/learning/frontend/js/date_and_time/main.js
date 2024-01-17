function liveTime(){
    document.querySelector(".curr_time").innerHTML=new Date();
}
setInterval(liveTime,1000);

let dt = new Date(0); //shows reference time
console.log(dt);

let dt2 = new Date(1000); //shows reference time
console.log(dt2);//reference+ no of miliseconds

let dt3=new Date("2029-09-30")
console.log(dt3);

let dt4=new Date(3020,4,6,9,3,2,34) //year,month,date,hours,minutes,seconds,miliseconds
console.log(dt4);

let yr=now.getFullYear();
console.log(yr);

let mnth=now.getMonth();
console.log(mnth);

//sets new date to existing one
now.setDate(34); //automatically adjusts the date for 30,31 or 28 day sin month
console.log(now);

