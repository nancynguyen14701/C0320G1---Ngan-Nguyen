<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/5/2020
  Time: 12:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
  <head>
    <title>Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
  <form action = "/discount" method="post">
    <input type="text" name="description" placeholder="Product Description"/>
    <input type="text" name="price" placeholder="List Price"/>
    <input type="text" name="discount" placeholder="Discount Percent"/>
    <input type="submit" id="submit" value="Calculate Discount"/>
  </form>

  </body>
</html>
