<%-- 
    Document   : index
    Created on : 10.03.2017, 08:50:30
    Author     : Sabrina
--%>

<%@page import="resource.ViewEnum"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            response.sendRedirect(pageContext.getServletContext().getContextPath()+"/" + ViewEnum.START.getView());
        %>
    </body>
</html>
