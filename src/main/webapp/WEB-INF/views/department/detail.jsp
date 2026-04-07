<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>    
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
                    <h1 class="h3 mb-4 text-gray-800">Detail Page</h1>
                    <div>
                    	<h3>${d.departmentName}</h3>
                    	<h3>${d.category}</h3>
                    	<h3>${d.capacity}</h3>
                    </div>
                    
                    <div>
                    	<a class="btn btn-outline-primary" href="./update?departmentNo=${d.departmentNo}">학과수정</a>
                    	<form action="./delete" method="post">
                    		<input type="hidden" name="departmentNo" value="${d.departmentNo}">
                    		<button class="btn btn-outline-danger" type="submit">DELETE</button>
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