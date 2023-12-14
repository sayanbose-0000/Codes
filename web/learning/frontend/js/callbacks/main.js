//Callbacks functions are functions that are passed to other functions as parameters
function firstFunction(parameters, callback) {  //here we pass the callback as a parameter
    //other codes
    callback(); //callback gets called inside the function
}

firstFunction(parameter, function () { //callback fuucntion taken as argument
    secondFunction(parameter, function () {
        thrirdFunction(parameter, function () {
            //other codes
        })
    })
})

// CALLBACK HELL-> we can see that the nexting of functions make it difficult to maintain and understand the code. This is known as CALLBACK HELL