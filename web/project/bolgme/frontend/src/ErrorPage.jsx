import './styles/ErrorPage.css';

const ErrorPage = () => {
  return (
    <>
      <div className="errorpage">
        <h1>Oops!</h1>
        <p>Page Not Found!</p>
        <p className='light'>Make sure you entered the correct url</p>
      </div>
    </>
  );
};

export default ErrorPage;