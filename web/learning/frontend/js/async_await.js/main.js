const myUsers = {
    userList: []
};

const myCoolFunction = async () => { //declaring async funcn
    const response = await fetch("https://jsonplaceholder.typicode.com/users"); //basically tells js to 'wait' before doing the next thing

    //after completing the code below, it goes to the next line

    const myJsonUserData = await response.json();
    //it wait  here too before going on


    console.log(myJsonUserData);
    return myJsonUserData;
};

const newAsyncFunc = async () => {
    let data = await myCoolFunction(); //waits till myCoolFunction is completed

    myUsers.userList = data;
    return myUsers.userList;
};


const printIt = async () => {
    await newAsyncFunc();
    console.log(myUsers.userList);
};

printIt();