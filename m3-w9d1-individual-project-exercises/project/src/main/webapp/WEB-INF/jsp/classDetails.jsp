<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Class View</title>
		<link href="https://fonts.googleapis.com/css?family=Poppins" rel="stylesheet">
		 <link rel="stylesheet" href="css/swim.css" />
	</head>
	<body>
		
		<h1>Class Progress</h1>
			
		<c:url var="formAction" value="/teacherHome" />
	<form:form method="POST" action="${formAction }" modelAttribute="classDetail">
		<div>
		<c:choose>
			<c:when test="${classDetails.skill1Introduced == true}">
		<input type="checkbox" id="skill1" name="skill1Introduced" value="true" <c:out value="checked"/>>
			</c:when>
			<c:otherwise>
			<input type="checkbox" id="skill1" name="skill1Introduced" value="true" >
			</c:otherwise>
		</c:choose>
		<label for="skill1" ><c:out value="${classDetails.skill1 }" 
		/></label>
		<c:out value="${classDetails.skill1Description }" /> 
		</div>
		
		<div>
		<c:choose>
			<c:when test="${classDetails.skill2Introduced == true}">
		<input type="checkbox" id="skill2" name="skill2Introduced" value="true" <c:out value="checked"/>>
		</c:when>
			<c:otherwise>
			<input type="checkbox" id="skill2" name="skill2Introduced" value="true">
			</c:otherwise>
		</c:choose>
		<label for="skill2"><c:out value="${classDetails.skill2 }" 
		/></label>
		<c:out value="${classDetails.skill2Description }" /> 
		</div>
		
		<div>
		<c:choose>
			<c:when test="${classDetails.skill3Introduced == true}">
		<input type="checkbox" id="skill3" name="skill3Introduced" value="true" <c:out value="checked"/>>
			</c:when>
			<c:otherwise>
			<input type="checkbox" id="skill3" name="skill3Introduced" value="true" >
			</c:otherwise>
		</c:choose>
		<label for="skill3" ><c:out value="${classDetails.skill3 }" 
		/></label>
		<c:out value="${classDetails.skill3Description }" /> 
		</div>
		
		<div>
		<c:choose>
			<c:when test="${classDetails.skill4Introduced == true}">
		<input type="checkbox" id="skill4" name="skill4Introduced" value="true" <c:out value="checked"/>>
			</c:when>
			<c:otherwise>
			<input type="checkbox" id="skill4" name="skill4Introduced" value="true" >
			</c:otherwise>
		</c:choose>
		<label for="skill4" ><c:out value="${classDetails.skill4 }" 
		/></label>
		<c:out value="${classDetails.skill4Description }" /> 
		</div>
		
		<div>
		<c:choose>
			<c:when test="${classDetails.skill5Introduced == true}">
		<input type="checkbox" id="skill5" name="skill5Introduced" value="true" <c:out value="checked"/>>
			</c:when>
			<c:otherwise>
			<input type="checkbox" id="skill5" name="skill5Introduced" value="true" >
			</c:otherwise>
		</c:choose>
		<label for="skill5" ><c:out value="${classDetails.skill5 }" 
		/></label>
		<c:out value="${classDetails.skill1Description }" /> 
		</div>
		
		<div>
		<c:choose>
			<c:when test="${classDetails.skill6Introduced == true}">
		<input type="checkbox" id="skill6" name="skill6Introduced" value="true" <c:out value="checked"/>>
			</c:when>
			<c:otherwise>
			<input type="checkbox" id="skill6" name="skill6Introduced" value="true" >
			</c:otherwise>
		</c:choose>
		<label for="skill6" ><c:out value="${classDetails.skill6 }" 
		/></label>
		<c:out value="${classDetails.skill6Description }" /> 
		</div>
		
		<div>
		<c:choose>
			<c:when test="${classDetails.skill7Introduced == true}">
		<input type="checkbox" id="skill7" name="skill7Introduced" value="true" <c:out value="checked"/>>
			</c:when>
			<c:otherwise>
			<input type="checkbox" id="skill7" name="skill7Introduced" value="true" >
			</c:otherwise>
		</c:choose>
		<label for="skill7" ><c:out value="${classDetails.skill7 }" 
		/></label>
		<c:out value="${classDetails.skill7Description }" /> 
		</div>
		
		<div>
		<c:choose>
			<c:when test="${classDetails.skill8Introduced == true}">
		<input type="checkbox" id="skill8" name="skill8Introduced" value="true" <c:out value="checked"/>>
			</c:when>
			<c:otherwise>
			<input type="checkbox" id="skill8" name="skill8Introduced" value="true" >
			</c:otherwise>
		</c:choose>
		<label for="skill8" ><c:out value="${classDetails.skill8 }" 
		/></label>
		<c:out value="${classDetails.skill8Description }" /> 
		</div>
		
		<div>
		<c:choose>
			<c:when test="${classDetails.skill9Introduced == true}">
		<input type="checkbox" id="skill9" name="skill9Introduced" value="true" <c:out value="checked"/>>
			</c:when>
			<c:otherwise>
			<input type="checkbox" id="skill9" name="skill9Introduced" value="true" >
			</c:otherwise>
		</c:choose>
		<label for="skill9" ><c:out value="${classDetails.skill9 }" 
		/></label>
		<c:out value="${classDetails.skill9Description }" /> 
		</div>
    		<button type="submit" value="submit">Update Class Progress</button>
		</form:form>
		
	</body>
</html>