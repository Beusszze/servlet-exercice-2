<%@page import="models.Student"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des formations</title>
</head>
<body style="font-family : Tahoma; background-color : #F5F5F5">
<h1 style="text-align : center">Nos étudiants</h1>
<ul>
	<% for (Student student : (List<Student>) request.getAttribute("students")) { %>
 	 	<li style="font-size : 25px">	
			<a href="/exoServletDeux/etudiant?username=<%= student.getUsername()%>"><%= student.getUsername() %></a>
		</li> 
	<% } %> 
</ul>

</body>
</html>