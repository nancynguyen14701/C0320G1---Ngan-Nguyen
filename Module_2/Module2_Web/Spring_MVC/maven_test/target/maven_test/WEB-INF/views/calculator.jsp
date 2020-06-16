<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/11/2020
  Time: 1:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculator">
<input type="text" name="num1">
<input type="text" name="num2"><br>
    <button type="submit" name="add">Addition(+)</button>
    <button type="submit" name="sub">Subtraction(-)</button>
    <button type="submit" name="mul">Multiplication(x)</button>
    <button type="submit" name="div">Division(/)</button>
</form>
<c:if test="${result!= null}">
    <span>Result: ${result}</span>
</c:if>
<%--    <button  onclick = document.getElementById("calculator").submit()>Subtraction(-)</button>--%>
<%--    <button  onclick = document.getElementById("calculator").submit()>Multiplication(x)</button>--%>
<%--    <button  onclick = document.getElementById("calculator").submit()>Division(-)</button>--%>

</body>
</html>
