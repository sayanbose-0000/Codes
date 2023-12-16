import React from "react";

const Content = () => { // always use react hooks at top level of returning function (Component function)

    const [name, setName] = React.useState("Sayan"); // "Sayan" is the default state when page loads

    let handleNameChange = () => {
        let myNames = ["Sayan", "Ayan", "Gayan", "Payan", "Ryan"];
        let randomIdx = Math.floor(Math.random() * myNames.length);
        setName(myNames[randomIdx]);
    }

    return (
        <main>
            <p className="paragraph">
                Hello {name}
                <button onClick={handleNameChange}>Click Me</button>
            </p>
        </main>
    );
};
export default Content;