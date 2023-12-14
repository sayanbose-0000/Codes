import express from 'express'; //not build in module... so we don't use node:express
const app = express();
const port = 3000;

app.get('/', (req, res) => {
    res.send('Hello World!');
});

app.get('/about', (req, res) => {
    res.send('About!');
});

app.get('/contact', (req, res) => {
    res.send('Contact!');
});

app.get('/bye', (req, res) => {
    res.send('bye!');
});

app.get('/', (req, res) => {
    res.send('Hello World!');
})

app.listen(port, () => {
    console.log(`Example app listening on port ${port}`);
})