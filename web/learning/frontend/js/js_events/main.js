let show_hide=document.querySelector(".btn")
let my_para=document.querySelector(".my_para");

show_hide.addEventListener("click",function(){
    if (my_para.style.display!="none"){ //to change css=> element.style.property
        my_para.style.display="none";
    }
    else{
        my_para.style.display="block";
    }
}
);


