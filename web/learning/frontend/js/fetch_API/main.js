const users = fetch("https://jsonplaceholder.typicode.com/users");


//fetches resources from the internet
fetch("https://jsonplaceholder.typicode.com/users").then(response => {
    return response.json();
}).then(data => {
    console.log(data);
    
    data.forEach(user => {
        console.log(user)
    });
})

console.log(users); //we see this first in the console and then the fetch API's things because it is not under the promise and then block...so, js executes this first and that happens before fetch API can access the data

//but still, many then blocks can nest and cause problems...so, we use async/await. It's just a syntactic sugar that basically has promises running under the hood