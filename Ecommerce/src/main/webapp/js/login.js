 $(function () { 
 	

$("#login").click(function(){
var email = $("#email").val();
alert('Hi');
var password = $("#password").val();
// Checking for blank fields.
if( email =='' || password ==''){
$('input[type="text"],input[type="password"]').css("border","2px solid red");
$('input[type="text"],input[type="password"]').css("box-shadow","0 0 3px red");
alert("Please fill all fields...!!!!!!");
}else {
	$.ajax({
        type: "GET",
        url: "/login",
        dataType: "json",
        success: function(responseJson) {
            alert("json"+responseJson);
        },
        error: function(xhr, status, error) {
            alert('Failed to get details: ' + error);
        }
    });
}
});
 
 });