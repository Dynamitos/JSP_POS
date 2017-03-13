<%-- 
    Document   : helloWorldStartview
    Created on : 10.03.2017, 08:52:19
    Author     : Lukas Kollmann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HelloWorldStartView</title>
    </head>
    <body>
        <h1>HelloWorldStartView</h1>
        
        <form action="${pageContext.request.contextPath}<%= resource.ServletEnum.HELLOWORLD.getUrl()%>" method="post">
            Please enter a color:
            <input type="text" name="color"/>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
