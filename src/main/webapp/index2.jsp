<%-- 
    Document   : index2
    Created on : 2020年10月26日, 下午9:26:21
    Author     : s9500
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="score">     <%--網址連到score，不是連到ShowScore(在此頁面寫過了)--%>
            Student Id:<input type="text" name="id"><br/>
            <input type="submit"/>
        </form>
    </body>
</html>
