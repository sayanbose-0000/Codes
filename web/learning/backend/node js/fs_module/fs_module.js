const fs = require('fs');
fs.readFile('file.txt', 'utf-8', (err, data) => { //non blocking...will execute the entire code aferwards and then work
  console.log(err, data, "for readFile");
});

const a = fs.readFileSync('file.txt'); //blocking...will execute this code first and then go to nexts
console.log(a,"for read file sync");//buffer printing

console.log(a.toString,"for read file sync"); //file content printing

fs.writeFile('file.txt', "I am a cat" , () => { //non blocking...will execute the entire code aferwards and then work
  console.log("Written in file");
});

b= fs.writeFileSync("file.txt","Meow");
