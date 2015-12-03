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
  <h1>Project list</h1>
  <table border="1">
    <colgroup>
  <col width="60"><col><col width="115"><col width="85">
  </colgroup>
  <thead>
    <tr>
      <th scope="col">프로젝트번호</th>
      <th scope="col">관리자</th>
      <th scope="col">프로젝트이름</th>
      <th scope="col">시작일</th>
      <th scope="col">종료일</th>
      <th scope="col">발주처</th>
    </tr>
    </thead>

    <tbody>
    <!-- 목록이 반복될 영역 -->
    <c:forEach var="item" items="${list}" varStatus="status">
    <tr>
      <td><a href="./projectlist/${item.project_num}">${item.project_num}</a></td>
      
      <td>${item.emp_no}</td>
      <td>${item.project_name}</td>
      <td>${item.pro_outset}</td>
      <td>${item.pro_end}</td>
      <td>${item.order_place}</td>
    </tr>
    </c:forEach>

    </tbody>

  </table>
  <br/>
  <br/>
  <br/>
  <h1>Make Project</h1>
  <form id="formproject" method="post" action="./projectlist/write_ok">
  <table border="1">
    <colgroup>
  <col width="60"><col><col width="115"><col width="85">
  </colgroup>
  <thead>
    <tr>
      <th scope="col">관리자</th>
      <th scope="col">프로젝트이름</th>
      <th scope="col">시작일</th>
      <th scope="col">종료일</th>
      <th scope="col">발주처</th>
    </tr>
    </thead>

    <tbody>
    <!-- 목록이 반복될 영역 -->
    <tr>
      <td><input type="text" id="emp_no" name="emp_no" value="${item.emp_no}"/></td>
      <td><input type="text" id="project_name" name="project_name" value="${item.project_name}"/></td>
      <td><input type="text" id="pro_outset" name="pro_outset" value="${item.pro_outset}"/></td>
      <td><input type="text" id="pro_end" name="pro_end" value="${item.pro_end}"/></td>
      <td><input type="text" id="order_place" name="order_place" value="${item.order_place}"/></td>
    </tr>

    </tbody>
    </table>
    <input type="submit" value="make" />
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