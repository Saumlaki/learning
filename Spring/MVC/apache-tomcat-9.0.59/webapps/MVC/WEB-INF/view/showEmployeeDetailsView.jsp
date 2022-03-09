<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Пример передачи данных используя модель и Spring form</h2>
<h3>Передача данных прошла успешно</h3>
<table>
    <tr>
        <td>Вы ввели имя:</td>
        <td>${employee.name}</td>
    </tr>
    <tr>
        <td>Вы ввели фамилию:</td>
        <td>${employee.surname}</td>
    </tr>
    <tr>
        <td>Вы ввели департамент:</td>
        <td>${employee.department}</td>
    </tr>
    <tr>
        <td>Вы ввели департамент:</td>
        <td>${employee.telephone}</td>
    </tr>
    <tr>
        <td>Вы ввели телефон:</td>
        <td>${employee.email}</td>
    </tr>
    <tr>
        <td>Вы ввели страну:</td>
        <td>${employee.country}</td>
    </tr>
    <tr>
        <td>Вы ввели зарплату:</td>
        <td>${employee.salary}</td>
    </tr>
    <tr>
        <td>Вы ввели авто:</td>
        <td>${employee.car}</td>
    </tr>
</table>
<ul>
    <c:forEach var = "lang" items= "${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>
<p><a href="/MVC/">На главную</a></p>
</body>
</html>
