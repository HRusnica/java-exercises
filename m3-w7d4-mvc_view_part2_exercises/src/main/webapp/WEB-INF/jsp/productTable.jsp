<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Table View</title>
    <link rel="stylesheet" href="css/site.css" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
        <ul>
            <li><a href="#">Link 1</a></li>
            <li><a href="#">Link 2</a></li>
        </ul>
        
    </nav>
    <section id="main-content">
<h1>Toy Department</h1>
    <table id="toyTable">
    <tr>
		<th>&nbsp;</th>
		<c:forEach items= "${products}" var="product">
		<td><img src="img/${product.imageName}" class="productImage"/></td>
		</c:forEach>
		</tr>
		<tr>
    <th></th>
    <c:forEach items="${products}" var="product" >
		<td class="top"><c:out value="${product.topSeller? 'BEST SELLER!' : '' }" /></td>
		</c:forEach>
		</tr>
		<tr class="greyed">
    <th>Name</th>
    <c:forEach items="${products}" var="product" >
		<td><c:out value="${product.name}" /></td>
		</c:forEach>
		</tr>
		<tr>
		<th>Rating</th>
	  <c:forEach items="${products}" var="product" >
		<td><fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
		<img src="img/${formattedRating}-star.png" class ="rating"/>
		</c:forEach>
		</tr>
		<tr class="greyed">
		<th>Mfr</th>
		<c:forEach items="${products}" var="product" >
		<td><c:out value="${product.manufacturer}" /></td>
		</c:forEach>
		</tr>
		<tr>
		<th>Price</th>
		<c:forEach items="${products}" var="product" >
		<td class="price"><Strong>$<c:out value="${product.price}" /></Strong></td>
		</c:forEach>
		</tr>
		<tr class="greyed">
    <th>wt. (in lbs)</th>
    <c:forEach items="${products}" var="product" >
		<td><c:out value="${product.weightInLbs}" /></td>
		</c:forEach>
		</tr>
		
		</table>
       
    </section>
</body>
</html>