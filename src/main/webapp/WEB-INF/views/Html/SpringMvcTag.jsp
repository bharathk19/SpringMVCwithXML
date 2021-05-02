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
		<form:form action="processForm3" modelAttribute="student">
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
			<form:option value="Brazil" label="Brazil"/>
			<form:option value="USA" label="USA"/>
			<form:option value="India" label="India"/>
			<form:option value="Germany" label="Germany"/>
			<form:option value="Russia" label="Russia"/>
			</form:select>
			</p>
			Favorite Language
			<p>
			Java <form:radiobutton path="favoriteLanguage" value="Java"/>
			PHP  <form:radiobutton path="favoriteLanguage" value="PHP"/>
			SQL  <form:radiobutton path="favoriteLanguage" value="SQL"/>
			JavaScript  <form:radiobutton path="favoriteLanguage" value="JavaScript"/>
			Ruby  <form:radiobutton path="favoriteLanguage" value="Ruby"/>
			</p>
			Operating System
			<p>
			Linux <form:checkbox path="operatingSystem" value="Linux"/>
			Windows <form:checkbox path="operatingSystem" value="Windows"/>
			MAC <form:checkbox path="operatingSystem" value="MAC"/>
			Kali <form:checkbox path="operatingSystem" value="kali"/>
			</p>
			<p>
				<input type="submit" value="Submit">
			</p>
			
		</form:form>
	</div>
</body>
</html>