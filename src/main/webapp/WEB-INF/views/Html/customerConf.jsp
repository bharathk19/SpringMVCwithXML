<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
	<p> customer Name= ${customer.firstName} ${customer.lastName} </p> 
	<p> Free Passes: ${customer.freepasses} </p>
	<p> PostalCode: ${customer.postalCode} </p>
	<p> CourseCode: ${customer.courseCode} </p>
</body>
</html>