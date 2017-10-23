<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Reverse Last Two Characters</title>
</head>
<body>
<h1>Reverse Last Two Characters</h1>
	<c:url var="formAction" value="/lastTwoResults" />
	<form:form method="POST" action="${formAction }" modelAttribute="wordToReverse">
		<div>
			<label for="word1">Word 1: </label> <input type="text"
				name="word1" id="word1">
		</div>
		<div>
			<label for="word2">Word 2: </label> <input type="text"
				name="word2" id="word2">
		</div>
		<div>
			<label for="word3">Word 3: </label> <input type="text"
				name="word3" id="word3">
		</div>
		<div>
			<label for="word4">Word 4: </label> <input type="text"
				name="word4" id="word4">
		</div>
		<div>
			<label for="word5">Word 5: </label> <input type="text"
				name="word5" id="word5">
		</div>
		<div>
			<label for="word6">Word 6: </label> <input type="text"
				name="word6" id="word6">
		</div>
		<div>
			<label for="word7">Word 7: </label> <input type="text"
				name="word7" id="word7">
		</div>
		<div>
			<label for="word8">Word 8: </label> <input type="text"
				name="word8" id="word8">
		</div>
		<div>
			<label for="word9">Word 9: </label> <input type="text"
				name="word9" id="word9">
		</div>
		<div>
			<label for="word10">Word 10: </label> <input type="text"
				name="word10" id="word10">
		</div>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>