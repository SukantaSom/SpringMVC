<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
${nam}
 Welcome 
<br>
<%
	out.print("<br>From get attribute "+request.getAttribute("nam"));
	out.println( "<br>from page directly "+request.getParameter("name"));
	out.println( response.getBufferSize());
	String name ="Sukanta";
	
%>
<br>
<label>My name is <%=name %></label>
<br>
<label>Your password is ${pass}</label>
<br>
</form>
</body>
</html>