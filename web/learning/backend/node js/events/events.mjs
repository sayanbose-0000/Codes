import { EventEmitter } from 'node:events';

class MyEmitter extends EventEmitter { }

const myEmitter = new MyEmitter();
myEmitter.on('myEvent', () => {
    console.log('Ayoo! Event chala gaya ji');
    setTimeout(() => {
        console.log('Band kar na re');
    }, 3000);
});
myEmitter.emit('myEvent'); //firing the event