<%@page contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page session="true"%>
<c:set var="req" value="${pageContext.request}" />

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

<html>
<head>
<title>Page title</title>
</head>
</head>
<c:url value="/j_spring_security_logout" var="logoutUrl" />
<form action="${logoutUrl}" method="post" id="logoutForm">
	<input type="hidden" name="${_csrf.parameterName}"
		value="${_csrf.token}" />
</form>
<script>
	function formSubmit() {
		document.getElementById("logoutForm").submit();
	}
</script>
<script type="text/javascript">
	$(function() {
		
		 $("#showTab").on('click', '.btn', function(e) {
		 alert('hi');
		 
			
	      var prodId = $(this).prev('input[id="hiddenProd"]').val(); 
					$.ajax({
						url : "/Ecommerce/rest/removeFormCart/" + prodId,
						type : "GET",
						beforeSend : function(xhr) {
							xhr.setRequestHeader('X-CSRF-Token',
									$('#csrfToken').val());
						},
						success : function(data1) {
							$('#cartMsg').text("");
							$('#cartMsg').append(
									'<B>Successfully Removed from cart.</B>');
							$( this).parent().remove();

						},
						error : function(jqXHR, textStatus, errorThrown) {
							alert('Error');
						}
					});

				});
	});
</script>

<style>
{
margin








:




 




0;
padding








:




 




0;
}

/* Tell the browser to render HTML 5 elements as block */
header, footer, aside, nav, article {
	display: block;
}

body {
	margin: 0 auto;
	width: 940px;
	font: 13px/22px Helvetica, Arial, sans-serif;
	background: #f0f0f0;
}

h2 {
	font-size: 28px;
	line-height: 44px;
	padding: 22px 0;
}

h3 {
	font-size: 18px;
	line-height: 22px;
	padding: 11px 0;
}

p {
	padding-bottom: 22px;
}

nav {
	position: absolute;
	left: 0;
	width: 100%;
	background: url("nav_background");
}

nav ul {
	margin: 0 auto;
	width: 940px;
	list-style: none;
}

nav ul li {
	float: left;
}

nav ul li a {
	display: block;
	margin-right: 20px;
	width: 140px;
	font-size: 14px;
	line-height: 44px;
	text-align: center;
	text-decoration: none;
	color: #FFECEC;
}

nav ul li a:hover {
	color: #fff;
}

nav ul li.selected a {
	color: #fff;
}

nav ul li.subscribe a {
	margin-left: 22px;
	padding-left: 33px;
	text-align: left;
	background: url("rss.png") left center no-repeat;
}

#intro {
	margin-top: 66px;
	padding: 44px;
	background: #467612 url("intro_background.png") repeat-x;
	background-size: 100%;
	border-radius: 22px;
}

#intro h2, #intro p¬† {
	width: 336px;
}

#intro h2 {
	padding: 0 0 22px 0;
	font-weight: normal color: #fff;
}

#intro p {
	padding: 0;
	color: #d9f499;
}

#content {
	display: table;
}

#mainContent {
	display: table-cell;
	width: 620px;
	padding-right: 22px;
}

aside {
	display: table-cell;
	width: 300px;
}

.showSearchBox {
	display: none;
}

#hiddenProdTab {
	display: none;
}

.CSSTableGenerator {
	margin: 0px;
	padding: 0px;
	width: 80%;
	box-shadow: 5px 5px 5px 0px #CCCCCC;
	border: 1px solid #000000;
	-moz-border-radius-bottomleft: 0px;
	-webkit-border-bottom-left-radius: 0px;
	border-bottom-left-radius: 0px;
	-moz-border-radius-bottomright: 0px;
	-webkit-border-bottom-right-radius: 0px;
	border-bottom-right-radius: 0px;
	-moz-border-radius-topright: 0px;
	-webkit-border-top-right-radius: 0px;
	border-top-right-radius: 0px;
	-moz-border-radius-topleft: 0px;
	-webkit-border-top-left-radius: 0px;
	border-top-left-radius: 0px;
}

.CSSTableGenerator table {
	width: 100%;
	height: 16%;
	margin: 0px;
	padding: 1px;
}

.CSSTableGenerator tr:last-child td:last-child {
	-moz-border-radius-bottomright: 0px;
	-webkit-border-bottom-right-radius: 0px;
	border-bottom-right-radius: 0px;
}

.CSSTableGenerator table tr:first-child td:first-child {
	-moz-border-radius-topleft: 0px;
	-webkit-border-top-left-radius: 0px;
	border-top-left-radius: 0px;
}

.CSSTableGenerator table tr:first-child td:last-child {
	-moz-border-radius-topright: 0px;
	-webkit-border-top-right-radius: 0px;
	border-top-right-radius: 0px;
}

.CSSTableGenerator tr:last-child td:first-child {
	-moz-border-radius-bottomleft: 0px;
	-webkit-border-bottom-left-radius: 0px;
	border-bottom-left-radius: 0px;
}

.CSSTableGenerator tr:hover td {
	background-color: #A3A3A3;
}

