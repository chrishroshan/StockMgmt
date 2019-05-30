<%@page import="java.util.ArrayList"%>
<%@page import="com.jpa.stockmanagement.vo.StockVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> StoMa - Stock Management </title>
</head>
<body>
<h3> Available Stocks Information </h3>
<% List<StockVo> stocks = (ArrayList<StockVo>)request.getAttribute("stockDet");
 
    for(StockVo stock : stocks)
    {
        out.print("ProductId: " + stock.getProductid());
        out.print("<br/>");
        out.print("Product Name: " + stock.getProductname());
        out.print("<br/>");
        out.print("Product Quanitity: " + stock.getQuantity());
        out.print("<br/>");
        out.print("Product price: " + stock.getPrice_piece());
        out.print("<br/>");
        out.print("Product Weight: " + stock.getWeight());
        out.print("<br/>");
        out.print("Created Time: " + stock.getCreate_time());
        out.print("<br/>");
        out.print("-------------------------------------------");
        out.print("<br/>");
        
    }
%>
<a href="/Frame_nav.jsp"></a><input type="Button" value="Back"/></tr>
</body>
</html>