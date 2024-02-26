import './styles/LoginInAndSignUp.css';
import { useState } from 'react';

const Login = () => {

  const [userPassword, setUserPassword] = useState('')
  const [userEmail, setUserEmail] = useState('');

  const handleUserEmailChange = (e) => {
    setUserEmail(e.target.value);
  }

  const handleUserPasswordChange = (e) => {
    setUserPassword(e.target.value);
  }

  const handleSubmit = async (e) => {

    await fetch('http://localhost:3000/login', {
      method: 'POST',
      body: JSON.stringify({
        userEmail,
        userPassword
      }),
      headers: { 'Content-Type': 'application/json' }
    })

    e.preventDefault();
  }

  return (
    <>
      <div className="containregister">
        <h1>Login</h1>
        <form action="" className='loginandsignup' onSubmit={(e) => { handleSubmit(e) }}>
          <input type="email" placeholder='Enter Email...' value={userEmail} onChange={(e) => { handleUserEmailChange(e) }} />
          <input type="password" name="" id="" placeholder='Enter Password...' value={userPassword} onChange={(e) => { handleUserPasswordChange(e) }} />
          <button>Submit</button>
        </form>
      </div>
    </>
  );
};

export default Login;