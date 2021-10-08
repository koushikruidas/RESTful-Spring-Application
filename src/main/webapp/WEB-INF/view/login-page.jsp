<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Login page</title>
<style type="text/css">
.error {
	color: red;
}
</style>
<link rel="stylesheet" href="/css/login.css">
</head>
<body>
	<%-- <h2>My Custom login form</h2>
	<form:form
		action="${pageContext.request.contextPath }/authenticateTheUser"
		method="POST">
		<div class="error">
			<c:if test="${param.error != null }">
				<i>You have entered a wrong username/password</i>
			</c:if>
		</div>
		<p>
			User name: <input type="text" name="username" />
		<p>
			Password: <input type="password" name="password" /> <input
				type="submit" value="Login" />
	</form:form> --%>
</body>
</html>
