import './styles/LoginInAndSignUp.css';
import { useContext, useState } from 'react';
import { Navigate } from 'react-router-dom';
import { UserContext } from './UserContext';

const Login = () => {

  const [userPassword, setUserPassword] = useState('')
  const [userName, setUserName] = useState('');
  const [error, setError] = useState('');
  const [redirect, setRedirect] = useState(false);
  const { userInfo, setUserInfo } = useContext(UserContext);

  const handleUserNameChange = (e) => {
    setUserName(e.target.value);
  }

  const handleUserPasswordChange = (e) => {
    setUserPassword(e.target.value);
  }

  const handleSubmit = async (e) => {
    e.preventDefault();
    setError("Unsucessful Login")

    const response = await fetch('http://localhost:3000/login', {
      method: 'POST',
      body: JSON.stringify({
        userName,
        userPassword
      }),
      headers: { 'Content-Type': 'application/json' },
      credentials: "include" // cookie will be included with the react app
    })

    console.log(response)

    setError("Unsucessful Login")

    if (response.ok) {
      response.json().then((userName) => {
        setUserInfo(userName);
        setError("Successful Login");
        setRedirect(true);
      })
    }
  }

  if (redirect) {
    return <Navigate to={"/"} />
  }

  return (
    <>
      <div className="containregister">
        <h1>Login</h1>
        <form action="" className='loginandsignup' onSubmit={(e) => { handleSubmit(e) }} required>
          <input type="text" placeholder='Enter User Name...' value={userName} onChange={(e) => { handleUserNameChange(e) }} required />
          <input type="password" name="" id="" placeholder='Enter Password...' value={userPassword} onChange={(e) => { handleUserPasswordChange(e) }} required />
          <button>Submit</button>
          <p style={{ width: "100%", textAlign: "center" }}>{error}</p>
        </form>
      </div>
    </>
  );
};

export default Login;