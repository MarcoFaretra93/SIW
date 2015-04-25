<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1" />
  <title>Nuovo Prodotto</title>
</head>
<body>
<form action="<c:url value="/controller/product.create" />" method="get">
  <div>Name: <input type="text" nomeProdotto="nomeProdotto" value="${param.nomeProdotto}"/> ${nameErr}</div>
  <div>Code: <input type="text" nomeProdotto="codice" value="${param.codice}"/> ${codeErr}</div>
  <div>Price: <input type="text" nomeProdotto="prezzo" value="${param.prezzo}"/> ${priceErr}</div>
  <div>Description: <textarea rows="4" cols="50" nomeProdotto="descrizione">${param.descrizione}</textarea></div>
  <div><input type="submit" nomeProdotto="sumbit" value="invia" /></div>
</form>
</body>
</html>