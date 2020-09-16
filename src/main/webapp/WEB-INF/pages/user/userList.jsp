<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../include/header.jsp" />

<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/r/bs-3.3.5/jq-2.1.4,dt-1.10.8/datatables.min.css" />
<script type="text/javascript"
	src="https://cdn.datatables.net/r/bs-3.3.5/jqc-1.11.3,dt-1.10.8/datatables.min.js"></script>

<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
		$('#userId').DataTable();
	});
</script>

<body>

	<!-- /page header -->

	<!-- Page container -->
	<div class="page-container">

		<!-- Page content -->
		<div class="page-content">

			<!-- Main content -->
			<div class="content-wrapper">

				<!-- Simple panel -->
				<div class="panel panel-flat  col-lg-15">
					<div class="panel-heading"></div>

					<div class="panel-body">
						<table id="userId"
							class="table table-striped table-bordered sp-a-20">
							<thead>
								<tr>
									<th>User Name</th>
									<th>Zone</th>
									<th>District</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${userList}" var="userList">
									<tr>
										<td>${userList.userName}</td>
										<td>${userList.zone.zoneName}</td>
										<td>${userList.district.districtName}</td>
										<td><a
											href="editStudent?studentId=${studentList.studentId}"
											title="Edit" onclick="return confirm('Do you want to edit?')"
											class="label label-info"><span
												class="glyphicon glyphicon-edit"></span> Edit</a> <a
											href="deleteStudent?studentId=${studentList.studentId}"
											title="Delete"
											onclick="return confirm('Do you want to delete?')"
											class="label label-danger"><span
												class="glyphicon glyphicon-trash"></span>Delete</a></td>

									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<!-- /simple panel -->


			</div>
			<!-- /main content -->

		</div>
		<!-- /page content -->

	</div>
	<!-- /page container -->
</body>
</html>