<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>
	<h3>Hi, I am a Student</h3>
	
	<table>
	<c:forEach var="student" items="${stdDetails}">
	
	<tr>
		<td>Student ID</td>
		<td>${student.sid}</td>
	</tr>
	<tr>
		<td>Student Name</td>
		<td>${student.name}</td>
	</tr>
	<tr>
		<td>Student age</td>
		<td>${student.age}</td>
	</tr>
	<tr>
		<td>Student address</td>
		<td>${student.address}</td>
	</tr>
	<tr>
		<td>Student Phone</td>
		<td>${student.phone}</td>
	</tr>
	<tr>
		<td>Student Grade</td>
		<td>${student.grade}</td>
	</tr>
	<tr>
		<td>Student User Name</td>
		<td>${student.username}</td>
	</tr>

	</c:forEach>
	</table>
</body>
</html>