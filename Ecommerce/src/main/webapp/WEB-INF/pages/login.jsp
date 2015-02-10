<%@page contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>

<link type="text/css" rel="stylesheet" href="<c:url value="/css/structure.css"/>" />
<link type="text/css" rel="stylesheet" href="<c:url value="/css/reset.css"/>" /> 
 

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>


<html>
<head>
<title>Welcome to Ecommerce Portal</title>

</head>

<body bgcolor="#E6E6FA" onload='document.loginForm.username.focus();'>

	 

	<div id="login-box">

		 

		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>

		<form name='loginForm' class="box login"
			action="<c:url value='/j_spring_security_check' />" method='POST'>

			<fieldset class="boxBody">

				<label>Username</label> <input type="text" name='username'
					tabindex="1" placeholder="Avoid Special Characters" required>
				<label>Password</label> <input type="password" name='password'
					tabindex="2" required> <label> <a href="#"
					class="rLink" tabindex="5">Forget your password?</a>
				</label> <label><a href="#" class="rLink" tabindex="2">Register</a>
				</label>

			</fieldset>
			<footer>
				<label><input type="checkbox" tabindex="3">Keep me
					logged in</label> <input type="submit" class="btnLogin" value="Login"
					tabindex="4" name="submit"> <input type="hidden"
					name="${_csrf.parameterName}" value="${_csrf.token}" />
			</footer>
		</form>
	</div>

</body>
</html>