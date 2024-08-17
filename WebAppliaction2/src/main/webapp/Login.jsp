<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Login</h1>
<form action="performLogin" method="post">
<input type="email" placeholder="Enter Email" 
name="email">
<br><br>
<input type="password" placeholder="Enter password" name="password">
<br><br>
<input type="submit" value="Login">
</form>
<%
String msg=(String)request.getAttribute("message");
if(msg!=null){
%>
<h1><%=msg %></h1>
<%
}
%>
</center>
</body>
</html>