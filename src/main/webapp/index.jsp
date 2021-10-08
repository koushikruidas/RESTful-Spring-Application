<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<body>
	<h2>Hello <sec:authentication property="principal.username" /></h2> <!-- To display the logged user name. -->
	<p> Roles: <sec:authentication property="principal.authorities"/> </p> <!-- To display the user role. -->
	<p>
		link to <a href="display/addCustomer">add customer</a>
	</p>
	<p>
		link to <a href="display/showName">show customer</a>
	</p>
	<form:form action="${pageContext.request.contextPath }\logout">
		<input type="submit" value="Logout">
	</form:form>
</body>
</html>
