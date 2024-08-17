<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>REGISTRATION</h1>
<form action="registration">
<label>Enter First Name :</label>
<input name="firstName">
<br><br>
<label>Enter last Name :</label>
<input name="LastName">
<br><br>
<label>Enter Mobile:</label>
<input name="mobile">
<br><br>
<label>Enter password :</label>
<input name="password">
<br><br>
<label>Enter confirm password:</label>
<input name="confirmpass">
<br><br>
<input type="submit" value="Register">
<h2><a href="Login.jsp">Go to Login page</a></h2>
</form>
<!-- to access message -->
<%
String message=(String)request.getAttribute("msg");
if(message!=null){
%>
<h1 style=color:red;><%=message %></h1>
<%
}
%>
</center>

</body>
</html>