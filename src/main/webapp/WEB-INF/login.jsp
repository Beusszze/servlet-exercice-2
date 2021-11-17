<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page de connexion</title>
</head>
<body>
<h1> Bienvenue sur la page de connexion</h1>
<h3> Renseignez vos identifiants personnels</h3>

<form name="loginForm" method="post" action="login">
Nom d'utilisateur : <input type="text" value="${username}" name="username"><br>
Mot de passe : <input type="password" value="${password}" name="password"><br>
<input type="submit" value="login">
</form>



<p> user : visitor<br> mdp : visitorP</p>

</body>
</html>