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
<script type="text/javascript">
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
.btn {
  background: #3498db;
  background-image: -webkit-linear-gradient(top, #3498db, #2980b9);
  background-image: -moz-linear-gradient(top, #3498db, #2980b9);
  background-image: -ms-linear-gradient(top, #3498db, #2980b9);
  background-image: -o-linear-gradient(top, #3498db, #2980b9);
  background-image: linear-gradient(to bottom, #3498db, #2980b9);
  -webkit-border-radius: 37;
  -moz-border-radius: 37;
  border-radius: 37px;
  font-family: Arial;
  color: #f5edf5;
  font-size: 20px;
  padding: 8px 14px 10px 20px;
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
.CSSTableGenerator {
	margin:0px;padding:0px;
	width:99%;
	box-shadow: 10px 10px 5px #888888;
	border:1px solid #000000;
	
	-moz-border-radius-bottomleft:0px;
	-webkit-border-bottom-left-radius:0px;
	border-bottom-left-radius:0px;
	
	-moz-border-radius-bottomright:0px;
	-webkit-border-bottom-right-radius:0px;
	border-bottom-right-radius:0px;
	
	-moz-border-radius-topright:0px;
	-webkit-border-top-right-radius:0px;
	border-top-right-radius:0px;
	
	-moz-border-radius-topleft:0px;
	-webkit-border-top-left-radius:0px;
	border-top-left-radius:0px;
}.CSSTableGenerator table{
    border-collapse: collapse;
        border-spacing: 0;
	width:100%;
	height:100%;
	margin:0px;padding:0px;
}.CSSTableGenerator tr:last-child td:last-child {
	-moz-border-radius-bottomright:0px;
	-webkit-border-bottom-right-radius:0px;
	border-bottom-right-radius:0px;
}
.CSSTableGenerator table tr:first-child td:first-child {
	-moz-border-radius-topleft:0px;
	-webkit-border-top-left-radius:0px;
	border-top-left-radius:0px;
}
.CSSTableGenerator table tr:first-child td:last-child {
	-moz-border-radius-topright:0px;
	-webkit-border-top-right-radius:0px;
	border-top-right-radius:0px;
}.CSSTableGenerator tr:last-child td:first-child{
	-moz-border-radius-bottomleft:0px;
	-webkit-border-bottom-left-radius:0px;
	border-bottom-left-radius:0px;
}.CSSTableGenerator tr:hover td{
	
}
.CSSTableGenerator tr:nth-child(odd){ background-color:#e5e5e5; }
.CSSTableGenerator tr:nth-child(even)    { background-color:#ffffff; }.CSSTableGenerator td{
	vertical-align:middle;
	
	
	border:1px solid #000000;
	border-width:0px 1px 1px 0px;
	text-align:left;
	padding:7px;
	font-size:10px;
	font-family:Arial;
	font-weight:normal;
	color:#000000;
}.CSSTableGenerator tr:last-child td{
	border-width:0px 1px 0px 0px;
}.CSSTableGenerator tr td:last-child{
	border-width:0px 0px 1px 0px;
}.CSSTableGenerator tr:last-child td:last-child{
	border-width:0px 0px 0px 0px;
}
.CSSTableGenerator tr:first-child td{
		background:-o-linear-gradient(bottom, #cccccc 5%, #b2b2b2 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #cccccc), color-stop(1, #b2b2b2) );
	background:-moz-linear-gradient( center top, #cccccc 5%, #b2b2b2 100% );
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#cccccc", endColorstr="#b2b2b2");	background: -o-linear-gradient(top,#cccccc,b2b2b2);

	background-color:#cccccc;
	border:0px solid #000000;
	text-align:center;
	border-width:0px 0px 1px 1px;
	font-size:14px;
	font-family:Arial;
	font-weight:bold;
	color:#000000;
}
.CSSTableGenerator tr:first-child:hover td{
	background:-o-linear-gradient(bottom, #cccccc 5%, #b2b2b2 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #cccccc), color-stop(1, #b2b2b2) );
	background:-moz-linear-gradient( center top, #cccccc 5%, #b2b2b2 100% );
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#cccccc", endColorstr="#b2b2b2");	background: -o-linear-gradient(top,#cccccc,b2b2b2);

	background-color:#cccccc;
}
.CSSTableGenerator tr:first-child td:first-child{
	border-width:0px 0px 1px 0px;
}
.CSSTableGenerator tr:first-child td:last-child{
	border-width:0px 0px 1px 1px;
}
</style>
<body bgcolor="#E6E6FA">
	<header>
		<h1></h1>
	</header>
	<nav>
		<!-- Navigation -->
	</nav>
	<c:url value="/j_spring_security_logout" var="logoutUrl" />
	<form action="${logoutUrl}" method="post" id="logoutForm">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
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
							<h2>Hello, Welcome to Ecommerce POC</h2>
							<div id="mydata">
								<b>Current Users data in the system ...</b>
								<div class="CSSTableGenerator">
									<table>
										<tr>
											<td>User Id</td>
											<td>Role</td>
											<td> </td>
											<td></td>
										</tr>

										<c:forEach var="registrationBean" items="${usersList}"
											varStatus="myIndex">
											<tr>
												<td><b>${registrationBean.customerName}</b></td>
												<td><b>${registrationBean.roleuser}</b></td>
												<td><input type="button" class="btn"
													onclick="enableUser(${myIndex.index})" value="Enable">&nbsp;
													<input type="button" class="btn"
													onclick="disableUser(${myIndex.index})" value="Disable">
												</td>


											</tr>
										</c:forEach>
									</table>
								</div>

								<div id="hiddenProdTab">
							<CENTER>

								<BR>
								<div id="cartMsg"></div>
								<div id="showTab"></div>

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