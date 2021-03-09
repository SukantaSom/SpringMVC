<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First Login</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
</head>
<body>
	${nam} Yahooooo!!!
	<br>
	<%
	/*out.print("<br>From get attribute "+request.getAttribute("nam"));
	out.println( "<br>from page directly "+request.getParameter("name"));
	out.println( response.getBufferSize());*/
	String name = "Sukanta";
	%>
	<br>
	<label>My name is <%=name%></label>
	<br>
	<form action="/login.do" method="post">
		<!--  
	Enter Your Name <input type="text" name="name">
	Enter Your Password <input type="password" name="pass">
	<button type="submit">Send</button>-->
		<div class="form-group mx-sm-3 mb-2">
			<label for="inputPassword2" class="sr-only"> Enter Name</label> 
			<input type="text" class="form-control" name="name" 
			placeholder="Enter name">
		</div>
		<div class="form-group mx-sm-3 mb-2">
			<label for="inputPassword2" class="sr-only">Enter Password</label> 
			<input type="password" class="form-control" name="pass"
				placeholder="Enter Password">
		</div>
		<button type="submit" class="btn btn-primary mb-2">Confirm
			identity</button>
	</form>
	<h1 style="color: red">${msg}</h1>
</body>
</html>