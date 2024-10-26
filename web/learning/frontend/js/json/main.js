const myObj = {
    myName: "Sayan Bose",
    hobbies: ["eat", "sleep", "code"],
    hello: () => {
        console.log("Hello");
    },
};

console.log(myObj);
console.log(myObj.myName);
myObj.hello();
console.log(typeof (myObj));

const sendJSON = JSON.stringify(myObj); // sending this object as a JSON
console.log(sendJSON);
console.log(typeof (sendJSON));
// JSON doesn't take functions, so, hello function is discarded

const recieveJSON = JSON.parse(sendJSON); // converting JSON string data again to object
console.log(recieveJSON);
console.log(typeof (recieveJSON));