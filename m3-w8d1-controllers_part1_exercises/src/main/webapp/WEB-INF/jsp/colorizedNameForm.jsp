<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Colorized Name</title>
</head>
<body>
	<c:url var="formAction" value="/colorizedResult" />
	<form method="GET" action="${formAction }">
		<h2>Enter Name</h2>
		<div>
			<label for="firstName">First Name</label> <input type="text"
				name="firstName" id="firstName">
		</div>

		<div>
			<label for="lastName">Last Name</label> <input type="text"
				name="lastName" id="lastName">
		</div>

		<h2>Choose Colors</h2>
		<div>
			<input type="checkbox" name="red" value="true"/> Red
			<input type="checkbox" name="blue" value="true"/> Blue
			<input type="checkbox" name="green" value="true"/> Green
		</div>
		<input type="submit" value="submit">
	</form>
</body>
</html>