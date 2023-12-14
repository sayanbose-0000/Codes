import * as http from 'node:http'; //since they are built in modules, we use node:http
import * as fs from 'node:fs'; //since they are built in modules, we use node:http

const port = 8000;

const server = http.createServer((req, res) => {
    res.setHeader('Content-Type','text/html');
    console.log(req.url);
    if(req.url=='/'||req.url=='/one'){
        res.statusCode = 200;
        let meow=fs.readFileSync('one.html');
        res.end(meow.toString());
    }
    else if(req.url=='/two'){
        res.statusCode = 200;
        let meow=fs.readFileSync('two.html');
        res.end(meow.toString());
    }
    else if(req.url=='/three'){
        res.statusCode = 200;
        let meow=fs.readFileSync('three.html');
        res.end(meow.toString());
    }
    else if(req.url=='/four'){
        res.statusCode = 200;
        let meow=fs.readFileSync('four.html');
        res.end(meow.toString());
    }
    else{
        res.statusCode=404;
        res.end('<h1>Page Not found!</h1>');
    }
});

server.listen(port, ()=>{
    // console.log(`Page in url ${url}`)
})