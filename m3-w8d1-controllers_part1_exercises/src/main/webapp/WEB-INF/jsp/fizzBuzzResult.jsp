<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>FizzBuzz Revisited</title>
</head>
<body>
	<h2>FizzBuzz Revisited</h2>
	<br>
	Divisible By: <c:out value="${fizzBuzz.divisor1}" /><br>
	Divisible By: <c:out value="${fizzBuzz.divisor2}" /><br>
	Divisible By Both: <c:out value="${fizzBuzz.divisor1}" /> and <c:out value="${fizzBuzz.divisor2}" /><br>
	<br>
	
	Alternative Fizz: <c:out value="${fizzBuzz.fizzWord}" /><br>
	Alternative Buzz: <c:out value="${fizzBuzz.buzzWord}" /><br>
	
	<c:out value="${fizzBuzz.fizzBuzzMap.get(fizzBuzz.num1)}" /><br>
	<c:out value="${fizzBuzz.fizzBuzzMap.get(fizzBuzz.num2)}"/><br>
	<c:out value="${fizzBuzz.fizzBuzzMap.get(fizzBuzz.num3)}"/><br>
	<c:out value="${fizzBuzz.fizzBuzzMap.get(fizzBuzz.num4)}" /><br>
	<c:out value="${fizzBuzz.fizzBuzzMap.get(fizzBuzz.num5)}"/>
</body>
</html>