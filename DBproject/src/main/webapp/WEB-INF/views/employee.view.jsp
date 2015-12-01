


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
		<title>(��)����Ʈ�ַ�� 4��</title>
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
				<a class="navbar-brand" href="#"><b>Prompt Solution 4��</b></a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="./${result}">����������</a></li>
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
					<a href="custom.jsp" class="list-group-item">����ȸ</a>
					<a href="friend.jsp"	class="list-group-item">������ȸ</a>
					<a href="pm.jsp"	class="list-group-item">������Ʈ��ȸ</a>
				</div>
			</div>
			<div class="col-md-9">

    <script>
    function del(){
      if (confirm("�����Ͻðڽ��ϱ�?")) document.form.submit();
    }
    </script>

    <form id="form" name="form" method="post" action="./deleteemployee.do">
      <input type="hidden" id="emp_no" name="emp_no" value="${object.emp_no}" />
    </form>
    <p>${object.emp_name}</p>
	<table border=1> 
	    <thead>
	    <tr>
	      <th scope="col">������ȣ</th>
	      <th scope="col">�μ�</th>
	      <th scope="col">ID</th>
	      <th scope="col">�̸�</th>
	      <th scope="col">�ֹε�Ϲ�ȣ</th>
	      <th scope="col">��й�ȣ</th>
	      <th scope="col">�ּ�</th>
	      <th scope="col">��������</th>
	      <th scope="col">�����з�</th>
	      <th scope="col">���</th>
	      <th scope="col">���</th>
	      <th scope="col">����</th>
	    </tr>
		</thead>

    <tbody>
	    <!-- ����� �ݺ��� ���� -->
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
      <button type="button" onclick="del()">����</button>
      <a href="./write?emp_no=${object.emp_no}">����</a>
      <a href="./">���</a>
    </div>

				
				
	
	<!-- /.container -->
	<div class="container">
		<hr>
		<!-- Footer -->
		<footer>
			<div class="row">
				<div class="col-lg-12">
					<p>Copyright &copy; (��)����Ʈ�ַ�� 4�� 2015</p>
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
