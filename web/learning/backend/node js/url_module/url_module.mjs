import url from 'node:url'; //we can also write import url from 'url' but that is not recommended

const myUrl=new URL('https://example.org');
myUrl.pathname='/a/b/c';
myUrl.search='?d=e';
myUrl.hash='#fgh';

console.log(myUrl);
console.log(myUrl.href);