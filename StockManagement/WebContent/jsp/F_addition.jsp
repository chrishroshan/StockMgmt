<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<form name="additionForm" id="additionForm" action="../Stock" method="post">
	<h3 align="center">Stock addition</h3>
	<table align="center">
	<tr>
	<td>Product ID</td>
	<td><input type="text" placeholder='Unique Product ID' name="ProductId" id="ProductId"></td></tr>
	<tr><td>Product Name</td>
	<td><input type="text" placeholder='Product Name' name="ProductName" id="ProductName"></td></tr>
	<tr><td>Price</td>
	<td><input type="text" placeholder='Price per piece' name="Price" id="Price"></td></tr>
	<tr><td>Quantity</td>
	<td><input type="text" placeholder='Total Quantity' name="Quantity" id="Quantity"></td></tr>
	<tr><td>Weight</td>
	<td><input type="text" placeholder='Weight per piece' name="Weight" id="Weight"></td></tr><br>
	
	<tr><td><input type="Reset" name="clear"/></td><td></td>
	<td><input type="Submit" value="Add"/></td></tr>
	<td></td><a href="Frame_nav.jsp"></a><input type="Button" value="Back"/></tr>
	</table>
	</form>

</body>
</html>