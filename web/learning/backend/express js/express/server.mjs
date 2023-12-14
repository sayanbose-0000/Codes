import express from 'express';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

const __filename = fileURLToPath(import.meta.url); //import.meta.url returns url
const __dirname = path.dirname(__filename);

const app = express();
const port = 8000;

app.get('/', (req, res) => {
  res.send("Hello World!");
});

app.get('/about', (req, res) => {
  res.sendFile(path.join(__dirname, 'index.html'));
});

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});
