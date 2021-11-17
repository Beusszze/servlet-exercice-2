<%@page import="models.Course"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des formations</title>
</head>
<body style="font-family : Tahoma; background-color : #F5F5F5" style >
<% Course course = (Course) request.getAttribute("course"); %>
	<h1 style="text-align : center"><%=course.getTitle()%></h1>
		<p style="font-size : 25px"><b>Nombre d'étudiants</b> : <%=course.getStudentNbr() %><br>
		<b>Programme</b> : <%=course.getProgramm()%></p>

</body>
</html>