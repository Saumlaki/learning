<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>Spring MVC</title>
<body>
<h2>Пример передачи данных используя модель и Spring form</h2>
<h3>Введите данные пользователя. После нажатия кнопки "Готово" данные будут переданы в другую форму</h3>
<form:form action="showDetails" modelAttribute="employee">
    <table>
        <tr>
            <th>Свойство класса Employee</th>
            <th>Значение свойства</th>
        </tr>
        <tr>
            <td>
                <label>Имя: </label>
            </td>
            <td style="background-color: #666666">
                <form:input path="name"/>
                <form:errors path="name"/>
            </td>
        </tr>
        <tr>
            <td>
                <label>Фамилия: </label>
            </td>
            <td style="background-color: #666666">
                <form:input path="surname"/>
                <form:errors path="surname"/>
            </td>
        </tr>
        <tr>
            <td>
                <label>Зарплата: </label>
            </td>
            <td style="background-color: #666666">
                <form:input path="salary"/>
                <form:errors path="salary"/>
            </td>
        </tr>
        <tr>
            <td>
                <label>Телефон: </label>
            </td>
            <td style="background-color: #666666">
                <form:input path="telephone"/>
                <form:errors path="telephone"/>
            </td>
        </tr>   <tr>
            <td>
                <label>Телефон: </label>
            </td>
            <td style="background-color: #666666">
                <form:input path="email"/>
                <form:errors path="email"/>
            </td>
        </tr>
            <%--            Пример с полем выбора--%>
        <tr>
            <td>
                <label>Отдел: </label>
            </td>
            <td style="background-color: #666666">
                <form:select path="department">
                    <form:option value="Отдел IT" label="IT"/>
                    <form:option value="Отдел HR" label="IT"/>
                    <form:option value="Отдел Бухгалтерии" label="Бухгалтерия"/>
                </form:select>
            </td>
        <tr>
            <td>
                <label>Страна: </label>
            </td>
            <td style="background-color: #666666">
                <form:select path="country">
                    <form:options items="${employee.countryMap}"/>
                </form:select>
            </td>
        </tr>
            <%--        Пример с radiobutton--%>
        <tr>
            <td>
                <label>Автомобиль: </label>
            </td>
            <td>
                <p>BMV<form:radiobutton path="car" value="BMV"/></p>
                <p>MB<form:radiobutton path="car" value="MB"/></p>
                <p>R. Rover<form:radiobutton path="car" value="R. Rover"/></p>
            </td>
        </tr>
    </table>
    <%--        Пример с checkbox--%>
    <p>Знание языков:
        Русский: <form:checkbox path="languages" value="Русский"/>
        Английский: <form:checkbox path="languages" value="Английский"/>
        Немецкий: <form:checkbox path="languages" value="Немецкий"/>
    </p>
    <input type="submit" value="Готово!">
</form:form>
</body>
</html>
