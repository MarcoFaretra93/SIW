<%--
  Created by IntelliJ IDEA.
  User: marcofaretra
  Date: 21/04/15
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1" />
    <title>mostra parametri</title>
</head>
<body>
    <h1>Dati inseriti nella form</h1>
    <ul>
      <li>NOME: <b><% out.println(session.getAttribute("NOME")); %></b></li>
      <li>COGNOME: <b><% out.println(session.getAttribute("COGNOME")); %></b></li>
    </ul>
    <h2>Altri dati relativi alla richiesta:</h2>
    <br />IP: <b><% out.println(request.getRemoteAddr()); %></b>
    <br />Host: <b><% out.println(request.getRemoteHost()); %></b>
    <br />User Agent: <b><% out.println(request.getHeader("User-Agent")); %></b>
</body>
</html>
