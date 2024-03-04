import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'
import { RouterProvider, createBrowserRouter } from "react-router-dom";
import ErrorPage from './ErrorPage.jsx';
import Layout from './Layout.jsx';
import Login from './Login.jsx';
import SignUp from './SignUp.jsx';
import { UserContextProvider } from './UserContext.jsx';
import CreatePost from './CreatePost.jsx';
import PostPage from './PostPage.jsx';
import EditPost from './EditPost.jsx';

const router = createBrowserRouter([
  {
    path: "/",
    element: <Layout />,
    errorElement: <ErrorPage />,

    children: [ /* Outlet used here */
      {
        path: "/",
        element: <App />
      },
      {
        path: "/login",
        element: <Login />
      },
      {
        path: "/signup",
        element: <SignUp />
      },
      {
        path: "/create",
        element: <CreatePost />
      },
      {
        path: "/posts/:id",
        element: <PostPage />
      },
      {
        path: "/edit/:id",
        element: <EditPost />
      }
    ],

  },

]);

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <UserContextProvider>
      <RouterProvider router={router} />
    </UserContextProvider>
  </React.StrictMode>,
)
