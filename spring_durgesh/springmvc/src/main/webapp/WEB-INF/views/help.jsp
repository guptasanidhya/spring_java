<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.time.LocalDateTime" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>help</title>
</head>
<body>
    <h1>Hello, help!</h1>
    <h1> ${name}</h1>
    <h1> ${id}</h1>
    <h1> ${time}</h1>

    <c:forEach var="item" items="${marks}">
    <c:out value="${item}"></c:out>
    </c:forEach>



<%--
    <%
     String name = (String)request.getAttribute("name");
     Integer id = (Integer)request.getAttribute("id");
     LocalDateTime time = (LocalDateTime)request.getAttribute("time");
     %>

     <h1>hello my name is <%=name %></h1>
     <h1>hello my id is <%=id %></h1>

       <h2> time now is <%= time.toString() %></h2>
--%>



</body>
</html>
