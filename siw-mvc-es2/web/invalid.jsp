<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="US-ASCII">
  <title>Invalid product</title>
</head>
<body>
<h1>Invalid Product</h1>
<div>You are searching a product that does not exist</div>
<a href="<c:url value="/newProduct.jsp" />">Home</a>
</body>
</html>