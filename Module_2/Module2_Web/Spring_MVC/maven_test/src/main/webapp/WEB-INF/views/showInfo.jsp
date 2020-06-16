<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/11/2020
  Time: 12:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Your options</h2>

<c:forEach items="${condiments}" var= "condiment">
<h3>${condiment}<h3>
</c:forEach>

</body>
</html>
