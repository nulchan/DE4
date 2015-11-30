<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>(주)프람트솔루션</h1>
	<form action="login.do" method="post">	
		<table>
			<tr>
				<td>
					아이디 <input type="text" name="id">
				</td>
			</tr>
			<tr>
				<td>
					비밀번호  <input type="password" name="password">
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="로그인(미구현)">
				</td>
			</tr>
		</table>
	</form>
	<br>
	
		<a href="${pageContext.request.contextPath }/LoginController/Sign">회원가입</a><br/>
		고객님의 경우에는 <a href="">여기(미구현)</a>를 눌러 주세요.<br/>
		<br/><br/><br/>
		(임시) <a href="${pageContext.request.contextPath }/LoginController/Information">회원정보 뷰</a><br/>
		(임시) <a href="${pageContext.request.contextPath }/">게시판 뷰</a><br/>
</body>
</html>

