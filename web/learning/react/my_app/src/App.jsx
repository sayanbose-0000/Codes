import Header from "./Components/Header";
import Content from "./Components/Content";
import Footer from "./Components/Footer";

function App() {
  return (
    <>
      <Header para="This is prop para" title="This is prop heading"></Header> {/* Applying props to Header and using it in Header.js */}
      <Content></Content> 
      <Footer></Footer>
    </>
  );
};

export default App;
