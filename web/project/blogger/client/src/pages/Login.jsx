import Header from "./Header";

const Login = () => {
    return (
        <div className="login signinupcontainer">
            <Header />

            <form className="signinup">
                <h1>Login</h1>
                <input type="email" placeholder="Enter email..." />
                <input type="password" placeholder="Enter password..." />
                <button>Log In</button>
            </form>
        </div>
    );
};

export default Login;