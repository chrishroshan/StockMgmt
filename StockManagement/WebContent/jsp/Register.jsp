<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>StoMa - User registration</title>
<script>
	function validate() {
		alert(1);
		var name = document.getElementById("name").value;
		var empid = document.getElementById("empid").value;
		var age = document.getElementById("age").value;
		var email = document.getElementById("email").value;
		var address = document.getElementById("address").value;
		var pwd = document.getElementById("pwd").value;
		var cpwd = document.getElementById("cpwd").value;
		if (name.length > 3){
			alert("Inside if");
			document.getElementById("name");
			
			}
		else {
			//alert("Inside else");
			alert("Please enter your name");
			document.getElementById("name").focus();
			return false;
			/* document.getElementById('message').style.color = 'red';
		    document.getElementById('message').innerHTML ='name length greater than 3 characters';
		    
		    return false; */
			}
		
		if (empid.length > 2){
			document.getElementById("empid");
		}
		else {
			document.getElementById('message').style.color = 'red';
		    document.getElementById('message').innerHTML ='Enter a valid Emp ID';
		    return false;
		}
		
		if (age > 18){
			document.getElementById("age");
		}
		else {
			document.getElementById('message').style.color = 'red';
		    document.getElementById('message').innerHTML ='Enter a valid age';
		    return false;
		}
		
		if (pwd.length > 3)
			document.getElementById("pwd");
		else {
			document.getElementById('message').style.color = 'red';
		    document.getElementById('message').innerHTML ='password greater than 3 characters';
		    return false;
		}
			
		if (document.getElementById('pwd').value == document.getElementById('cpwd').value) {
			document.getElementById('pwd').style.color='green';
			document.getElementById('pwd').innerHTML="matching";
			}
		    else {
			 document.getElementById('pwd').style.color='red';
			 document.getElementById('pwd').innerHTML="Not matching";
			 return false;
			 }
		
	}
</script>
</head>
<body background src="images/Container-Port-43-74.jpg">
	<form name="registerForm" id="registerForm" action="/StockManagement/Register"
		method="post">
		<h2 align="center">User registration Form</h2>
		<table align="center">
			<tr>
				<td>Name</td>
				<td><input type="text" placeholder='Employee Name' name="name" id="name" /></td>
			</tr>
			<tr>
				<td>Employee ID</td>
				<td><input type="text" placeholder='4 Digit ID' name="empid" id="empid" /></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="text" placeholder='Your age' name="age" id="age" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" placeholder='Your email' name="email" pattern="[a-zA-Z0-9!#$%&amp;'*+\/=?^_`{|}~.-]+@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*" id="email" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" placeholder='Employee Address' name="address" id="address" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" placeholder='More than 3 Characters' name="pwd" id="pwd" /></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="password" placeholder='Same password as above' name="cpwd" id="cpwd"
					onchange='check_pass();' /></td>
			</tr>
			<td align="center"><input type="submit" value="Register"
				onclick="return validate();" /></td>
			<td align="center"><input type="reset" name="clear" /></td>
			</tr>
		</table>
	</form>
</body>
</html>