<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:skyblue;">
<h1>view Template usage</h1>
<%
List<String> resultList=(List)request.getAttribute("subjects");
for(String subject : resultList){
%>
<%= subject%>
<br>
<%
}
%>

</body>
</html>