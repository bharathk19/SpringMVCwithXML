<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First Page</title>
</head>
<body>
	<h2> Hello Spring world MVC Project</h2>
	<br />
	<p> Student Name:= ${student.firstName} ${student.lastName} </p> 
	<p> Country is:  ${student.country}</p>
	<p> Favorite Language: ${student.favoriteLanguage} </p>
	<p> Operating System: 
	<ul>
	<c:forEach var="temp" items="${student.operatingSystem}">
	<li> ${temp} </li>
	</c:forEach>
	</ul> 
	</p>
</body>
</html>