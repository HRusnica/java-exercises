<%@ include file ="common/header.jspf" %>

    <section id="main-content">
		<section id="detailContainer">
			<div id="detailImageDiv">
			<img src="img/${product.imageName}" class="productImage" id="detailImage"/>
			</div>
			
			<div id="productDetail">
			<h1 class="name" id="detailName"><c:out value="${product.name}"/><span class="top"> <c:out value="${product.topSeller? 'BEST SELLER!' : '' }" /></span></h1>
			<p class="manufacturer" id="detailManufacturer">by <c:out value="${product.manufacturer}"/></p>
			<fmt:formatNumber maxFractionDigits="0" value="${product.averageRating}" var="formattedRating"/>
			<img src="img/${formattedRating}-star.png" class ="rating" id="detailRating"/>
			<p class="price" id="detailPrice"><Strong>$<c:out value="${product.price}" /></Strong></p>
			<p class="weight" id="detailWeight"><Strong>Weight </Strong><c:out value="${product.weightInLbs}" /> lbs</p>
			<p id="description"><strong>Description: </strong> <c:out value="${product.description }" /></p>
			</div>
		</section>

    </section>
</body>
</html>