<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<jsp:useBean id="user" class="fr.formation.wiki.beans.User" scope="session"></jsp:useBean>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Wiki</title>
	</head>
	<body>
		<header>
			<h1>Wiki</h1>
		</header>
		<section>
			<p>Welcome <%= user.getUserName () %></p>
			<% if (user.getId () == 0) { %>
				<a href="login.jsp">Login</a>
			<% } %>
		</section>
	</body>
</html>