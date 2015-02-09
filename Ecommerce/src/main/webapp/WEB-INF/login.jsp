<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="ecommerce.*"%>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
 <script type="text/javascript" src="${pageContext.request.contextPath}/js/login.js"></script>
 <link rel="stylesheet" href="${pageContext.request.contextPath}/css/structure.css" />
 <link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css" />
  

 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <title>Spring JPA Ecommerce App</title>
    </head>
 
    <body>
    <form class="box login">
	<fieldset class="boxBody">
	  <label>Username</label>
	  <input type="text" tabindex="1" placeholder="Avoid Special Characters" required>
	    <label>Password</label>
	    <input type="password" tabindex="2" required>
	    <label> <a href="#" class="rLink" tabindex="5">Forget your password?</a> </label>
	   <label><a href="#" class="rLink" tabindex="2">Register</a> </label>
	  
	</fieldset>
	<footer>
	  <label><input type="checkbox" tabindex="3">Keep me logged in</label>
	  <input type="submit" class="btnLogin" value="Login" tabindex="4">
	</footer>
</form>
        
     </body>
 </html>
  
  
  

