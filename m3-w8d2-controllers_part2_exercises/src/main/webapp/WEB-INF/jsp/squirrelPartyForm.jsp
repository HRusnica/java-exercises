<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<head>
<title>Squirrel Party for Dummies Review</title>
<c:url value="/css/squirrelParty.css" var="cssHref" />
    <link rel="stylesheet" href="${cssHref}">
</head>

<body>
<h1 class="centered">New Squirrel Party Review</h1>

		
		<c:if test="${message != null}"/>
			<div style="color:red"><c:out value="${message }"/></div>
		<c:url var="formAction" value="/squirrelPartyForm" />
		<form:form method="POST" action="${formAction}" modelAttribute="squirrelPartyForm">

			<div class="formInputGroup">
				<div>
					<label for="username"><strong>*Username: </strong></label> <input
						type="text" name="username" /><br>
						<form:errors path="username" cssClass="error"/>
				</div>

				<div>
					<label for="title"><strong>*Title: </strong></label> <input
						type="text" name="title" /><br>
						<form:errors path="title" cssClass="error"/>
				</div>

				<div>
					<label for="rating"><strong>*Rating: </strong></label> <input
						type="text" name="rating" /><br>
						<form:errors path="rating" cssClass="error"/>
				</div>
				
				<div>
					<label for="text"><strong>*Review: </strong></label> <input
						type="text" name="text" />
						<form:errors path="text" cssClass="error"/>
				</div>

				<div id="submit-button">
					<input class="button" type="submit" value="Submit Review" />
				</div>
			</div>

		</form:form>
</body>
</html>
