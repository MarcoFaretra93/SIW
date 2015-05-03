<%--
  Created by IntelliJ IDEA.
  User: marcofaretra
  Date: 03/05/15
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
  <title>Product</title>
</head>
<body>
<h1>Products</h1>
<table>
  <tr>
    <th>Name</th>
    <th>Price</th>
  </tr>
  <c:forEach var="product" items="${products}">
    <tr>
      <td><a href="<c:url value="/controller/product.get?id=${product.id}" />">${product.name}</a></td>
      <td>${product.price}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>