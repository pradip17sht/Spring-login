<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../include/header.jsp" />
<body>
<h3>Add Zone</h3>

	<form:form class="form-horizontal" method="POST" action="addZone"
		modelAttribute="zone">

		<form:hidden path="zoneId" />

		<div class="form-group">
			<label class="col-md-3 control-label">Zone:<span
				style="color: red;">*</span></label>
			<div class="col-md-3">
				<form:input path="ZoneName" class="form-control"
					placeholder="Enter Zone Name" />
				<form:errors path="zoneName" cssStyle="color:red;" element="span" />
			</div>
		</div>

		<div class="form-actions">
			<div class="row">
				<div class="col-md-offset-3 col-md-9">
					<button type="submit" class="btn btn-primary">Add</button>
				</div>
			</div>
		</div>

	</form:form>

</body>
</html>