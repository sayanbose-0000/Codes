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

app.listen(port, () => {
  console.log(`Example app listening on port http://localhost:${port}`);
})