<%@page import="com.jpa.stockmanagement.vo.StockVo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<form name="additionForm" id="additionForm" action="UpdateAction"
		method="post">
		<h3 align="center">Stock Updation</h3>
		<table align="center">
			<tr>
				<%
					StockVo stocks = (StockVo) request.getAttribute("StockInfo");
				%>
				<td>Product ID</td>
				<td><input type="text" placeholder='Product ID'
					name="ProductId" id="ProductId"
					value='<%out.print(stocks.getProductid());%>'></td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td><input type="text" placeholder='Product Name'
					name="ProductName" id="ProductName"
					value='<%out.print(stocks.getProductname());%>'></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="text" placeholder='Price per piece'
					name="Price" id="Price"
					value='<%out.print(stocks.getPrice_piece());%>'></td>
			</tr>
			<tr>
				<td>Quantity</td>
				<td><input type="text" placeholder='Total Quantity'
					name="Quantity" id="Quantity"
					value='<%out.print(stocks.getQuantity());%>'></td>
			</tr>
			<tr>
				<td>Weight</td>
				<td><input type="text" placeholder='Weight per piece'
					name="Weight" id="Weight"
					value='<%out.print(stocks.getWeight());%>'></td>
			</tr>
			<br>

			<tr>
				<td><input type="Reset" name="clear" /></td>
				<td></td>
				<td><input type="Submit" value="Update" /></td>
			</tr>
			<td></td>
			<td><a href="Frame_nav.jsp"></a><input type="Button"
				value="Back" />
			</tr>
		</table>
	</form>

</body>
</html>