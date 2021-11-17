<%@page import="models.Course"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des formations</title>
</head>
<body>
<% Course course = (Course) request.getAttribute("course"); %>
	<h1><%=course.getTitle()%></h1>
		<p><%=course.getProgramm()%></p>

</body>
</html>