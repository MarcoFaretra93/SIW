<%--
  Created by IntelliJ IDEA.
  User: marcofaretra
  Date: 21/04/15
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Inserimento dati</title>
  </head>
  <body>
        <form method="GET" action="controllerDati">
            <label for="firstname">Name</label>
            <input id="firstname" type="text" name="firstname" placeholder="Nome">

            <label for="lastname">Cognome</label>
            <input id="lastname" type="text" name="lastname" placeholder="Cognome">

            <input type="submit" value="Invia">

        </form>
  </body>
</html>
