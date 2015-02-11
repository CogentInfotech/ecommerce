<%@page contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
 <script src="${pageContext.request.contextPath}/js/register.js"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ecommerce Register</title>
</head>
 
<body bgcolor="#E6E6FA">
<form name='registration' onSubmit="return formValidation();">  
<ul>  
<li><label for="userid">User id:</label></li>  
<li><input type="text" name="userid" size="12" /></li>  
<li><label for="passid">Password:</label></li>  
<li><input type="password" name="passid" size="12" /></li>  
<li><label for="username">Name:</label></li>  
<li><input type="text" name="username" size="50" /></li>  
<li><label for="address">Address:</label></li>  
<li><input type="text" name="address" size="50" /></li>  
<li><label for="country">Country:</label></li>  
<li><select name="country">  
<option selected="" value="Default">(Please select a country)</option>  
<option value="AF">Australia</option>  
<option value="AL">Canada</option>  
<option value="DZ">India</option>  
<option value="AS">Russia</option>  
<option value="AD">USA</option>  
</select></li>  
<li><label for="zip">ZIP Code:</label></li>  
<li><input type="text" name="zip" /></li>  
<li><label for="email">Email:</label></li>  
<li><input type="text" name="email" size="50" /></li>  
<li><label id="gender">Sex:</label></li>  
<li><input type="radio" name="sex" value="Male" /><span>Male</span></li>  
<li><input type="radio" name="sex" value="Female" /><span>Female</span></li>  
<li><label>Language:</label></li>  
<li><input type="checkbox" name="en" value="en" checked /><span>English</span></li>  
<li><input type="checkbox" name="nonen" value="noen" /><span>Non English</span></li>  
<li><label for="desc">About:</label></li>  
<li><textarea name="desc" id="desc"></textarea></li>  
<li><input type="submit" name="submit" value="Submit" /></li>  
</ul>  
</form>  
</body>
</html>