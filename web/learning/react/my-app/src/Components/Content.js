import React from "react";

let handleNameChange = () => {
    let myNames = ["Sayan", "Ayan", "Gayan", "Payan", "Ryan"];
    let randomIdx = Math.floor(Math.random() * myNames.length);
    return myNames[randomIdx];
}

const Content = () => {
    return (
        <main>
            Hello {handleNameChange()}
        </main>
    );
};
export default Content;