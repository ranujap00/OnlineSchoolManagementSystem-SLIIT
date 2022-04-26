<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Staff</title>
</head>
<body>
	<h3>Hello, I am a staff member</h3>
	
	<table>
	<c:forEach var="stf" items="${staffDetails}">
	
	<tr>
		<td>Staff ID</td>
		<td>${stf.staffID}</td>
	</tr>
	<tr>
		<td>Staff Name</td>
		<td>${stf.name}</td>
	</tr>
	<tr>
		<td>Staff age</td>
		<td>${stf.age}</td>
	</tr>
	<tr>
		<td>Staff address</td>
		<td>${stf.address}</td>
	</tr>
	<tr>
		<td>Staff Phone</td>
		<td>${stf.phone}</td>
	</tr>
	<tr>
		<td>Staff NIC</td>
		<td>${stf.NIC}</td>
	</tr>
	<tr>
		<td>Staff email</td>
		<td>${stf.email}</td>
	</tr>
	<tr>
		<td>Staff role</td>
		<td>${stf.role}</td>
	</tr>
	<tr>
		<td>Staff salary</td>
		<td>${stf.salary}</td>
	</tr>
	<tr>
		<td>Staff User Name</td>
		<td>${stf.username}</td>
	</tr>

	</c:forEach>
	</table>
</body>
</html>