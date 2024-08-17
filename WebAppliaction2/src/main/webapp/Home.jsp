<%@page import="com.jsp.springboot.entity.UserInfo1"%>
<%@page import="com.jsp.springboot.entity.UserInfo1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
//request operation
UserInfo1 info=(UserInfo1)request.getAttribute("info");
String msg=(String)request.getAttribute("message");
//login operation
UserInfo1 loginObject=(UserInfo1)request.getAttribute("userinfo");
%>
<center>
<h1>This is home page of an application</h1>
<%
if(info!=null){
	%>
<h1 style="color:blue;r5"> welcome<%=info.getFirstname()%></h1>
<%
}
if(loginObject!=null){
%>
<h1><%=loginObject%></h1>
<%} %>
</center>
</body>
</html>