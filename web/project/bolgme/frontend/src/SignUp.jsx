import { useState } from "react";

const SignUp = () => {

  const [userName, setUserName] = useState('');
  const [userPassword, setUserPassword] = useState('')
  const [userEmail, setUserEmail] = useState('');
  const [error, setError] = useState('');

  const handleUserEmailChange = (e) => {
    setUserEmail(e.target.value);
  }

  const handleUserNameChange = (e) => {
    setUserName(e.target.value);
  }

  const handleUserPasswordChange = (e) => {
    setUserPassword(e.target.value);
  }

  const handleSubmit = async (e) => {
    e.preventDefault();

    const response = await fetch('http://localhost:3000/signup', {
      method: 'POST',
      body: JSON.stringify({
        userName,
        userEmail,
        userPassword
      }),
      headers: { 'Content-Type': 'application/json' }
    })
    console.log(response)

    if (response.statusText === "OK") {
      setError("Successful Sign Up")
    }
    else {
      setError("Sign up not successful. Try again later!")
    }
  }

  return (
    <>
      <div className="containregister">
        <h1>Sign Up</h1>
        <form action="" className='loginandsignup' onSubmit={(e) => { handleSubmit(e) }}>
          <input type="email" placeholder='Enter Email...' value={userEmail} onChange={(e) => { handleUserEmailChange(e) }} />
          <input type="text" placeholder='Enter Username...' value={userName} onChange={(e) => { handleUserNameChange(e) }} />
          <input type="password" name="" id="" placeholder='Enter Password...' value={userPassword} onChange={(e) => { handleUserPasswordChange(e) }} />
          <button>Submit</button>
          <p style={{ color: "red", width: "100%",textAlign: "center" }}>{error}</p>
        </form>
      </div>
    </>
  );
};

export default SignUp;