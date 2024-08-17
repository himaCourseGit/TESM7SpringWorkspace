<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<form action="updateSalary">
<h1>Update salary</h1>
<input placeholder="Enter Id" name="id">
<br><br>
<input placeholder="Enter Updated Salary" name="salary">
<br><br>
<input type="submit" value="Update Salary">
</form>
<hr>
<form action="addEmp">
<h1>Add Employee</h1>
<input placeholder="Enter id"
name="empId">
<br><br>
<input placeholder="Enter Name" name="ename">
<br><br>
<input placeholder="Enter salary" name="salary">
<br><br>
<input placeholder="Enter Dept No" name="deptNo">
<br><br>
<input type="submit" value="ADD">
</form>
</fieldset>
</body>
</html>