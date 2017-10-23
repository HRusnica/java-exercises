<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>Squirrel Party for Dummies</title>
<c:url value="/css/squirrelParty.css" var="cssHref" />
    <link rel="stylesheet" href="${cssHref}">
</head>
<body>
<h1 class="centered">Squirrel Parties for Dummies</h1>
<h3 class="centered">by: Craig Castelaz</h3><br>
<p>Have you ever experienced a truly world-class squirrel party? Have you considered throwing one yourself, but you don't 
know where to start? Well, thankfully, Craig Castelaz's latest book contains the answers we've all been waiting for. Now
you can really wow your furry friends with a "wild" experience that will be sure to be the talk of the forest. Squirrel
Parties for Dummies will be your guide to throwing a party so fabulous it will make your guests nuts!</p>

<p>See what everyone is saying about Squirrel Parties for Dummies:</p>


<section class= "reviews">
<h1 class= "centered">Squirrel Party Review</h1>

<c:url var="squirrelPartyReviewUrl"  value="/squirrelPartyForm"/>
<a class="centered" href="${squirrelPartyReviewUrl }">Add my Review</a><br>

<div id="post-container">
	<c:forEach var="review" items="${allReviews}">
			<div>
			<h3><strong><c:out value="${review.title }"/></strong></h3>
			<fmt:formatNumber maxFractionDigits="0" value="${review.rating}" var="formattedRating"/>
		<img src="img/${formattedRating}-star.png" class ="stars"/>
			by: <c:out value="${review.username }"/> at <c:out value="${review.dateSubmitted}"/>
			<p><c:out value="${review.text }"/></p>
			<hr>
			</div>
	</c:forEach>
</div>
</section>
</body>
<footer>
<p class="centered">Created by: Heather Rusnica 2017</p>
</footer>
</html>