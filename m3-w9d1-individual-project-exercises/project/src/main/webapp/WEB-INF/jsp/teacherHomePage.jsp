<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Teacher Home</title>
		<link href="https://fonts.googleapis.com/css?family=Poppins" rel="stylesheet">
		 <link rel="stylesheet" href="css/swim.css" />
	</head>
	<body>
		
		<h1>Welcome, Teacher! What would you like to view? </h1>
		
		<c:url var="classUrl" value="/class"/>
		<form method="GET" action="${classUrl }">
    		<button type="submit">Class Info</button>
		</form>
		
		<c:url var="studentUrl" value="/student"/>
		<form method="GET" action="${studentUrl }">
    		<button type="submit">Student Info</button>
		</form>
		
	</body>
</html>