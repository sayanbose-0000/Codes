import './styles/Entries.css';
import { Link } from 'react-router-dom';

const Entries = ({ _id, content, createdAt, image, summary, title, author }) => {
  const dateObj = new Date(createdAt);
  const date = dateObj.getDate() + '-' + dateObj.getMonth() + '-' + dateObj.getFullYear();
  const time = dateObj.getHours() + ":" + dateObj.getMinutes() + ":" + dateObj.getSeconds();

  return (
    <>
      <Link to={`/posts/${_id}`} style={{ textDecoration: "none" }}>
        <div className="entries">
          <img src={`http://localhost:3000/${image}`} />
          <div className="date">
            <span>{author}</span>
            <span>{date}</span>
            <span>{time}</span>
          </div>
          <h3>{title}</h3>
          <p>{summary}</p>
        </div>
      </Link >
    </>
  );
};

export default Entries;