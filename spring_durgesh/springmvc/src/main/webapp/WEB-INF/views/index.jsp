<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
</head>
<body>
    <h1>Hello, Home Page</h1>

<%
 String name = (String)request.getAttribute("Name");
 Integer id = (Integer)request.getAttribute("Id");
 List<String> friends = (ArrayList<String>) request.getAttribute("f");

 %>

    <h1> Name is : <%=name %></h1>
    <h2> Name is : <%=id %></h2>

    <%
    for(String s : friends){
    %>
    <h1><%=s%></h1>

    <%
    }
    %>

</body>
</html>
