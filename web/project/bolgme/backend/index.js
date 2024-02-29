import express from 'express'
import cors from 'cors';
import mongoose from 'mongoose';
import userModel from './models/Users.js';
import bcrypt from 'bcryptjs';
import jwt from 'jsonwebtoken';
import cookieParser from 'cookie-parser';

const app = express();
app.use(cors({ credentials: true, origin: 'http://localhost:5173' }));

const port = 3000;

app.use(express.json()); // middleware json parser
app.use(cookieParser());

mongoose.connect('mongodb+srv://bosesayan0000:5DTP2SrOm0KuC3A1@cluster0.lb9dlo1.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0');

app.post('/signup', async (req, res) => {
  let { userName, userEmail, userPassword } = req.body;

  const salt = bcrypt.genSaltSync(10); // bcryptjs
  userPassword = bcrypt.hashSync(userPassword, salt);

  try {
    const userDoc = await userModel.create({
      userName,
      userEmail,
      userPassword
    })

    res.json(userDoc);

  } catch (e) {
    res.status(404).json(e);
  }
});

const secretKey = 'wee5wg15w+9w24tu24g42+65446eagahuhjbdzjhvjhk'; // to be used in jwt

app.post('/login', async (req, res) => {
  let { userName, userPassword } = req.body;
  const userDoc = await userModel.findOne({ userName: userName }); // finding username from database.
  if (userDoc) {
    const passOk = bcrypt.compareSync(userPassword, userDoc.userPassword); // first one is from login page, second one is from databse 


    //JWT
    if (passOk) {
      jwt.sign({ userName, id: userDoc._id }, secretKey, {}, (err, token) => {  // jwt.sign(payload, secretOrPrivateKey, options, callback)
        if (err) throw err;
        res.cookie('token', token);
        res.send({
          userName
        })
      });

      console.log("Logged In")
    }
    else {
      console.log("Error")
      res.status(400).json("Incorrect Credentials")
    }
  }
})

// Endpoint for checking if token is valid
app.get('/profile', (req, res) => {
  const { token } = req.cookies;
  jwt.verify(token, secretKey, {}, (err, info) => {
    if (err) throw err;
    res.json(info);
  })
})

app.post('/logout', (req, res) => {
  res.cookie('token', '').json('ok'); // converts the token to empty string and sends ok response
})


app.listen(port, () => {
  console.log(`Example app listening on port http://localhost:${port}`);
})

/* signup database: 

username- bosesayan0000, 
password- 5DTP2SrOm0KuC3A1
connection string-mongodb+srv://bosesayan0000:5DTP2SrOm0KuC3A1@cluster0.lb9dlo1.mongodb.net/

*/