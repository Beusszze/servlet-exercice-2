<%@page import="models.Student"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des �tudiants</title>
</head>
<body style="font-family : Tahoma; background-color : #F5F5F5">
<% Student student = (Student) request.getAttribute("student"); %>
	<h1><%=student.getUsername()%></h1>
		<p> Pr�nom : <%=student.getFirstName()%> Nom de famille : <%=student.getLastName()%><br>
		�ge :<%=student.getAge()%><br>
		Formation suivie : <%=student.getCourse()%></p>

</body>
</html>