<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<jsp:useBean id="p1" scope="page" class="fr.formation.garage.Person"></jsp:useBean>
<jsp:useBean id="p2" scope="session" class="fr.formation.garage.Person"></jsp:useBean>
<jsp:useBean id="p3" scope="application" class="fr.formation.garage.Person"></jsp:useBean>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Beans</title>
	</head>
	
	<body>
		<p>
			<strong>Person 1 :</strong>
			<ul>
				<li>First Name : <jsp:getProperty name="p1" property="fName" /></li>
				<li>Last Name : <jsp:getProperty name="p1" property="lName" /></li>
				<li>Age : <jsp:getProperty name="p1" property="age" /></li>
				<li>Scope : <jsp:getProperty name="p1" property="scope" /></li>
			</ul>
		</p>
		<p>
			<strong>Person 2 :</strong>
			<ul>
				<li>First Name : <jsp:getProperty name="p2" property="fName" /></li>
				<li>Last Name : <jsp:getProperty name="p2" property="lName" /></li>
				<li>Age : <jsp:getProperty name="p2" property="age" /></li>
				<li>Scope : <jsp:getProperty name="p2" property="scope" /></li>
			</ul>
		</p>
		<p>
			<strong>Person 3 :</strong>
			<ul>
				<li>First Name : <jsp:getProperty name="p3" property="fName" /></li>
				<li>Last Name : <jsp:getProperty name="p3" property="lName" /></li>
				<li>Age : <jsp:getProperty name="p3" property="age" /></li>
				<li>Scope : <jsp:getProperty name="p3" property="scope" /></li>
			</ul>
		</p>
	</body>
</html>