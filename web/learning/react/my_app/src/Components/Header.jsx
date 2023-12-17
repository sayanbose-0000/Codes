import React from "react";
import './Styles/style.css';

const Header = (props) => {

    return (
        <header className="Header">
            <h1>{props.title}</h1> {/* props used */}
            <p>{props.para}</p> {/* props used */}
            
        </header>
    );
};

Header.defaultProps = {
    /* Default props are used when there is a problem with the passed prop (eg: and API given as prop isn't working) */
    title: "I am a title and I am not available",
    para: "I am a paragraph and I am not available"
};

export default Header;


