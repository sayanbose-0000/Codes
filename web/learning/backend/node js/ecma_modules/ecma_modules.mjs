//note the .mjs extension for the file

import { greet as morning, groot as gg, ironman as steelman } from "./temp.mjs"; //greet will be used as morning() and so on
import * as cat from "./temp.mjs";   //imports everyting we have exported in the other file

morning();
gg();
console.log(steelman);

console.log(cat);
console.log(cat.groot());