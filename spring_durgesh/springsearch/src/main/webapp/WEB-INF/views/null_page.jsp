<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Error Page</title>
</head>
<body>
    <h1>Error Occurred</h1>
    <p>${msg}</p>

    <h2>Stack Trace:</h2>
    <pre>${stackTrace}</pre>
</body>
</html>
