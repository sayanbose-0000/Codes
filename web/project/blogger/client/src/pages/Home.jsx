import { Outlet } from "react-router-dom";
import Header from "./Header.jsx";
import Content from "./Content.jsx";

const Home = () => {
  return (
    <>
      <Header />
      <Content />
    </>
  );
};

export default Home;