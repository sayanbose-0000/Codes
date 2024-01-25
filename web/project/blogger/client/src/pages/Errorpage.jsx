import { Link } from "react-router-dom";

const Errorpage = () => {
    return (
        <div style={getStyles().container}>
            <h1 style={getStyles().heading}>Oops! Page Not Found!</h1>
            <p style={getStyles().message}>We're sorry, but the page you are looking for does not exist.</p>
            <Link to="/">Go to home</Link>
        </div>
    );
};

const getStyles = () => {
    return {
        container: {
            display: 'flex',
            flexDirection: 'column',
            alignItems: 'center',
            justifyContent: 'center',
            height: '100vh',
            fontFamily: 'Arial, sans-serif',
        },
        heading: {
            fontSize: '4rem',
            color: '#e74c3c',
            marginBottom: '10px',
        },
        message: {
            fontSize: '1.5rem',
            color: '#333',
            marginBottom: '20px',
        },
        image: {
            width: '300px',
            marginBottom: '20px',
        },
    };
};

export default Errorpage;
