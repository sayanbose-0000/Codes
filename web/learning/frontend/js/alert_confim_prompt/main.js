alert("Hello"); //opens a modal window. Can't return anything

let myName=prompt("Enter yout name","Joe Gaggery"); //can return a vaue like taking inputs. First one is label name and 2nd one is default name
console.log(`My name is ${myName}`);

//for providing warning
let deleteName=confirm("Are you sure you want to delete this?");
console.log(deleteName); //returns true on clicking ok. Returns false on clicking cancel

if(deleteName){
    console.log("Post Deleted");
}
else{
    console.log("Deletion cancelled");
}

