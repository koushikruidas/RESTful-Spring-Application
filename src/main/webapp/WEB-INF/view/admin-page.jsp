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
	<h1>You are in ADMIN page</h1>
	<br>
	<a href="${pageContext.request.contextPath }/">Home</a>
	<br>
	<form:form action="${pageContext.request.contextPath }\logout">
		<input type="submit" value="Logout">
	</form:form>
</body>
</html>