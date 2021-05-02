<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First Form Page</title>
</head>
<body>
	<div>
		<form:form action="processForm2" modelAttribute="student">
			<p>
				First Name:
				<form:input path="firstName" />
			</p>
			<p>
				Last Name:
				<form:input path="lastName" />
			</p>
			<p>
			Country:
			<form:select path="country">
			<form:options items="${student.countryOptions}"/>
			</form:select>
			</p>
			<p>
				<input type="submit" value="Submit">
			</p>
		</form:form>
	</div>
</body>
</html>