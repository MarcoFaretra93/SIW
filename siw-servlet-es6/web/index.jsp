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
      <!-- Latest compiled and minified CSS -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

      <!-- Optional theme -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

      <!-- Latest compiled and minified JavaScript -->
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <title>Inserimento dati</title>
  </head>
  <body>
    <form method="GET" action="controllerDati" class="form-horizontal">
        <div class="formgroup">
            <label for="firstname" class="col-sm-2 control-label">Name</label>
            <div class="col-sm-10">
                <input id="firstname" type="text" name="firstname" placeholder="Nome" class="form-control">
            </div>
        </div>
        <div class="formgroup">
            <div class="formgroup">
                <label for="lastname" class="col-sm-2 control-label">Cognome</label>
                <div class="col-sm-10">
                    <input id="lastname" type="text" name="lastname" placeholder="Cognome" class="form-control">
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input class="btn btn-default" type="submit" value="Invia">
            </div>
        </div>
    </form>
  </body>
</html>