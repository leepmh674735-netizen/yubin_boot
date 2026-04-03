<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/temp/head_css.jsp"></c:import>
</head>
<body id="page-top">
	<div id="wrapper">
		<c:import url="/WEB-INF/views/temp/sidebar.jsp"></c:import>
		<div id="content-wrapper" class="d-flex flex-column">
			<div id="content">
				<c:import url="/WEB-INF/views/temp/topbar.jsp"></c:import>

				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Page Heading -->
					<h1 class="h3 mb-4 text-gray-800">Join Page</h1>

					<div class="col-lg-5 col-sm-12">
						<form action="./join" method="post">
							<div class="form-group">
								<label for="name">Name</label> 
								<input type="text" name="name" class="form-control" id="name"> 
							</div>
							<div class="form-group">
								<label for="age">Age</label> 
								<input type="text" class="form-control" name="age" id="age"> 
							</div>							
							<div class="form-group">
								<label for="birth">Birth</label> 
								<input type="date" class="form-control" name="birth" id="birth">
							</div>


							<button type="submit" class="btn btn-primary">Submit</button>
						</form>

					</div>

				</div>
				<!-- End Page container-fluid -->

			</div>
			<!-- End page Content -->
			<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
		</div>
		<!-- End Content wrapper -->
	</div>
	<!-- End Wrapper -->

	<c:import url="/WEB-INF/views/temp/footer_script.jsp"></c:import>

</body>
</html>