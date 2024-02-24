import './styles/Navbar.css'

const Navbar = () => {
  return (
    <nav className="navbar">
      <a href="">Bolgme</a>
      <div className="register">
        <a href="">Login</a>
        <a href="">SignUp</a>
      </div>
    </nav>
  );
};

export default Navbar;