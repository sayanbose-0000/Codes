import React from "react";

let handleNameChange = () => {
    let myNames = ["Sayan", "Ayan", "Gayan", "Payan", "Ryan"];
    let randomIdx = Math.floor(Math.random() * myNames.length);
    return myNames[randomIdx];
}

let handleClick = (name) => {
    console.log(`${name} was clicked`);
}

const Content = () => {
    return (
        <main>
            <p className="paragraph">
                Hello {handleNameChange()}
                <button onClick={() => { handleClick('Sayan') }}>Click Me</button>
            </p>
        </main>
    );
};
export default Content;