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
    <meta charset="ISO-8859-1">
    <title>mostra parametri</title>
</head>
<body>
    <h1>Dati inseriti nella form:</h1>
    <ul>
      <li>Nome del prodotto: <b><% out.println(request.getParameter("nomeProdotto")); %></b></li>
      <li>Prezzo: <b><% out.println(request.getParameter("prezzo")); %></b></li>
      <li>Descrizione: <b><% out.println(request.getParameter("descrizione")); %></b></li>
      <li>Codice: <b><% out.println(request.getParameter("codice")); %></b></li>
    </ul>
</body>
</html>
