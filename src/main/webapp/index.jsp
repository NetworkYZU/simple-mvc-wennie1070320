<%-- 使用者介面，跑程式時在這執行--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="ShowBalance2">  <%-- 顯示ShowBalance2--%>
            Customer Id:<input type="text" name="id"><br/>
            <input type="submit"/>
        </form>
    </body>
</html>
