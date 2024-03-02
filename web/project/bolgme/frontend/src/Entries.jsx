import './styles/Entries.css';

const Entries = ({ content, createdAt, image, summary, title, author }) => {

  const dateObj = new Date(createdAt);
  const date = dateObj.getDate() + '-' + dateObj.getMonth() + '-' + dateObj.getFullYear();
  const time = dateObj.getHours() + ":" + dateObj.getMinutes() + ":" + dateObj.getSeconds();

  return (
    <>
      <div className="entries">
        <img src={'http://localhost:3000/' + image} />
        <div className="date">
          <span>{author}</span>
          <span>{date}</span>
          <span>{time}</span>
        </div>
        <h3>{title}</h3>
        <p>{summary}</p>
      </div>
    </>
  );
};

export default Entries;