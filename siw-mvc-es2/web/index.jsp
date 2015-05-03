<%--
  Created by IntelliJ IDEA.
  User: marcofaretra
  Date: 28/04/15
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="US-ASCII">
    <title>siw-mvc-es2</title>
</head>
<body>
<h1>siw-mvc-es2</h1>
<ul>
    <li><a href="<c:url value="/newProduct.jsp" />">Insert a new product</a></li>
    <li><a href="<c:url value="/controller/product.list" />">List all product</a></li>
</ul>
${action}
</body>
</html>