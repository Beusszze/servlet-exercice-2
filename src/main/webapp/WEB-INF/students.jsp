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
<body style="font-family : Tahoma; background-color : #F5F5F5" style >
<h1>Liste des étudiants</h1>
<ul>
	<% for (Student student : (List<Student>) request.getAttribute("students")) { %>
 	 	<li>	
			<a href="/exoServletDeux/etudiant?title=<%= student.getUsername()%>"><%= student.getUsername() %></a>
		</li> 
	<% } %> 
</ul>

</body>
</html>