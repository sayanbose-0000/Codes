// Promises privide asynchronous code

/* promises can hold 3 states:- 
    * pending
    * fulfilled
    * rejected
*/

const myPromise = new Promise((resolve, reject) => {
    const error = false;
    if (!error) {
        resolve("Yes, resolved the promise");
    }
    else {
        reject("Rejected the promise");
    }
});

console.log(myPromise); //just displays the state, doen't return value+1 and then we console.log...so, first promise is dont, then first 'then' and then second 'then'
//read as follows: first we get the promise fulfilled, then we return value+
myPromise.then(value => {
    return value + 1;
}).then(newValue => {
    console.log(newValue)
}).catch(err => { //catch if error occurs
    console.log(err);
})

//so, its basically like telling js...do this first, then this, and then this...unless the first one is done, don't do second and untill second is done, don't do the third