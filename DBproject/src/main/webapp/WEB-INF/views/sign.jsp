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
				<a class="navbar-brand" href="./"><b>Prompt Solution 4조</b></a>
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
				<p class="lead">Prompt Solution (회원가입)</p>
				<div class="list-group">
					
				</div>
			</div>
		<div class="col-md-9">
	<div class="row carousel-holder">
					<div class="col-md-12">
						<div id="carousel-example-generic" class="carousel slide"
							data-ride="carousel">
<h1>
	회원가입  
</h1>

	<form action="${pageContext.request.contextPath }/SignController/signup" method="post">	
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"></td>
				<td></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password"></td>
				<td></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="emp_name"></td>
				<td></td>
			</tr>
			<tr>
				<td>주민등록번호</td>
				<td><input type="text" name="inhabit_num" size="13"></td>
				<td></td>
			</tr>
			<tr>
				<td>부서</td>
				<td>
					<select name="dept_name">
						<option value="management" selected>management
						<option value="business">business
						<option value="development">development
					</select>
				</td>
				<td></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="address" size="50"></td>
				<td></td>
			</tr>
			<tr>
				<td>최종학력</td>
				<td>
					<select name="high_car">
						<option value="50" selected>고등학교 졸업
						<option value="51">대학교 졸업
						<option value="52">대학원 졸업
					</select>
				</td>
				<td></td>
			</tr>
			<tr>
				<td>경력</td>
				<td><input type="text" name="career" size="3"></td>
				<td></td>
			</tr>
			<tr>
				<td>경험한 기술</td>
				<td><input type="text" name="technique" size="30"></td>
				<td></td>
			</tr>
			<tr>
				<td>직급</td>
				<td><input type="text" name="class_posi" size="30"></td>
				<td></td>
			</tr>
			<tr>
				<td>권한</td>
				<td><input type="text" name="job_group" size="30"></td>
				<td></td>
			</tr>
			<tr>
				<td><input type="submit" value="가입하기"></td>
				<td></td>
				<td><input type="reset" value="다시입력"></td>
			</tr>
		</table>
	</form>
<br/>
	<a href="./">메인화면으로 돌아가기</a>
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