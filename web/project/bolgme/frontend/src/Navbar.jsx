import { Link } from 'react-router-dom';
import './styles/Navbar.css'
import { useContext, useEffect, useState } from 'react';
import { UserContext } from './UserContext';

const Navbar = () => {
  // const [userName, setUserName] = useState(null);
  const { userInfo, setUserInfo } = useContext(UserContext);

  // will run everytime we mount
  useEffect(() => {
    fetch('http://localhost:3000/profile', {
      credentials: 'include',
    })

      .then((response) => {
        return response.json()
      })

      .then((userInfo) => {
        setUserInfo(userInfo); // we will grab the username later
      })

  }, [])

  const userName = userInfo?.userName;

  const handleLogOut = () => {
    fetch('http://localhost:3000/logout', {
      credentials: 'include',
      method: 'POST',
    })
    setUserInfo(null);
  }

  return (
    <nav className="navbar">
      <Link to="/">Bolgme</Link>
      <div className="register">
        {userName ?
          <>
            <p>{userName}</p>
            <Link to="/create">Post</Link>
            <a style={{ cursor: "pointer" }} onClick={handleLogOut}> Logout </a>
          </>
          :
          <>
            <Link to="/login">Login</Link>
            <Link to="/signup">Sign Up</Link>
          </>
        }
      </div>
    </nav>
  );
};

export default Navbar;