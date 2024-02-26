import express from 'express'
import cors from 'cors';
import mongoose from 'mongoose';
import userModel from './models/Users.js';

const app = express();
app.use(cors());

const port = 3000;

app.use(express.json()); // middleware json parser

mongoose.connect('mongodb+srv://bosesayan0000:5DTP2SrOm0KuC3A1@cluster0.lb9dlo1.mongodb.net/');

app.post('/signup', async(req, res) => {
  const { userName, userEmail, userPassword } = req.body;

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
})

// app.post('/login', (req, res) => {
//   const { userName, userEmail, userPassword } = req.body;
//   res.send(
//     {
//       reqData: {
//         userEmail,
//         userPassword
//       }
//     }
//   );
// })

app.listen(port, () => {
  console.log(`Example app listening on port http://localhost:${port}`);
})

/* signup database: 

username- bosesayan0000, 
password- 5DTP2SrOm0KuC3A1
connection string-mongodb+srv://bosesayan0000:5DTP2SrOm0KuC3A1@cluster0.lb9dlo1.mongodb.net/
*/