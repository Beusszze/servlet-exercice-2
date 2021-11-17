<%@page import="models.Course"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des formations</title>
</head>
<body>
<h1>Nos formations</h1>
<ul>
	<% for (Course course : (List<Course>) request.getAttribute("courses")) { %>
		<li>	
			<a href="/exoServletDeux/formation?title=<%=course.getTitle()%>"><%=course.getTitle()%></a>
		</li>
	<% } %>
</ul>

</body>
</html>

