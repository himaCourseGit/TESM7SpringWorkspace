<%@page import="org.jsp.springMVC.entity.UserInfo"%>
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
<%String msg=(String)request.getAttribute("message");
UserInfo info =(UserInfo)request.getAttribute("object");
if(msg!=null){
%>
<h1 style="color:green;"><%=msg %></h1>
<h1 style="color:blue;">welcome<%=info.getFirstName() %></h1>
<%
}
%>
<h1> This is Home page</h1>
</center>
</body>
</html>