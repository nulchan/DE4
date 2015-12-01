


<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">
		<title>(주)프람트솔루션 4조</title>
	<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/css/shop-homepage.css" rel="stylesheet">
</head>
<body>
	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span> <span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><b>Prompt Solution 4조</b></a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="./${result}">마이페이지</a></li>
					<li>${result}</li>
					
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>
	<!-- Page Content -->
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<p class="lead">Prompt Solution</p>
				<div class="list-group">
					<a href="custom.jsp" class="list-group-item">평가조회</a>
					<a href="friend.jsp"	class="list-group-item">직원조회</a>
					<a href="pm.jsp"	class="list-group-item">프로젝트조회</a>
				</div>
			</div>
			<div class="col-md-9">

    <script>
    function del(){
      if (confirm("삭제하시겠습니까?")) document.form.submit();
    }
    </script>

    <form id="form" name="form" method="post" action="./deleteemployee.do">
      <input type="hidden" id="emp_no" name="emp_no" value="${object.emp_no}" />
    </form>
    <p>${object.emp_name}</p>
	<table border=1> 
	    <thead>
	    <tr>
	      <th scope="col">직원번호</th>
	      <th scope="col">부서</th>
	      <th scope="col">ID</th>
	      <th scope="col">이름</th>
	      <th scope="col">주민등록번호</th>
	      <th scope="col">비밀번호</th>
	      <th scope="col">주소</th>
	      <th scope="col">직원구분</th>
	      <th scope="col">최종학력</th>
	      <th scope="col">경력</th>
	      <th scope="col">기술</th>
	      <th scope="col">직급</th>
	    </tr>
		</thead>

    <tbody>
	    <!-- 목록이 반복될 영역 -->
	    <tr>
	      <td>${object.emp_no}</td>
	      <td>${object.dept_name}</td>
	      <td>${object.id}</td>
	      <td>${object.emp_name}</td>
	      <td>${object.inhabit_num}</td>
	      <td>${object.password}</td>
	      <td>${object.address}</td>
	      <td>${object.job_group}</td>
	      <td>${object.high_car}</td>
	      <td>${object.career}</td>
	      <td>${object.technique}</td>
	      <td>${object.class_posi}</td>
	    </tr>
    </tbody>
</table>
    <div>
      <button type="button" onclick="del()">삭제</button>
      <a href="./write?emp_no=${object.emp_no}">수정</a>
      <a href="./">목록</a>
    </div>

				
				
	
	<!-- /.container -->
	<div class="container">
		<hr>
		<!-- Footer -->
		<footer>
			<div class="row">
				<div class="col-lg-12">
					<p>Copyright &copy; (주)프람트솔루션 4조 2015</p>
				</div>
			</div>
		</footer>
	</div>
	<!-- /.container -->
	<!-- jQuery -->
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>
</html>
