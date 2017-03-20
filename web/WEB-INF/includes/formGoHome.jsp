<%-- 
    Document   : formGoHome
    Created on : 20.03.2017, 13:52:53
    Author     : Sabrina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="resource.ViewResourceEnum"%>

<form action="${pageContext.request.contextPath}<%=ViewResourceEnum.START.getView()%>" method="GET">
    <input type="submit" value="Home"/>
</form>
