<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">
		<title>(주)프람트솔루션 4조</title>
	<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/css/shop-homepage.css" rel="stylesheet">
    <title>직원 list</title>
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
					<li><a href="../management/${result}">마이페이지</a></li>
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
				<p class="lead">Prompt Solution (${result})</p>
				<div class="list-group">
					<a href="../management/customerEvallist" class="list-group-item">고객평가조회</a>
					<a href="../management/pmEvallist" class="list-group-item">PM평가조회</a>
					<a href="../management/colleagueEvallist" class="list-group-item">동료평가조회</a>
					<a href="../management/employeelist"	class="list-group-item">직원조회</a>
					<a href="../management/projectlist"	class="list-group-item">프로젝트조회</a>
				</div>
			</div>
		<div class="col-md-9">
	<div class="row carousel-holder">
					<div class="col-md-12">
						<div id="carousel-example-generic" class="carousel slide"
							data-ride="carousel">
  <h1>${message}</h1>
  <form id="form" method="post" action="./write_ok">
  <table border="1">
  	<tr>
		  <td>직원번호</td>
		  <td><input type="text" id="emp_no" name="emp_no" value="${object.emp_no}" /></td>
	</tr>
	<tr>
		  <td>부서</td>
		  <td><input type="text" id="dept_name" name="dept_name" value="${object.dept_name}" /></td>
	</tr>
	<tr>
		  <td>id</td>
		  <td><input type="text" id="id" name="id" value="${object.id}" /></td>
	</tr>
	<tr>
		  <td>이름</td>
		  <td><input type="text" id="emp_name" name="emp_name" value="${object.emp_name}" /></td>
	</tr>
	<tr>
		  <td>주민번호</td>
		  <td><input type="text" id="inhabit_num" name="inhabit_num" value="${object.inhabit_num}" /></td>
	</tr>
	<tr>
		  <td>password</td>
		  <td><input type="text" id="password" name="password" value="${object.password}" /></td>
	</tr>
	<tr>
		  <td>주소</td>
		  <td><input type="text" id="address" name="address" value="${object.address}" /></td>
	</tr>
	<tr>
		  <td>권한</td>
		  <td><input type="text" id="job_group" name="job_group" value="${object.job_group}" /></td>
	</tr>
	<tr>
		  <td>최종학력</td>
		  <td><input type="text" id="high_car" name="high_car" value="${object.high_car}" /></td>
	</tr>
	<tr>
		  <td>경력</td>
		  <td><input type="text" id="career" name="career" value="${object.career}" /></td>
	</tr>
	<tr>
		  <td>경험기술</td>
		  <td><input type="text" id="technique" name="technique" value="${object.technique}" /></td>
	</tr>
	<tr>
		  <td>직급</td>
		  <td><input type="text" id="class_posi" name="class_posi" value="${object.class_posi}" /></td>
	</tr>
</table>
	  <div>
		  <input type="submit" value="save" />
		  <a href="./">목록</a>
	  </div>
  </form>
  </div>
	  </div>
	  </div>
	  </div>
	  </div>
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