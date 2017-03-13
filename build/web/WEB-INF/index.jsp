<%-- 
    Document   : index
    Created on : 10.03.2017, 08:45:02
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
        <%
            response.sendRedirect(pageContext.getServletContext().getContextPath() + "/helloworld/HelloWorldIndex.jsp");
        %>
    </body>
</html>
