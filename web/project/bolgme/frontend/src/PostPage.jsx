import { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import './styles/PostPage.css';
import DOMPurify from 'dompurify';
import { useContext } from 'react';
import { UserContext } from './UserContext';
import { Link } from 'react-router-dom';

const PostPage = () => {
  const [postInfo, setpostInfo] = useState(null);
  const { userInfo } = useContext(UserContext);

  const { id } = useParams();

  useEffect(() => {
    fetch(`http://localhost:3000/post/${id}`).then((res) => {
      res.json().then((post) => {
        setpostInfo(post);
      })
    })

  }, [])

  // console.log(postInfo)

  if (!postInfo) {
    return '';
  }

  const htmlContent = postInfo.content;

  const sanitizedhtmlContent = DOMPurify.sanitize(htmlContent);

  const dateObj = new Date(postInfo.createdAt);
  const date = dateObj.getDate() + '-' + dateObj.getMonth() + '-' + dateObj.getFullYear();
  const time = dateObj.getHours() + ":" + dateObj.getMinutes() + ":" + dateObj.getSeconds();

  return (
    <div className='postpage'>
      <img src={`http://localhost:3000/${postInfo.image}`} />

      <div className="content">

        <div className="details">
          <p className='date_time'>
            <span>{date}</span>
            <span>{time}</span>
          </p>
        </div>

        <div className="heading">
          <h3> {postInfo.title} </h3>
          <p>~ {postInfo.author.userName}</p>
        </div>

        {
          userInfo.id === postInfo.author._id ?
            <div className='edit-container'>
              <Link to={`/edit/${postInfo._id}`}>
                <button className='edit'>Edit Post</button>
              </Link>
            </div>
            :
            null
        }

        <p>{postInfo.summary}</p>
        <p dangerouslySetInnerHTML={{ __html: sanitizedhtmlContent }}></p>
      </div>
    </div>
  );
};

export default PostPage;