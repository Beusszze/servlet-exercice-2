<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page de connexion</title>
</head>
<body style="font-family : Tahoma; background-color : #F5F5F5" style >

<h1 style="text-align : center"> Bienvenue sur la page de connexion</h1>
<h3 style="font-size: 20px "> Renseignez vos identifiants personnels</h3>

<div style="display : flex"> 
<form name="loginForm" method="post" action="login">
<b>Nom d'utilisateur</b> : <input type="text" value="${username}" name="username"><br>
<b>Mot de passe</b> : <input type="password" value="${password}" name="password"><br>
<input type="submit" value="Se connecter">
</form>
</div>


<p style="font-size: 25px"> <b>user</b> : visitor<br> <b>mdp</b> : visitorP</p>

</body>
</html>