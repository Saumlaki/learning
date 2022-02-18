'use strict';

const numberOfFilms = +prompt("Сколько фильмов вы уже посмотрели?", "");

const personalMovieDB = {
    count: numberOfFilms,
    movies:{},
    actors:{},
    genres:[],
    privat:false
};

const answ11 = prompt("Один из последних просмотренных фильмов?", "");
const answ12 = prompt("На сколько оцените его?", "");
const answ21 = prompt("Один из последних просмотренных фильмов?", "");
const answ22 = prompt("На сколько оцените его?", "");

personalMovieDB.movies[answ11] = answ12;
personalMovieDB.movies[answ21] = answ22;
console.log(personalMovieDB);

//Условные операторы
let num = 50;
if(num<49){
    console.log("Yes");
}else if(num<100){
    console.log("What?");
}else{
    console.log("No");
}

(num===50)?console.log("Ok"):console.log("No");

switch(num){
    case 49: console.log("OK");break;
    case 48: console.log("Ok");break;
    case 47: console.log("ok");break;
    default:console.log("NOOOO");break;
}

/**Циклы */

while(num<=50){
    console.log(num);
    num--;
}

do{
    console.log(num);
    num--;
}while(num<=50);

for(let i = 0; i<10; i++){
    console.log(i);
}
/* Задание на урок:

1) Создать переменную numberOfFilms и в неё поместить ответ от пользователя на вопрос:
'Сколько фильмов вы уже посмотрели?'

2) Создать объект personalMovieDB и в него поместить такие свойства:
    - count - сюда передается ответ на первый вопрос
    - movies - в это свойство поместить пустой объект
    - actors - тоже поместить пустой объект
    - genres - сюда поместить пустой массив
    - privat - в это свойство поместить boolean(логическое) значение false

3) Задайте пользователю по два раза вопросы:
    - 'Один из последних просмотренных фильмов?'
    - 'На сколько оцените его?'
Ответы стоит поместить в отдельные переменные
Записать ответы в объект movies в формате: 
    movies: {
        'logan': '8.1'
    }

Проверить, чтобы все работало без ошибок в консоли */



