<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, fr.formation.garage.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
		<title>Garage List</title>
	</head>
	<body>
		<div class="container">
			<h1>Web Garage</h1>
		</div>
		<%! ArrayList<Voiture> voitures = VoitureDAO.getAll(); %>
		<div class="container">
			<table class="table table-bordered table-condensed">
				<tr>
					<td><strong>Id</strong></td>
					<td><strong>Ref</strong></td>
					<td><strong>Marque</strong></td>
					<td><strong>Pays</strong></td>
					<td><strong>Couleur</strong></td>
					<td><strong>Nb Portes</strong></td>
					<td><strong>Prix</strong></td>
				</tr>
				<% for (Voiture v : voitures) { %>
				<tr>
    				<td>
    					<%= v.id () %>
    				</td>
					<td>
						<%= v.ref() %>
					</td>
					<td>
						<%= v.marque ().libelle () %>
					</td>
					<td>
						<%= v.marque ().pays () %>
					</td>
					<td>
						<%= v.couleur () %>
					</td>
					<td>
						<%= v.nbPorte () %>
					</td>
					<td>
						<%= v.prix () %>
					</td>
				</tr>
				<% } %>
			</table>
		</div>
	</body>
</html>