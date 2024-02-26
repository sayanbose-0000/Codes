import './styles/ErrorPage.css';
import { Link } from 'react-router-dom';

const ErrorPage = () => {
  return (
    <>
      <div className="errorpage">
        <h1>Oops!</h1>
        <p>Page Not Found!</p>
        <p className='light'>Make sure you entered the correct url</p>
        <p className='light'>Return to <Link to="/" >home</Link></p>
      </div>
    </>
  );
};

export default ErrorPage;