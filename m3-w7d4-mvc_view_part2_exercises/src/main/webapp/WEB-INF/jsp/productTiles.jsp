<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Tiles View</title>
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
		
		<c:forEach items= "${products}" var="product">
		<div class="productTiles">
		<img src="img/${product.imageName}" class="productImage"/>
		<h1 class="name"><c:out value="${product.name}"/><span class="top"> <c:out value="${product.topSeller? 'BEST SELLER!' : '' }" /></span></h1>
		<h5 class="manufacturer">by <c:out value="${product.manufacturer}"/></h5>
		<h1 class="tilePrice"><Strong>$<c:out value="${product.price}" /></Strong></h1>
		<h5 class="weight"><Strong>Weight</Strong><c:out value="${product.weightInLbs}" /></h5>
		<fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
		<img src="img/${formattedRating}-star.png" class ="rating"/>
		</div>
		</c:forEach>

    </section>
</body>
</html>