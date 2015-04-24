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
      <input id="nomeProdotto" type="text" name="nomeProdotto" placeholder="Nome" value="${nomeCorrente}">
      ${nomeError}

      <label for="prezzo">Prezzo</label>
      <input id="prezzo" type="text" name="prezzo" placeholder="Prezzo" value="${prezzoCorrente}">
      ${prezzoError}

      <label for="descrizione">Descrizione</label>
      <input id="descrizione" type="text" name="descrizione" placeholder="Descrizione" value="${descrizioneCorrente}">
      ${descrizioneError}

      <label for="codice">Codice</label>
      <input id="codice" type="text" name="codice" placeholder="Codice" value="${codiceCorrente}">
      ${codiceError}

      <input type="submit" value="Invia">
    </form>
  </body>
</html>
