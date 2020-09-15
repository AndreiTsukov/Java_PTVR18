<%-- 
    Document   : showFormAddUser
    Created on : Sep 13, 2020, 2:07:32 PM
    Author     : andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Создание нового пользователя</h1>
        <form action="createUser" method="POST">
            Имя пользователя <input type="text" name="name"><br>
            Логин:<input type="text" name="login"><br>
            Пароль:<input type="text" name="password"><br>
            <input type="submit" value="Создать">
        </form>
    </body>
</html>
