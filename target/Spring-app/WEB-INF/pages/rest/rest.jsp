<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../include/header.jsp" />
<h3>Rest Call Example</h3>
<button onClick = "showUserJsonData()">Show All Users</button>
<p id = "userJSON"></p>
<script type = "text/javascript">
function showUserJsonData(){
$.ajax({
	type : "GET",
	contentType : "application/json",
	url : "api/rest/users"
}).then(function(data){
	$('#userJSON').html(JSON.Stringify(data));
});	
}
</script>