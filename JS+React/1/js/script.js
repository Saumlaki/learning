/**Предупреждение */
alert("hello");

/**Вопрос да/нет */
const result = confirm("Ты тут?");
console.log(result);

/**Произвольный вопрос */
const answer  = prompt("Вам есть 18","18");
console.log(answer);

/**Работа со стрками */
const categorie = "toys";
console.log("https://someurl.com/" + categorie);
console.log(`https://someurl.com/${categorie}`);//Интерполяция