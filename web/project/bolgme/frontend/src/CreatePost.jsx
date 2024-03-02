import ReactQuill from 'react-quill';
import 'react-quill/dist/quill.snow.css';
import { Navigate } from 'react-router-dom';

import './styles/CreatePost.css'
import { useState } from 'react';

const CreatePost = () => {
  const [title, setTitle] = useState('');
  const [summary, setSummary] = useState('');
  const [file, setFile] = useState(null);
  const [content, setContent] = useState('');
  const [redirect, setRedirect] = useState(false);

  const modules = {
    toolbar: [
      [{ 'header': [1, 2, false] }],
      ['bold', 'italic', 'underline', 'strike', 'blockquote'],
      [{ 'list': 'ordered' }, { 'list': 'bullet' }, { 'indent': '-1' }, { 'indent': '+1' }],
      ['link', 'image'],
      ['clean']
    ],
  };

  const formats = [
    'header',
    'bold', 'italic', 'underline', 'strike', 'blockquote',
    'list', 'bullet', 'indent',
    'link', 'image'
  ];


  const handleCreateNewPost = async (e) => {
    e.preventDefault();

    const formData = new FormData();
    formData.append('title', title);
    formData.append('summary', summary);
    formData.append('file', file);
    formData.append('content', content);

    console.log(formData);

    const response = await fetch('http://localhost:3000/post', {
      method: 'POST',
      body: formData,
      credentials: 'include',
    })

    if (response.ok) {
      setRedirect(true);
    }
  }

  if (redirect) {
    return <Navigate to={"/"} />
  }

  return (
    <div className="createpost">
      <form className='createform' onSubmit={(e) => { handleCreateNewPost(e) }}>
        <input type="text" placeholder="Title" value={title} onChange={(e) => { setTitle(e.target.value) }} required />
        <input type="text" placeholder="Summary" value={summary} onChange={(e) => { setSummary(e.target.value) }} required />
        <input type="file" onChange={(e) => { setFile(e.target.files[0]) }} required />
        <ReactQuill className='textarea' value={content} onChange={(val) => { setContent(val) }} modules={modules} formats={formats} required />
        <button className='button'>Post</button>
      </form>
    </div>
  );
};

export default CreatePost;