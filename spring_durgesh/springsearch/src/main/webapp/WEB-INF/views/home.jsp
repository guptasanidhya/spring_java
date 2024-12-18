<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link href = "<c:url  value="/resources/css/style.css" />">
    <script  src = "<c:url value="/resources/js/script.js" />"> </script>
    <title>Hello, world!</title>
  </head>
  <body>
    <h1>Hello, world!</h1>
        <!-- Only display the welcome message if userName is not null -->
        <c:if test="${not empty userName}">
          <h1>Welcome, ${userName}!</h1>
        </c:if>

        <!-- Display a default message if userName is null -->
        <c:if test="${empty userName}">
          <h1>Welcome, Guest!</h1>
        </c:if>
    <img alt="hotel" src="<c:url value="/resources/image/hotel.jpg" />">
    <div class="container">
    <div class="card mx-auto mt-5 bg-primary" style="width:50%;">
    <div class="card-body">

    <form action="search" class="mt-3">

    <h3 class="text-center text-white"> My Search </h3>
    <div class="form-group mt-5">
    <input type="text" name="querybox" placeholder="Enter your Keyword" class="form-control">
    </div>

    <div class="container text-center mt-3 mb-3">
    <button class="btn btn-outline-light">Search</button>
    </div>

    </form>

    </div>
    </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>


  </body>
</html>