import { Link } from 'react-router-dom';
import './styles/Navbar.css'

const Navbar = () => {
  return (
    <nav className="navbar">  
      <Link to="/">Bolgme</Link>
      <div className="register">
        <Link to="/login">Login</Link>
        <Link to="/signup">Sign Up</Link>
      </div>
    </nav>
  );
};

export default Navbar;