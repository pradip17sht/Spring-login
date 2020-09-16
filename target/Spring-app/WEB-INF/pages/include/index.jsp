<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../include/header.jsp" />
<title>Welcome to Spring app</title>

<script type = "text/javascript">
$(document).ready(function(){
$.ajax({
	type : "GET",
	contentType : "application/json",
	url : "http://api.fixer.io/latest?base=USD"
}).then(function(result){
	$('#currency').html("");
	$.each(result.rates, function(key, value){
		$('#currency').append('<label>' +key + ' : ' + value+ '</label><br/>');
	})
});
});
</script>
<body class="container">
	<br />
	<div class="centered">
		<div class="jumbotron">
			<h1 class="text-center">Spring + Hibernate + JPA Project</h1>
		</div>
	</div>

	<div class="container">
		<div class="form-group nav-item">

			<ul class="nav nav-tabs">
				<li class="menu"><a data-toggle="tab"
					href="<%=request.getContextPath()%>/addDistrict">AddDistrict</a></li>
				<li class="menu"><a data-toggle="tab"
					href="<%=request.getContextPath()%>/addZone">AddZone</a></li>
				<li class="menu"><a data-toggle="tab"
					href="<%=request.getContextPath()%>/addUser">AddUser</a></li>
				<li class="menu"><a data-toggle="tab"
					href="<%=request.getContextPath()%>/rest">Rest</a></li>
			</ul>
		</div>
	</div>
	
</body>
</html>