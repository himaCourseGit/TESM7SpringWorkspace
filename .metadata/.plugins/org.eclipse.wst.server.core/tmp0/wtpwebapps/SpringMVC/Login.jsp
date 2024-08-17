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
<%
String message=(String) request.getAttribute("message");
String message1=(String) request.getAttribute("message");

if(message!=null){
%>
<h1 style="color:green"><%=message %></h1>
<% 
}
%>
<h1>Login</h1>
<form action="performLogin" method="post">
<input type="email" placeholder="Enter email" name="email">
<br><br>
<input type="password" placeholder="Enter password" name="password">
<br><br>
<input type="submit" value="login">
</form>
<%
if(message1!=null){
%>
<h1 style="color:red;"><%=message1 %></h1>
<%
} 
%>
</center>
</body>
</html>