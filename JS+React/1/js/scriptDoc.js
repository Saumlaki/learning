const box = document.getElementById('box');
console.log(box);

const buttons = document.getElementsByTagName("button");
console.log(buttons);

const hearts = document.querySelectorAll(".heart");
hearts.forEach(a=>console.log(a));

const oneHeart = document.querySelector(".heart");

const div = document.createElement("div");
div.classList.add('black');

document.body.append(div);