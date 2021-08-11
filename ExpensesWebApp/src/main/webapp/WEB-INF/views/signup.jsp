<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">



</head>
<body class="mt-5 bg-warning">
	<div class="container">
		<div class="row" style="margin-top:50px;">
			<div class="col-md-4"></div>
			<div class="col-md-4 alert alert-success">
				<div class="h2 text-center">
					<a href="userData"> Signup</a>
					<hr>
				</div>
				<form action="saveUser" Class="form-border" method="post">
					<div class="form-group">
						<label for="name">Name:</label> <input type="text"
							class="form-control" name="name" />
					</div>
					<div class="form-group">
						<label for="email">Email address:</label> <input type="email"
							class="form-control" name="email" />

					</div>
					<div class="form-group">
						<label for="email">Gender: </label> <input type="radio"
							name="gender" class="form-radio-control" value="Male" /> Male <input
							type="radio" name="gender" class="form-radio-control"
							value="Female" /> Female

					</div>
					<div class="form-group">
						<label for="Hobby">Hobby: </label> <input type="checkbox"
							name="hobby" class="form-checkbox-control" value="travelling" />
						Travelling <input type="checkbox" name="hobby" value="reading"
							class="form-checkbox-control" /> Reading <input type="checkbox"
							name="hobby" value="playing" class="form-checkbox-control" />
						Playing

					</div>
					<div class="form-group">
						<label for="pwd">Password:</label> <input type="password"
							class="form-control" name="password" />

					</div>
					
					<div class="text-center">
						<button type="submit" class="btn btn-primary">Create Account</button>
					</div>
				</form>
			</div>
			<div class="col-md-4"></div>
		</div>
	</div>
</body>
</html>