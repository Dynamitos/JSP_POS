<%-- 
    Document   : helloworldstartview
    Created on : 10.03.2017, 08:49:18
    Author     : Michaela
--%>

<%@page import="resource.ServletResourceEnum"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 >Hello World!</h1>
        <form action="${pageContext.request.contextPath}<%=ServletResourceEnum.HELLOWORLD.getUrlPattern()%>" method="POST">
             Please enter a color:
            <input type="text" name="color">
            <input type="submit" value="submit">
        </form>
    </body>
</html>
