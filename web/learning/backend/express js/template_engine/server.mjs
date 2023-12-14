import express from 'express';
import pug from 'pug';
import { dirname, join } from 'path'; // Import the 'dirname' and 'join' functions from the 'path' module
import { fileURLToPath } from 'url'; // Import 'fileURLToPath' from 'url' module

const app = express();
const port = 8000;

const __filename = fileURLToPath(import.meta.url); // import.meta.url returns a URL
const __dirname = dirname(__filename); // Use the 'dirname' function from 'path' module

app.set('view engine', 'pug');
app.set('views', join(__dirname, 'template')); // Use 'join' function from 'path' module

app.get('/', (req, res) => {
    res.send("Hello World!");
});

app.get('/demo', (req, res) => {
    res.render('demoFile', { title: 'Hey', message: 'Hello there!' });
});

app.listen(8000, () => {
    console.log(`Listening on port ${port}`);
});
