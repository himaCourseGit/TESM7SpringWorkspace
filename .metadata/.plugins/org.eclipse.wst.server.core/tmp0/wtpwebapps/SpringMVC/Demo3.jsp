<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>View template usage</h1>
<h1>MODELANDVIEW class usage to display JSP file</h1>
<%
double salary=(Double)request.getAttribute("salary");
%>
<h1>Salary is <%= salary%></h1>
</body>
</html>