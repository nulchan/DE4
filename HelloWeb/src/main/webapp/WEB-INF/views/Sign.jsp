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
	회원가입  
</h1>

	<form action="${pageContext.request.contextPath }/Sign.do" method="post">	
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"></td>
				<td>
					<input type="hidden" name="dupid" id="dupid" value=""/>
					<input type="hidden" name="checkid" id="checkid" value="N"/>
					<button type="button" id="dupbutton">중복확인</button>
				</td>
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
				<td><input type="text" name="inhabit1" size="6"> - 
		<input type="text" name="inhabit2" size="7"></td>
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
				<td><input type="submit" value="가입하기"></td>
				<td></td>
				<td><input type="reset" value="다시입력"></td>
			</tr>
		</table>
	</form>
<br/>
	<a href="${pageContext.request.contextPath }/">메인화면으로 돌아가기</a>
</body>
</html>
