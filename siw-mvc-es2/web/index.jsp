<%--
  Created by IntelliJ IDEA.
  User: marcofaretra
  Date: 28/04/15
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Scegli l'operazione che vuoi eseguire</title>
</head>
<body>
    <div><a href="<c:url value="/newProduct.jsp"/>">Inserisci un nuovo prodotto</a></div>
    <div><a href="<c:url value="/controller/getAllProducts" />">Lista di tutti i prodotti</a></div>
</body>
</html>
