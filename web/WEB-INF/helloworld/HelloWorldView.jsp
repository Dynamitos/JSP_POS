<%-- 
    Document   : HelloWorldView
    Created on : 13.03.2017, 14:36:53
    Author     : Sabrina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! Result View!</h1>
        ${servlet.HelloWorldBean.htmlCapital}
    </body>
</html>
