<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<header>
  <div class = "nav">
    <h3>listing.io</h3>
    <ul>  
      <li><a href="/listingiosys/index.jsp">Home</a></li>
      <li><a href = "https://www.linkedin.com/in/reymar-dela-paz-0a26a0196/">About</a></li>
      <li><a href = "https://www.linkedin.com/in/reymar-dela-paz-0a26a0196/">Help</a></li>
    </ul>
  </div>  
</header>
<div class=viewprod>
<h3>Products List</h3>
<table class="prodtable" border="2" width="70%" cellpadding="2">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Quantity</th>
		<th>Price</th>
		<th>Type</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<c:forEach var="products" items="${list}">
		<tr>
			<td>${products.PRODUCT_ID}</td>
			<td>${products.PRODUCT_NAME}</td>
			<td>${products.PRODUCT_QTY}</td>
			<td>${products.PRODUCT_PRICE}</td>
			<td>${products.PRODUCT_TYPE}</td>
			<td><a href="editprod/${products.PRODUCT_ID}">Edit</a></td>
			<td><a href="deleteprod/${products.PRODUCT_ID}">Delete</a></td>
		</tr>
	</c:forEach>
</table>
<br />
<a href="prodform"><h2>Add New Product</h2></a>
</div>
</html>