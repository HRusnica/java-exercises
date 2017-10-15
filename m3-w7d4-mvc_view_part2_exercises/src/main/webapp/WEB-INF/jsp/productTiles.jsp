<%@ include file ="common/header.jspf" %>

    <section id="main-content">
    	
 <h1>Toy Department</h1>
		
		<c:forEach items= "${products}" var="product">
		<div id="productTiles">
		<a href="productDetail?productId=${product.productId }"><img src="img/${product.imageName}" class="productImage" id="tileProductImage"/></a>
		<h1 class="name" id="tileName"><c:out value="${product.name}"/><span class="top"> <c:out value="${product.topSeller? 'BEST SELLER!' : '' }" /></span></h1>
		<ul id="tileList">
		<li class="manufacturer" id="tileManufacturer">by <c:out value="${product.manufacturer}"/></li>
		<li class="price" id="tilePrice"><Strong>$<c:out value="${product.price}" /></Strong></li>
		<li class="weight" id="tileWeight"><Strong>Weight </Strong><c:out value="${product.weightInLbs}" /></li>
		</ul>
		<fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
		<img src="img/${formattedRating}-star.png" class ="rating"/>
		</div>
		</c:forEach>

    </section>
</body>
</html>