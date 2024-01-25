import "./styles/app.css";
import React from 'react';
import ReactDOM from 'react-dom/client';
import { createBrowserRouter, RouterProvider, useRouteError } from "react-router-dom";
import Home from "./pages/Home";
import Errorpage from "./pages/Errorpage";
import Login from "./pages/Login";
import Register from "./pages/Register";
import Content from "./pages/Content";

const router = createBrowserRouter([
  {
    path: "/",
    element: <Home />,
    errorElement: <Errorpage />,
  },
  {
    path: "/login",
    element: <Login />,
  },
  {
    path: "/register",
    element: <Register />,
  },
]);

ReactDOM.createRoot(document.getElementById("root")).render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>
);