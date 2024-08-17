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
int num=(Integer)request.getAttribute("number");
String message=(String)request.getAttribute("msg");
double b=(Double)request.getAttribute("number1");
%>
<h1>Number is <%=num%></h1>
<h1>salary is <%=b%></h1>
<h1 style="color:red;">Message is<%= message %></h1>
<h1>DEMO JSP FILE OUTPUT</h1>
<form action="perform">
<input placeholder="Enter Name">
<br><br>
<input type="submit" value="Display">
</form>
</center>
</body>
</html>