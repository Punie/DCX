<%@ include file="/header-garage.jsp" %>

<%! ArrayList<Voiture> voitures = VoitureDAO.getAll(); %>
<div class="container">
	<table class="table table-bordered table-condensed">
		<tr>
			<td>
				<strong>Id</strong>
			</td>
			<td>
				<strong>Ref</strong>
			</td>
			<td>
				<strong>Marque</strong>
			</td>
			<td>
				<strong>Pays</strong>
			</td>
			<td>
				<strong>Couleur</strong>
			</td>
			<td>
				<strong>Nb Portes</strong>
			</td>
			<td>
				<strong>Prix</strong>
			</td>
		</tr>
		<% for (Voiture v : voitures) { %>
		<tr>
  				<td>
  					<%-- <%= v.id () %> --%>
  					<%= 25/0 %>
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

<%@ include file="/footer-garage.jsp" %>