<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Form</title>
<style>
	.error {color:red}
</style>
</head>
<body>
<i> Fill out the form . asterisk(*) field is required </i>
	<form:form action="customerProcessForm1" modelAttribute="customer">
	FirstName: <form:input path="firstName"/> <br/>
	LastName (*):  <form:input path="lastName"/>  
	<form:errors path="lastName" cssClass="error" /> 
	<br />
	freePasses: <form:input path="freepasses"/>
	<form:errors path="freepasses" cssClass="error" /> 
	<br />
	PostalCode: <form:input path="postalCode"/>
	<form:errors path="postalCode" cssClass="error" /> 
	<br />
	CourseCode: <form:input path="courseCode"/>
	<form:errors path="courseCode" cssClass="error" /> 
	<br />
	<input type="submit" value="submit">
	</form:form>
</body>
</html>