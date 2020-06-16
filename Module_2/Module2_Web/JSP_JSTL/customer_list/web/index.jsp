<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/8/2020
  Time: 9:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="customer">Hien thi khach hang</a>

  <table style="width:100%">
    <tr>
      <th style="text-align: center" colspan="4">Danh sách khách hàng</th>
    </tr>
    <tr>
      <td>Tên</td>
      <td>Ngày sinh</td>
      <td>Địa chỉ</td>
      <td>Ảnh</td>
    </tr>

    <c:forEach items="${requestScope.customer}" var="customer">

      <tr>
        <td>${customer.name}</td>
        <td>${customer.birthday}</td>
        <td>${customer.address}</td>
        <td><img width=100px height=100px src="${customer.urlImage}" alt="image"></td>
      </tr>
    </c:forEach>
  </table>
      </body>
</html>
