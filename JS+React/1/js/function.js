let num = 20;

function showFirstMessage(text){
    console.log(text);
    num = 30;
}

const logger = function(){
    console.log("hello")
};

logger();

const calc = (a, b)=>a+b;//Стрелочная функция

showFirstMessage("Hello world");
console.log(num);

function start(){
    
}

//Задание
function showMyDB(object){

    if(!object.privat) {console.dir(object);}
}
function writeYourGenres(){
    const genres = [];
    for (let index = 0; index < 3; index++) {
        
        let result = prompt(`Ваш любимый жанр под номером ${index}`);
        genres[index] = result;
    }
}

//Call bask func
function first(){
    setTimeout(function(){
        console.log(1);
    },500);
}

function second(){
    console.log(2);
}

first();
second();


//!!!!!!!!!!!!!!!!!!!111
//Call bask func
function learnJS(lang, callback){
    console.log(`Я учу ${lang}`);
    callback();
}

learnJS("java script", function(){console.log("Йо хо хо");});

//Объекты
const obj = new Object();

const options = {
name:"test",
width:1024,
height:1024,
colors:{
    border:"black",
    bg:"red",  
},
myFun:function(){
    console.log(10);
}
};

console.log(Object.keys(options));

//Удаление свойства
delete options.name;

//Перебор свойств
for(let key in options){
    console.log(`свойство ${key} - значение:${options[key]}`);
}

//ДЕструктуризация
const {border, bg} = options.colors;
console.log(border);

//масивы

arr.pop();

for (let index = 0; index < array.length; index++) {
    const element = array[index];
    
}

//for (const iterator of object) {
    
//}
const arr2 = [1,12,3,4,5,6];
arr2.forEach(function(item,i, arr){
    console.log(`${i}: ${item} into ${arr}`)
});

arr2.sort(function(a,b){return a-b;});
console.log(arr2);

//псевдомассивы

//Объекты
const solder = {
health:400,
armor:100,
sayHello:function(){
    console.log("Hello")
}
};

const jonSolder = {
    health:100
};

Object.setPrototypeOf(jonSolder, solder);

const maxSolder = Object.create(solder);

console.dir(jonSolder);
console.dir(maxSolder);
maxSolder.sayHello();