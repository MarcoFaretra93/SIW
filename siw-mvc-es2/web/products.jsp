<%--
  Created by IntelliJ IDEA.
  User: marcofaretra
  Date: 28/04/15
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Lista dei prodotti inseriti</title>
</head>
<body>
  <h1>Prodotti:</h1>
  <c:forEach var="product" items="${products}">
    <div>${product.nomeProdotto}</div>
  </c:forEach>
</body>
</html>
