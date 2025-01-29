var userText = prompt("Type something and I'll check if it's a palindrome: "); //gets the initial user input that we're checking
var reverseText = userText.split('').reverse().join(''); //new variable that copies userText, converts it to an array of every character, reverses the array, then converts it back to a string

console.log(`Original: ${userText}\nReverse:  ${reverseText}\n`);
if(userText == reverseText){
    console.log("Palindrome :D"); //a palindrome is the same string forwards and backwards
}else{
    console.log("Not a Palindrome :("); //it isn't a palindrome if it's different backwards
}