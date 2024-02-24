import './styles/App.css';
import Navbar from './Navbar';
import Entrymain from './Entrymain';

const App = () => {
  return (
    <>
      <Navbar></Navbar>
      <section className='bodysection'>
        <Entrymain></Entrymain>
      </section>
    </>
  );
};

export default App;