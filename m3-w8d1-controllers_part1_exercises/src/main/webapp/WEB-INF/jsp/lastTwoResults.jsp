<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>Last2</title>
</head>
<body>
<h2>Last Two Results</h2>

			<div>
			<c:out value="${LastTwoList.wordList.get(0) }"/>: <c:out value="${LastTwoList.reverseList.get(0) }"/><br>
			<c:out value="${LastTwoList.wordList.get(1) }"/>: <c:out value="${LastTwoList.reverseList.get(1) }"/><br>
			<c:out value="${LastTwoList.wordList.get(2) }"/>: <c:out value="${LastTwoList.reverseList.get(2) }"/><br>
			<c:out value="${LastTwoList.wordList.get(3) }"/>: <c:out value="${LastTwoList.reverseList.get(3) }"/><br>
			<c:out value="${LastTwoList.wordList.get(4) }"/>: <c:out value="${LastTwoList.reverseList.get(4) }"/><br>
			<c:out value="${LastTwoList.wordList.get(5) }"/>: <c:out value="${LastTwoList.reverseList.get(5) }"/><br>
			<c:out value="${LastTwoList.wordList.get(6) }"/>: <c:out value="${LastTwoList.reverseList.get(6) }"/><br>
			<c:out value="${LastTwoList.wordList.get(7) }"/>: <c:out value="${LastTwoList.reverseList.get(7) }"/><br>
			<c:out value="${LastTwoList.wordList.get(8) }"/>: <c:out value="${LastTwoList.reverseList.get(8) }"/><br>
			<c:out value="${LastTwoList.wordList.get(9) }"/>: <c:out value="${LastTwoList.reverseList.get(9) }"/>
			</div>

</body>
</html>