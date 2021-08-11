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
		<div class="row" style="margin-top: 50px;">
			<div class="col-md-4"></div>
			<div class="col-md-4 alert alert-success">
				<div class="h2 text-center">
					<a href="userData"> Forgot Password</a>
					<hr>
				</div>
				<form action="" Class="form-border" method="post">
					<div class="form-group">
						<label for="email">Email address:</label> <input type="email"
							class="form-control" name="email" />

					</div>
					<div class="text-center">
						<button type="submit" class="btn btn-primary">Get OTP</button>
					</div>
				</form>
			</div>
			<div class="col-md-4"></div>
		</div>
	</div>
</body>
</html>