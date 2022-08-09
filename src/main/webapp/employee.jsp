<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- Bootstrap CSS -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
		integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>

<body>
	<div class="container">
		<form method="POST" action="employee">
			<div class="form-group">
				<label for="id">Employee Id</label>
				<input type="number" class="form-control" placeholder="Employee Id" name="empId">
			</div>
			<div class="form-group">
				<label for="firstName">First Name</label>
				<input type="text" class="form-control" placeholder="First Name" name="fname">
			</div>
			<div class="form-group">
				<label for="lastName">Last Name</label>
				<input type="text" class="form-control" placeholder="Last Name" name="lname">
			</div>
			<div class="form-group">
				<label for="age">Password</label>
				<input type="password" class="form-control" placeholder="Password"  name="password">
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>

</html>