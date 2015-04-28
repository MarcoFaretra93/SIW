
<%--
  Created by IntelliJ IDEA.
  User: marcofaretra
  Date: 21/04/15
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
  <title>mostra parametri</title>
</head>
<body>
<h1>Dati inseriti nella form:</h1>
<ul>
  <li>Nome del prodotto: <b>${product.nomeProdotto}</b></li>
  <li>Prezzo: <b>${product.prezzo}</b></li>
  <li>Descrizione: <b>${product.descrizione}</b></li>
  <li>Codice: <b>${product.codice}</b></li>
  <div><a href="/index.jsp">Ritorna al menù principale</a></div>
</ul>
</body>
</html>