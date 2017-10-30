<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Student View</title>
		<link href="https://fonts.googleapis.com/css?family=Poppins" rel="stylesheet">
		 <link rel="stylesheet" href="css/swim.css" />
	</head>
	<body>
		
		<h1>Student Progress</h1>
		
		<section>
			<c:url var="formAction" value="/teacherHomePage" />
			<form:form method="POST" action="${formAction }" modelAttribute="studentDetail">
					<table> 
					<tr> 
				 		<th>&nbsp;</th>
						<c:forEach items= "${allStudents}" var="student">
							<th><c:out value="${student.lastName}" />, <c:out value="${student.firstName}" /></th>
						</c:forEach>
					</tr>
					<c:if test="${swimClass.skill1Introduced } == true" >
						<tr> 
						<th><c:out value="${swimClass.skill1 }"/></th>
						<c:forEach items="${allStudents }" var="student">
							<td>
							<c:choose>
								<c:when test="${student.skill1Accomplished = true}">
							<input type="checkbox" id="skill1" name="skill1Accomplished" value="true" <c:out value="checked"/>>
								</c:when>
								<c:otherwise>
								<input type="checkbox" id="skill1" name="skill1Accomplished" value="true">
								</c:otherwise>
							</c:choose>
						</td>
					</c:forEach>
					</tr>
					</c:if>
					<c:if test="${swimClass.skill2Introduced } == true" >
						<tr> 
						<th><c:out value="${swimClass.skill2 }"/></th>
						<c:forEach items="${allStudents }" var="student">
							<td>
							<c:choose>
								<c:when test="${student.skill2Accomplished = true}">
							<input type="checkbox" id="skill2" name="skill2Accomplished" value="true" <c:out value="checked"/>>
								</c:when>
								<c:otherwise>
								<input type="checkbox" id="skill2" name="skill2Accomplished" value="true">
								</c:otherwise>
							</c:choose>
						</td>
					</c:forEach>
					</tr>
					</c:if>
					<c:if test="${swimClass.skill3Introduced } == true" >
						<tr> 
						<th><c:out value="${swimClass.skill3 }"/></th>
						<c:forEach items="${allStudents }" var="student">
							<td>
							<c:choose>
								<c:when test="${student.skill3Accomplished = true}">
							<input type="checkbox" id="skill3" name="skill3Accomplished" value="true" <c:out value="checked"/>>
								</c:when>
								<c:otherwise>
								<input type="checkbox" id="skill3" name="skill3Accomplished" value="true">
								</c:otherwise>
							</c:choose>
						</td>
					</c:forEach>
					</tr>
					</c:if>
					<c:if test="${swimClass.skill4Introduced } == true" >
						<tr> 
						<th><c:out value="${swimClass.skill4 }"/></th>
						<c:forEach items="${allStudents }" var="student">
							<td>
							<c:choose>
								<c:when test="${student.skill4Accomplished = true}">
							<input type="checkbox" id="skill4" name="skill4Accomplished" value="true" <c:out value="checked"/>>
								</c:when>
								<c:otherwise>
								<input type="checkbox" id="skill2" name="skill4Accomplished" value="true">
								</c:otherwise>
							</c:choose>
						</td>
					</c:forEach>
					</tr>
					</c:if>
					<c:if test="${swimClass.skill5Introduced } == true" >
						<tr> 
						<th><c:out value="${swimClass.skill5 }"/></th>
						<c:forEach items="${allStudents }" var="student">
							<td>
							<c:choose>
								<c:when test="${student.skill5Accomplished = true}">
							<input type="checkbox" id="skill5" name="skill5Accomplished" value="true" <c:out value="checked"/>>
								</c:when>
								<c:otherwise>
								<input type="checkbox" id="skill5" name="skill5Accomplished" value="true">
								</c:otherwise>
							</c:choose>
						</td>
					</c:forEach>
					</tr>
					</c:if>
					<c:if test="${swimClass.skill6Introduced } == true" >
						<tr> 
						<th><c:out value="${swimClass.skill6 }"/></th>
						<c:forEach items="${allStudents }" var="student">
							<td>
							<c:choose>
								<c:when test="${student.skill6Accomplished = true}">
							<input type="checkbox" id="skill6" name="skill6Accomplished" value="true" <c:out value="checked"/>>
								</c:when>
								<c:otherwise>
								<input type="checkbox" id="skill6" name="skill6Accomplished" value="true">
								</c:otherwise>
							</c:choose>
						</td>
					</c:forEach>
					</tr>
					</c:if>
					<c:if test="${swimClass.skill7Introduced } == true" >
						<tr> 
						<th><c:out value="${swimClass.skill7 }"/></th>
						<c:forEach items="${allStudents }" var="student">
							<td>
							<c:choose>
								<c:when test="${student.skill7Accomplished = true}">
							<input type="checkbox" id="skill7" name="skill7Accomplished" value="true" <c:out value="checked"/>>
								</c:when>
								<c:otherwise>
								<input type="checkbox" id="skill7" name="skill7Accomplished" value="true">
								</c:otherwise>
							</c:choose>
						</td>
					</c:forEach>
					</tr>
					</c:if>
					<c:if test="${swimClass.skill8Introduced } == true" >
						<tr> 
						<th><c:out value="${swimClass.skill8 }"/></th>
						<c:forEach items="${allStudents }" var="student">
							<td>
							<c:choose>
								<c:when test="${student.skill8Accomplished = true}">
							<input type="checkbox" id="skill8" name="skill8Accomplished" value="true" <c:out value="checked"/>>
								</c:when>
								<c:otherwise>
								<input type="checkbox" id="skill8" name="skill8Accomplished" value="true">
								</c:otherwise>
							</c:choose>
						</td>
					</c:forEach>
					</tr>
					</c:if>
					<c:if test="${swimClass.skill9Introduced } == true" >
						<tr> 
						<th><c:out value="${swimClass.skill9 }"/></th>
						<c:forEach items="${allStudents }" var="student">
							<td>
							<c:choose>
								<c:when test="${student.skill9Accomplished = true}">
							<input type="checkbox" id="skill9" name="skill9Accomplished" value="true" <c:out value="checked"/>>
								</c:when>
								<c:otherwise>
								<input type="checkbox" id="skill9" name="skill9Accomplished" value="true">
								</c:otherwise>
							</c:choose>
						</td>
					</c:forEach>
					</tr>
					</c:if>
			 		</table> 
		   		<button type="submit" value="submit">Update Student Progress</button> 
			</form:form>
		</section>
		</body>
		</html>