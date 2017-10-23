<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>FizzBuzz Revisited</title>
</head>
<body>
	<h1>FizzBuzz Revisited</h1>
	<c:url var="formAction" value="/fizzBuzzResult" />
	<form method="GET" action="${formAction }">
		<div>
			<label for="divisor1">Divisible By: </label><br> <input type="text"
				name="divisor1" class="firstFields"><br>
		
			<label for="divisor2">Divisible By:</label><br> <input type="text"
				name="divisor2" id="firstFields"><br>
		
			<label for="fizzWord">Alternative Fizz:</label> <br><input type="text"
				name="fizzWord" id="firstFields"><br>
		
			<label for="buzzWord">Alternative Buzz:</label><br> <input type="text"
				name="buzzWord" id="firstFields">
		</div>
		<br>

		
		<div>
			<label for="num1">Number 1: </label> <input type="number"
				name="num1" class="secondFields"><br>
		
			<label for="num2">Number 2:</label> <input type="number"
				name="num2" class="secondFields"><br>
		
			<label for="num3">Number 3:</label> <input type="number"
				name="num3" class="secondFields"><br>
		
			<label for="num4">Number 4:</label> <input type="number"
				name="num4" class="secondFields"><br>
				
			<label for="num5">Number 5:</label> <input type="number"
				name="num5" class="secondFields">	
		</div>
		<input type="submit" value="submit">
	</form>
</body>
</html>