.CSSTableGenerator td {
	vertical-align: middle;
	background: -o-linear-gradient(bottom, #00A8EB 5%, #A3A3A3 100%);
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0.05, #00A8EB
		), color-stop(1, #A3A3A3));
	background: -moz-linear-gradient(center top, #00A8EB 5%, #A3A3A3 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#00A8EB",
		endColorstr="#A3A3A3");
	background: -o-linear-gradient(top, #00A8EB, #A3A3A3);
	background-color: #00A8EB;
	border: 1px solid #000000;
	border-width: 0px 1px 1px 0px;
	text-align: left;
	padding: 7px;
	font-size: 15px;
	font-family: Arial;
	font-weight: normal;
	color: #FFFFFF;
}

.CSSTableGenerator tr:last-child td {
	border-width: 0px 1px 0px 0px;
}

.CSSTableGenerator tr td:last-child {
	border-width: 0px 0px 1px 0px;
}

.CSSTableGenerator tr:last-child td:last-child {
	border-width: 0px 0px 0px 0px;
}

.CSSTableGenerator tr:first-child td {
	background: -o-linear-gradient(bottom, #72A16D 5%, #16BD00 100%);
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0.05, #72A16D
		), color-stop(1, #16BD00));
	background: -moz-linear-gradient(center top, #72A16D 5%, #16BD00 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#72A16D",
		endColorstr="#16BD00");
	background: -o-linear-gradient(top, #72A16D, #16BD00);
	background-color: #72A16D;
	border: 0px solid #000000;
	text-align: center;
	border-width: 0px 0px 1px 1px;
	font-size: 16px;
	font-family: Arial;
	font-weight: bold;
	color: #FFFFFF;
}

.CSSTableGenerator tr:first-child:hover td {
	background: -o-linear-gradient(bottom, #72A16D 5%, #16BD00 100%);
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0.05, #72A16D
		), color-stop(1, #16BD00));
	background: -moz-linear-gradient(center top, #72A16D 5%, #16BD00 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#72A16D",
		endColorstr="#16BD00");
	background: -o-linear-gradient(top, #72A16D, #16BD00);
	background-color: #72A16D;
}

.CSSTableGenerator tr:first-child td:first-child {
	border-width: 0px 0px 1px 0px;
}

.CSSTableGenerator tr:first-child td:last-child {
	border-width: 0px 0px 1px 1px;
}

.btn {
	background: #41dbdb;
	background-image: -webkit-linear-gradient(top, #41dbdb, #2980b9);
	background-image: -moz-linear-gradient(top, #41dbdb, #2980b9);
	background-image: -ms-linear-gradient(top, #41dbdb, #2980b9);
	background-image: -o-linear-gradient(top, #41dbdb, #2980b9);
	background-image: linear-gradient(to bottom, #41dbdb, #2980b9);
	-webkit-border-radius: 31;
	-moz-border-radius: 31;
	border-radius: 31px;
	text-shadow: 1px 1px 3px #3cf0ab;
	font-family: Arial;
	color: #f0dff0;
	font-size: 20px;
	padding: 6px 13px 6px 13px;
	text-decoration: none;
}

.btn:hover {
	background: #3cb0fd;
	background-image: -webkit-linear-gradient(top, #3cb0fd, #3498db);
	background-image: -moz-linear-gradient(top, #3cb0fd, #3498db);
	background-image: -ms-linear-gradient(top, #3cb0fd, #3498db);
	background-image: -o-linear-gradient(top, #3cb0fd, #3498db);
	background-image: linear-gradient(to bottom, #3cb0fd, #3498db);
	text-decoration: none;
}
</style>


<body bgcolor="#E6E6FA">
	<header>
		<h1></h1>
	</header>
	<nav>
		<!-- Navigation -->
	</nav>

	<section id="intro">

		<nav>
			<ul>
				<li><a href="#" data-ajax="false" id="search" tabindex="3"
					style="float: left">Search</a></li>
				<li><a href="#">Cart</a></li>
				<li><a href="#">Checkout</a></li>
				<li><a href="#">Receipt</a></li>
				<li><a href="javascript:formSubmit()" id="logout">Logout</a></li>
			</ul>
		</nav>
	</section>
	<section id="main">
		<section>
			<article class="blogPost">
				<div id="flowMain">
					<header>
						<div class="showWelcome">
							<h2>Shopping Cart</h2>
							<c:set var="req" value="${pageContext.request}" />
							<c:set var="baseURL"
								value="${fn:replace(req.requestURL, fn:substring(req.requestURI, 1, fn:length(req.requestURI)), req.contextPath)}" />
							.
							<CENTER>

								<BR>
								<div id="cartMsg"></div>
								<div id="showTab">



									<div class="CSSTableGenerator">
										<table cellspacing="1">
											<tr>
												<td>Products</td>
												<td>Price</td>
												<td></td>
											</tr>
											<c:forEach var="productBean" items="${cartProducts}"
												varStatus="myIndex">
												<tr id="${productBean.productId}">
													<td><b>${productBean.productId}</b> </td>
													<td>&nbsp;&pound;<b> ${productBean.productPrice}</b></td>
													<td>
													<input type="hidden" name="hiddenProd" id="hiddenProd"
														value="${productBean.productId}">
													<input type="button" class="btn" value="remove"></td>
												</tr>

											</c:forEach>
											<tr>
												<td>Cart Total</td>
												<td><b>&pound;${cartTotal}</b></td>
												<td></td>
											</tr>
										</table>
									</div>

								</div>
							</CENTER>
						</div>
				</div>
			</article>
		</section>
	</section>
	<aside>
		<!-- Sidebar -->
	</aside>
	<footer>
		<!-- Footer -->
	</footer>

	</div>
</body>
</html>