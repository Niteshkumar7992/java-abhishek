const prompt = require("prompt-sync")();
const choices = ["Paper", "Rock", "Scissor"];

const random = Math.floor(Math.random() * choices.length);
let ComputerInput = String(choices[random]);


console.log(typeof(ComputerInput));
let UserInput = prompt("Enter you choice ->");

function capitalizeFirstLetter(UserInput) {
    return UserInput.charAt(0).toUpperCase() + UserInput.slice(1);
}
let UserInput1 = capitalizeFirstLetter(UserInput);
console.log("Computer choose :" + ComputerInput);
console.log("You choose : " + UserInput1);
if (ComputerInput == UserInput1) {
    console.log("TIE");
} else if (UserInput1 == "Rock" && ComputerInput == "Scissor" ||
    UserInput1 == "Paper" && ComputerInput == "Rock" ||
    UserInput1 == "Scissor" && ComputerInput == "Paper") {
    console.log("You won");
} else {
    console.log("ALAS!! YOU LOST");
}