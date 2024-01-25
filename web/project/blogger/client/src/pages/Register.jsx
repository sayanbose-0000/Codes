import { useState } from "react";
import Header from "./Header";
import axios from 'axios';

const Register = () => {
    const [error, setError] = useState('');

    const [userName, setUserName] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');

    const handleRegister = (e) => {
        e.preventDefault();

        // Send a POST request

        axios({
            method: 'post',
            url: 'http://localhost:3000/register',
            headers: {
                "Content-Type": "application/json"
            },
            data: {
                userName: userName,
                email: email,
                password: password
            }
        })
            .then((response) => {
                console.log(response)
            })
            .catch((e) => {
                console.log(e)
            })
    }

    return (
        <div className="register signinupcontainer" >
            <Header />

            <form className="signinup" onSubmit={(e) => { handleRegister(e) }}>
                <h1>Register</h1>
                <input type="text" placeholder="Enter name..." value={userName} onChange={(e) => { setUserName(e.target.value) }} />
                <input type="email" placeholder="Enter email..." value={email} onChange={(e) => { setEmail(e.target.value) }} />
                <input type="password" placeholder="Enter password..." value={password} onChange={(e) => { setPassword(e.target.value) }} />
                <button>Sign Up</button>
            </form>
        </div>
    );
};

export default Register;