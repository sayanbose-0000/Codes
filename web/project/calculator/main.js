const buttons = document.querySelectorAll(".buttons");
const display = document.querySelector(".display");

let string = "";
buttons.forEach(element => {
    element.addEventListener('click', event => {
        let value = event.target.innerHTML;

        if (value === "C") {
            string = "";
        }

        else if (value === "=") {
            string = eval(string);
        }

        else if (value === "&lt;") {
            string = string.slice(0, -1);
        }

        else {
            if (value === "x") {
                value = "*";
            }
            if (value === "÷") {
                value = "/";
            }
            string = string + value;
        }
        display.innerHTML = string;

    })

});