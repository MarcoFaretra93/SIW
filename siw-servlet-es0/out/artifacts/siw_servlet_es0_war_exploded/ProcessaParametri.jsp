<%--
  Created by IntelliJ IDEA.
  User: marcofaretra
  Date: 21/04/15
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <title>mostra parametri</title>
</head>
<body>
    <h1>Dati inseriti nella form</h1>
    <ul>
      <li>Nome: <b><% out.println(session.getAttribute("NOME")); %></b></li>
      <li>Cognome: <b><% out.println(session.getAttribute("COGNOME")); %></b></li>
    </ul>
    <h2>Scegli:</h2>
    <ul>
      <li><a href="index.jsp">Annulla</a></li>
      <li><a href="<% out.println(response.encodeURL("MostraParametri.jsp")); %>">Conferma</a></li>
    </ul>
</body>
</html>
