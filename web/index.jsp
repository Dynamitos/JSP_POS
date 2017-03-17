<%-- 
    Document   : index
    Created on : 10.03.2017, 08:48:32
    Author     : Michaela
--%>

<%@page import="resource.ViewResourceEnum"%>
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
            response.sendRedirect(pageContext.getServletContext().getContextPath()+"/"
                    +ViewResourceEnum.START.getPath());
        %>
    </body>
</html>