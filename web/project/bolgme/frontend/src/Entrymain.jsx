import Entries from "./Entries";
import './styles/Entrymain.css';
import { useEffect, useState } from "react";

const Entrymain = () => {

  const [post, setPost] = useState([]);

  useEffect(() => {
    fetch('http://localhost:3000/post').then((res) => {
      res.json().then((posts) => {
        setPost(posts);
      })
    })
  }, [])



  return (
    <div className="entrymain">
      {post.map((p) => {
        return <Entries key={p._id} content={p.content} createdAt={p.createdAt} image={p.image} summary={p.summary} title={p.title} author={p.author.userName} />;
      })}
    </div>
  );
};

export default Entrymain;