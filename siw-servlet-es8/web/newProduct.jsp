<%--
  Created by IntelliJ IDEA.
  User: marcofaretra
  Date: 21/04/15
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Inserimento prodotto</title>
  </head>
  <body>
    <form method="get" action="processa">
      <label for="nomeProdotto">NomeProdotto</label>
      <input id="nomeProdotto" type="text" name="nomeProdotto" placeholder="Nome" value="<% if(request.getAttribute("nomeCorrente")!= null) out.println(request.getAttribute("nomeCorrente")); %>">
      <% if(request.getAttribute("nomeError")!=null) out.println(request.getAttribute("nomeError"));
          else { out.println("");}%>

      <label for="prezzo">Prezzo</label>
      <input id="prezzo" type="text" name="prezzo" placeholder="Prezzo" value="<% if(request.getAttribute("prezzoCorrente")!= null) out.println(request.getAttribute("prezzoCorrente")); %>">
      <% if(request.getAttribute("prezzoError")!=null) out.println(request.getAttribute("prezzoError"));
      else {out.println("");}%>

      <label for="descrizione">Descrizione</label>
      <input id="descrizione" type="text" name="descrizione" placeholder="Descrizione" value="<% if(request.getAttribute("descrizioneCorrente")!= null) out.println(request.getAttribute("descrizioneCorrente")); %>">
      <% if(request.getAttribute("descrizioneError")!=null) out.println(request.getAttribute("descrizioneError"));
      else {out.println("");}%>

      <label for="codice">Codice</label>
      <input id="codice" type="text" name="codice" placeholder="Codice" value="<% if(request.getAttribute("codiceCorrente")!= null) out.println(request.getAttribute("codiceCorrente")); %>">
      <% if(request.getAttribute("codiceError")!=null) out.println(request.getAttribute("codiceError"));
      else {out.println("");}%>

      <input type="submit" value="Invia">
    </form>
  </body>
</html>
