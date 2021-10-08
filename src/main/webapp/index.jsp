<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<body>
	<h2>Hello Koushik Ruidas!</h2>
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
