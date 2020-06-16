<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: duytr
  Date: 6/8/2020
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body>
<h3>Create Customer</h3>
<c:if test="${message != null}">
    <p class="text-success"><c:out value="${message}"/></p>
</c:if>
<a href="/customers" class="btn btn-primary">Back</a>
<form method="post">
    <input type="hidden" name="id" value="<c:out value='${customer.getId()}'/>">
    <div class="form-group">
        <label for="name">Name</label>
        <input class="form-control" id="name" type="text" name="name" value="<c:out value='${customer.getName()}'/>">
    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <input class="form-control" id="email" type="text" name="email" value="<c:out value='${customer.getEmail()}'/>">
    </div>
    <div class="form-group">
        <label for="address">Address</label>
        <input class="form-control" id="address" type="text" name="address" value="<c:out value='${customer.getAddress()}'/>">
    </div>
    <input type="submit" class="btn btn-danger" value="Update">
</form>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>
