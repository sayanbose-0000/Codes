import { Link } from "react-router-dom";

const Header = () => {
  return (
    <main className="header">
      <header>
        <Link to="/" className="logo">bolgme</Link>
        <nav>
          <Link to="/login" className="linkheader">Login</Link>
          <Link to="/register" className="linkheader">Register</Link>
        </nav>
      </header>
    </main>
  );
};

export default Header;