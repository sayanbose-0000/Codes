import express from 'express'
import cors from 'cors';

const app = express();
app.use(cors());

const port = 3000;

app.use(express.json()) // middleware json parser

app.post('/signup', (req, res) => {
  const { userName, userEmail, userPassword } = req.body;
  res.send(
    {
      reqData: {
        userName,
        userEmail,
        userPassword
      }
    }
  );
})

app.post('/login', (req, res) => {
  const { userName, userEmail, userPassword } = req.body;
  res.send(
    {
      reqData: {
        userEmail,
        userPassword
      }
    }
  );
})

app.listen(port, () => {
  console.log(`Example app listening on port http://localhost:${port}`);
})

/* signup database: 

username- bosesayan0000, 
password- 5DTP2SrOm0KuC3A1
connection string-mongodb+srv://bosesayan0000:5DTP2SrOm0KuC3A1@cluster0.lb9dlo1.mongodb.net/
*/