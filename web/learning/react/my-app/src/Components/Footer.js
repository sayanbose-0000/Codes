import React from "react";

const Footer = () => {

    const [counter, setCounter] = React.useState(0);

    let today = new Date();

    let handleIncrease = () => {
        setCounter(counter + 1);
    }

    let handelDecrease = () => {
        setCounter(counter - 1);
    }

    return (
        <footer>
            <p className="para">Copyright &copy; {today.getFullYear()}</p>
            <button onClick={handelDecrease}>-</button> {/* del */}
            <p style={{ display: 'inline-block' }}>{counter}</p>
            <button onClick={handleIncrease}>+</button> {/* del */}
        </footer >
    );
};
export default Footer;