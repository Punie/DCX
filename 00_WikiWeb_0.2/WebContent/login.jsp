<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<title>Wiki - Login</title>
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<form class="form-horizontal" action="login" method="POST">
				<div class="form-group">
					<div class="col-sm-offset-4 col-sm-4">
						<h2>Log in</h2>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-4 control-label" for="login">Login</label>
					<div class="col-sm-4">
						<input class="form-control" type="text" name="login" placeholder="Login" required>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-4 control-label" for="pwd">Password</label>
					<div class="col-sm-4">
						<input class="form-control" type="password" name="pwd" placeholder="Password" disabled>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-4 col-sm-4">
						<input class="btn btn-primary" type="submit" name="submit" value="Log in" />
					</div>
				</div>
			</form>
		</div>
	</body>
</html>