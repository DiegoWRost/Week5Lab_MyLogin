<%-- 
    Document   : home
    Created on : Feb 10, 2021, 10:03:42 AM
    Author     : Diego Weidle Rost
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <h2>Welcome ${username}.</h2>
        <a href="login?logout=true">Logout</a>
    </body>
</html>
