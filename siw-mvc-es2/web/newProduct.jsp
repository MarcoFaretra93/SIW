<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1" />
  <title>Nuovo Prodotto</title>
</head>
<body>
<form action="<c:url value="/controller/CreateProduct"/>" method="get">
  <div>Nome: <input type="text" name="nomeProdotto" placeholder="Nome" value="${param.nomeProdotto}"/> ${nameErr}</div>
  <div>Codice: <input type="text" name="codice" placeholder="Codice" value="${param.codice}"/> ${codeErr}</div>
  <div>Prezzo: <input type="text" name="prezzo" placeholder="Prezzo" value="${param.prezzo}"/> ${priceErr}</div>
  <div>Descrizione: <textarea rows="4" cols="50" placeholder="Descrizione" name="descrizione">${param.descrizione}</textarea></div>
  <div><input type="submit" value="invia" /></div>
</form>
</body>
</html>