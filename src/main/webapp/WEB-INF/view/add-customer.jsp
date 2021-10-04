<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Save Customer</h3>
	<form:form action="saveCustomer" modelAttribute="customer-details"
		method="POST">
		<table>
			<tr>
				<td><label>First Name: </label></td>
				<td><form:input path="firstName" /> 
			</tr>
			<tr>
				<td><label>Last Name: </label></td>
				<td><form:input path="lastName" /> 
			</tr>
			<tr>
				<td><label>Email: </label></td>
				<td><form:input path="email" /> 
			</tr>
			<tr>
				<td><label>Contact Number: </label></td>
				<td><form:input path="contactNumber" /> 
			</tr>
			<tr>
				<td><label></label></td>
				<td><input type="submit" value="Save" class="save" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>