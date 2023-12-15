import React from "react";

let today = new Date();

const Footer = () => {
    return (
        <footer>
            <p className="para">Copyright &copy; {today.getFullYear()}</p>
        </footer>
    );
};
export default Footer;