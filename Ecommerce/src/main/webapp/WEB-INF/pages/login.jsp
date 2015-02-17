<%@page contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" 
    prefix="fn" %>
<%@page session="true"%>

<c:set var="req" value="${pageContext.request}" />
<c:set var="baseURL" value="${fn:replace(req.requestURL, fn:substring(req.requestURI, 1, fn:length(req.requestURI)+1), req.contextPath)}" />

<link type="text/css" rel="stylesheet"
	href="<c:url value="/css/structure.css"/>" />
<link type="text/css" rel="stylesheet"
	href="<c:url value="/css/reset.css"/>" />
<link type="text/css" rel="stylesheet"
	href="<c:url value="/css/register.css"/>" />

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/login.js"></script>
<script src="${pageContext.request.contextPath}/js/register.js"></script>



<html>
<head>
<title>Welcome to Ecommerce Portal</title>

</head>
  <script type="text/javascript">
  $(function(){
	  
	  $("body").bind("ajaxSend", function(elm, xhr, s){
		   if (s.type == "POST") {
		      xhr.setRequestHeader('X-CSRF-Token', getCSRFTokenValue());
		   }
		});
	  
  $( "#register" ).on( "click", function(e) {
	   
		
		  var postData = $(this).serializeArray();
		    var formURL = $(this).attr("action");
		    
		    
		   $.ajax(
		    {
		        url :"/Ecommerce/register",
		        type: "GET",
		        beforeSend: function ( xhr ) {
		            xhr.setRequestHeader( 'X-CSRF-Token', $('#csrfToken').val() );
		          },
		        data : $('#loginFormCsrf').serialize(),
		        success:function(data, textStatus, jqXHR) 
		        {
		        	
		        	$('#login-box').hide();
		        	 
		        	 $('#hiddenRegister').html(data);
		        	
		        	 
		        },
		        error: function(jqXHR, textStatus, errorThrown) 
		        {
		            //if fails      
		        }
		    }); 
		    
		   
	});
  });
</script>
<!-- background="${fn:replace(pageContext.request.requestURL, pageContext.request.requestURI, '')}"/Ecommerce/img/cogentLogo.png" -->
<body> 

	<div id="hiddenRegister"></div> 

	<div id="login-box">

		 

		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>

		<form name='loginForm' class="box login" id=loginFormCsrf"
			action="<c:url value='/j_spring_security_check' />" method='POST'>

			<fieldset class="boxBody" padding-right: 35px;>
			<label> <c:out value="${model.success}"/></label>
				<label>Username</label> 
					<input type="text" name='username' tabindex="1" placeholder="Avoid Special Characters" required>
				<label>Password</label> 
					<input type="password" name='password' tabindex="2" required> <label>
				 </label> 
				<label>
				<a href="#" data-ajax="false" class="rLink" id ="register" tabindex="3" style="float: left">Register</a>
   
				
				</label>
               <label>
               		 
               		 <input type="submit" class="btnLogin" value="Login" tabindex="4" name="submit" style="float: left">
                 	<input type="hidden" name="${_csrf.parameterName}" id = "csrfToken" value="${_csrf.token}" />
			</fieldset>		
			 
		</form>
	</div>

</body>
</html>