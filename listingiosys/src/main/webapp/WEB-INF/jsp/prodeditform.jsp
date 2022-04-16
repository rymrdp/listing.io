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
<div class = "formlabelcontainer">
<div class = "formlabel">
<h3>Edit Product</h3>
</div>
</div>
<div class = "editformcontainer">  
<div class = "editform">
<form:form method="POST" action="/listingiosys/updateprod">
	<table class="editformtable">
		<tr>
			<td></td>
			<td><form:hidden path="PRODUCT_ID" /></td>
		</tr>
		<tr>
			<td>Product Name</td>
			<td><form:input path="PRODUCT_NAME" /></td>
		</tr>
		<tr>
			<td>Product Quantity</td>
			<td><form:input path="PRODUCT_QTY" /></td>
		</tr>
		<tr>
			<td>Product Price</td>
			<td><form:input path="PRODUCT_PRICE" /></td>
		</tr>
		<tr>
			<td>Product Type</td>
			<td><form:input path="PRODUCT_TYPE" /></td>
		</tr>

		<tr>
			<td></td>
			<td class="submitbtn"><input type="submit" value="Update" /></td>
		</tr>
	</table>
</form:form>
</div>
</div>
</html>