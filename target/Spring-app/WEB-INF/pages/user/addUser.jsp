<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../include/header.jsp" />
<body>

	<h3>Add User</h3>

	<form:form class="form-horizontal" method="POST" action="addUser"
		modelAttribute="user">

		<form:hidden path="userId" />

		<div class="form-group">
			<label class="col-md-3 control-label">User Name:<span
				style="color: red;">*</span></label>
			<div class="col-md-3">
				<form:input path="userName" class="form-control"
					placeholder="Enter Name" />
				<form:errors path="userName" cssStyle="color:red;" element="span" />
			</div>
		</div>

		<div class="form-group">
			<label class="col-md-3 control-label">District:<span
				style="color: red;">*</span></label>
			<div class="col-md-3">
				<select id="districtId" name="district.districtId" class="form-control">
					<option value="">--- Select District ---</option>
					<c:forEach items="${district}" var="district">

						<c:if test="${user.district.districtId == district.districtId}">
							<option label="${district.districtName}" value="${district.districtId}"
								selected="selected" />
						</c:if>

						<c:if test="${not (user.district.districtId == district.districtId)}">
							<option label="${district.districtName}" value="${district.districtId}" />
						</c:if>

					</c:forEach>
				</select>
			</div>
			<form:errors path="district" cssStyle="color:red;" element="span" />
		</div>

		<div class="form-group">
			<label class="col-md-3 control-label">Zone:<span
				style="color: red;">*</span></label>
			<div class="col-md-3">
				<select id="zoneId" name="zone.zoneId" class="form-control">
					<option value="">--- Select Zone ---</option>
					<c:forEach items="${zone}" var="zone">

						<c:if test="${user.zone.zoneId == zone.zoneId}">
							<option label="${zone.zoneName}" value="${zone.zoneId}"
								selected="selected" />
						</c:if>

						<c:if test="${not (user.zone.zoneId == zone.zoneId)}">
							<option label="${zone.zoneName}" value="${zone.zoneId}" />
						</c:if>

					</c:forEach>
				</select>
			</div>
			<form:errors path="zone" cssStyle="color:red;" element="span" />
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

<jsp:include page="../include/footer.jsp" />

</html>