<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<form name="updationForm" id="updationForm" action="../Update" method="post">
	<h3 align="center">Stock Updation</h3>
	<table align="center">
	<tr>
	<td>Product ID</td>
	<td><input type="text" placeholder='Unique Product ID' name="ProductId" id="ProductId"></td></tr>
	
	<tr><td><input type="Submit" value="Update"/></td><td></td>
	<td><input type="Reset" name="clear"/></td></tr>
	<td></td><td><input type="Button" value="Back"></tr>
	</table>
	</form>
</body>
</html>