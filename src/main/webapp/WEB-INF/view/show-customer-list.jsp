<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>"This is inside hello file, i am koushik ruidas."</h1>
	<c:forEach var="i" items="${customerList }">
		<div>
			First Name:
			<c:out value="${i.firstName}" />
			<p>
				Last Name:
				<c:out value="${i.lastName }"></c:out> 	
			<p>
				Phone Number:
				<c:out value="${i.contactNumber }"></c:out>
			<p>

				Email:
				<c:out value="${i.email }"></c:out>
		</div>

	</c:forEach>
</body>
</html>