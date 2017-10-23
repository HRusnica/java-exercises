<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Ordered Name</title>
	</head>
	<body>
			<h1>Enter Name</h1>
			<c:url var="formAction" value="/nameOrderResult" />
			<form method="POST" action="${formAction}">
		<div class = "formInputGroup">
			<label for="firstName">First name: </label>
			<input type="text" name="firstName" />
			<label for="middleName">Middle name: </label>
			<input type="text" name="middleName" />
			<label for="lastName">Last name: </label>
			<input type="text" name="lastName" />
		</div>		
	
		<h1>Choose Order</h1>
		 <div>
    <input type="radio" id="contactChoice1"
     name="FML" value="FML">
    <label for="contactChoice1">First MI Last</label>

    <input type="radio" id="contactChoice2"
     name="FL" value="FL">
    <label for="contactChoice2">First Last</label>

    <input type="radio" id="contactChoice3"
     name="LFM" value="LFM">
    <label for="contactChoice3">Last, First MI</label>
    
    <input type="radio" id="contactChoice3"
     name="LF" value="LF">
    <label for="contactChoice3">Last, First</label>
  </div>
	
	<input class="formSubmitButton" type="submit" value="order" />
</form>	
	</body>
</html>
