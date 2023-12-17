import React from "react";
import './Styles/style.css';

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
        <footer className="Footer">
            <button onClick={handelDecrease}> - </button> {/* del */}
            <p style={{ display: 'inline-block' }}> {counter} </p>
            <button onClick={handleIncrease}> + </button> {/* del */}
            <p className="para"> Copyright &copy; {today.getFullYear()} </p>
        </footer >
    );
};
export default Footer;