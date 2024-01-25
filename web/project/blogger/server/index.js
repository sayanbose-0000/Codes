import express from 'express';
import cors from "cors"

const app = express()
const port = 3000

app.use(cors()) // prevent cors error
app.use(express.json()) // middleware- used to communicate between front and backend

app.post('/register', (req, res) => {
    const { userName, email, password } = req.body;

    res.send({
        requestdata: {
            userName,
            password
        }
    })
})

app.listen(port, () => {
    console.log(`App listening on port http://localhost:${port}`)
})

// password- hsi1CpiTf9fPUjqA
// connrction string- 