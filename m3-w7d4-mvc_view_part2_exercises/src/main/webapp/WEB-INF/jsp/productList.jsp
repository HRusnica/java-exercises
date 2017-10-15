<%@ include file ="common/header.jspf" %>

    <section id="main-content">
	<c:forEach items= "${products}" var="product">
		<div class="productList">
		<a href="productDetail?productId=${product.productId }"><img src="img/${product.imageName}" class="productImage" id="listImage"/></a>
		<h1 class="name" id="listName"><c:out value="${product.name}"/><span class="top"> <c:out value="${product.topSeller? 'BEST SELLER!' : '' }" /></span></h1>
		<p class="manufacturer" id="listManufacturer">by <c:out value="${product.manufacturer}"/></p>
		<p class="price" id="listPrice"><Strong>$<c:out value="${product.price}" /></Strong></p>
		<p class="weight" id="listWeight"><Strong>Weight </Strong><c:out value="${product.weightInLbs}" /></p>
		<fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
		<img src="img/${formattedRating}-star.png" class ="rating" id="listRating"/>
		</div>
		<hr>
		</c:forEach>

    </section>
</body>
</html>