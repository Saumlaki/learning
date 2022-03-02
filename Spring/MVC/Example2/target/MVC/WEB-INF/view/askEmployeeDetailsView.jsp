<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>Пример передачи данных без использования модели</title>
<body>
<h2>Введите данные пользователя</h2>
<form action="showDetails" method="get">
    <label>Введите данные пользователя</label>
    <input type="text" name="employeeName" placeholder="Фамилия, Имя, Отчество"/>
    <input type="submit" >
</form>
</body>
</html>
