<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Sign</title>
</head>
<body>
<h1>
	회원가입  (아이디 검사)
</h1>

	<form action="${pageContext.request.contextPath }/SignController/checkId" method="post">	
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td></td>
				<td><h1>${id}</h1>${addid}</td>
			</tr>
			<tr>
				<td><input type="submit" value="개인정보 입력"></td>
				<td></td>
				<td><input type="reset" value="다시입력"></td>
			</tr>
		</table>
	</form>
<br/>
	<a href="${pageContext.request.contextPath }/LoginController/home">메인화면으로 돌아가기</a>
</body>
</html>
