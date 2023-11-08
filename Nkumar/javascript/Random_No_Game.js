const prompt = require("prompt-sync")();

console.log(".................This is a luck chance game............");
console.log("...If you guess the number right in the chosen chances, you will win......");
console.log("............The number is between 1 to 100......................");
let a = prompt("Enter the number of chances you want to take to guess the number: ");
let chances = Number(a);
const MaxChances = 20;
const NUMBER = 65;

let ans = 0;
let guessed = false;
if (chances > MaxChances) {
    console.log(`${chances} is not allowed`);
    console.log(`MAX chances allowed : ${MaxChances}`)
} else {
    for (let i = 0; i < chances; i++) {
        ans = prompt("Enter your guessed number: ");

        if (ans == NUMBER) {
            console.log(`YOU WON!!! You have guessed it right, in ${i} chances`);
            guessed = true;
            break;
        } else if (ans > NUMBER) {
            console.log("HINT: The number is smaller.");
        } else if (ans < NUMBER) {
            console.log("HINT: The number is bigger.");
        } else {
            console.log("Invalid input.");
        }
    }
}

if (!guessed) {
    console.log("Sorry, you've exceeded the chances. Better luck next time!");
    console.log(`you can't got the number in ${chances} chance`);
}