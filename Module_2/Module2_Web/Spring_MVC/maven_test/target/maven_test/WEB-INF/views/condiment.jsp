<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/11/2020
  Time: 11:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="showOptions" method="post">
    <input type="checkbox" id="condiment1" name="condiment" value="Lettuce">
    <label for="condiment1">Lettuce</label>
    <input type="checkbox" id="condiment2" name="condiment" value="Tomato">
    <label for="condiment2">Tomato</label>
    <input type="checkbox" id="condiment3" name="condiment" value="Mustard">
    <label for="condiment3">Mustard</label>
    <input type="checkbox" id="condiment4" name="condiment" value="Sprouts">
    <label for="condiment4">Sprouts</label>
    <br>
    <input type="submit" value="Save">
</form>
</body>
</html>
