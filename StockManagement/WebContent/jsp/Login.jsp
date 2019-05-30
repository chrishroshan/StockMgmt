<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Stock Management - StoMa</title>

<script>
function validate(){
	var uname = document.getElementById("uname").value;
	var pwd = document.getElementById("pwd").value;
	if(!uname.length >0){
		alert("Please enter user name");
		document.getElementById("uname").focus();
		return false;
	}
	if(!pwd.length >0){
		alert("Please enter pass word");
		document.getElementById("pwd").focus();
		return false;
	}return true;
}
</script>
</head>

<body >
	<form name="loginForm" id="loginForm" action="Login" method="post">
		<div style="margin:auto; width:40%; align:center;">
		<h1 align="center">Inventory Management Suite</h1>
		<h2 align="center">Login Page</h2>
			<table align="center">
				<tr>
					<td>User Name</td>
					<td><input type="text" name="uname" id="uname"/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pwd" id="pwd"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login"
						onclick="return validate();"></td>
					<td><a href="jsp/Register.jsp">Register</a></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>