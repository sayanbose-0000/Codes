let str="This is a string";

let position=str.indexOf("is"); //first occurence location of a sub-string inside another string

let position2=str.lastIndexOf("is"); //last occurence of location of sub-string inside another string

let substring=str.slice(0,3); //shows substring, 3rd position is excluded. So, characters in position 0,1,2 are shown...can take -ve values

let substring2=str.substring(0,3); /*shows substring, 3rd position is excluded. So, characters in position 0,1,2 are shown...cannot take -ve values..If -ve is given, it is treated as 0*/

let newReplacedStr=str.replace("string","Sayan Bose")

let upperCasedStr=str.toUpperCase();

let lowerCasedStr=str.toLowerCase();

let concatedString=str.concat(" Ming"); //Adds two string. We can also use +
let concatedStringUsingPlus=str+" Zing"; //same as above

let stringWithWhiteSpaces="    There    is   a   l  o  t   of white spaces     ";
console.log(stringWithWhiteSpaces);
console.log(stringWithWhiteSpaces.trim());  //trims whietspaces at the beginning and end of the string only, not on the middle

let charAtPos2=str.charAt(2); //shows character at pos 2. We can also do:
let charAtPos2EasyVersion=str[2];

let charCodeAtPos2=str.charCodeAt(2); //shows UTF-8 code of char at pos 2

console.log(charAtPos2EasyVersion);