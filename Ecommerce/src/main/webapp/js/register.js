 function validateForm1(){  
	
	var custName = $('#customerDescription').val();
	var passwd = $('#customerDescription').val();
	var age = $('#customerDescription').val();
	var email = $('#customerDescription').val();
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;  
	var letters = /^[A-Za-z]+$/;
	  
	var passid_len = passwd.value.length;  
	if (passid_len == 0 ||passid_len >= 7 || passid_len < 12){  
		alert("Password should not be empty / length be between 7 to 12");  
		passid.focus();  
		return false;  
	}else if(!email.match(mailformat)){  
		alert("You have entered an invalid email address!");  
		
		return false;   
	}else if(!custName.value.match(letters)){  
		alert('Username must have alphabet characters only');  
		return false; 
	}
	
}
