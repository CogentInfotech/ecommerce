<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
 <link rel="stylesheet" href="${pageContext.request.contextPath}/css/structure.css" />
 <link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css" />
 
 <script src="${pageContext.request.contextPath}/js/login.js"></script>
<html>
<body bgcolor="#E6E6FA">
	<h1> ${title}</h1>
	<h1> ${message}</h1>

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

	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h2>
			Welcome : ${pageContext.request.userPrincipal.name} | <a
				href="javascript:formSubmit()"> Logout</a>
		</h2>
	</c:if>

</body>
</html>