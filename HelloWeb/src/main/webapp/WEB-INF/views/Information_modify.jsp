<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Information_modify</title>
</head>
<body>
<h1>
	회원정보수정
</h1>

	<form action="${pageContext.request.contextPath }/information.modifydo" method="post">	
		<table>
			<tr>
				<td>아이디</td>
				<td>${employee.getId()}</td>
			</tr>
			<tr>
				<td>현재 비밀번호</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>새 비밀번호</td>
				<td><input type="password" name="new_password"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="emp_name" value="${employee.getEmp_name()}"></td>
			</tr>
			<tr>
				<td>부서명</td>
				<td>
					<select name="dept_name">
						<option value="10" selected>경영 관리부
						<option value="11">영업부
						<option value="12">연구 개발부
					</select>
				</td>
			</tr>
			<tr>
				<td>직군</td>
				<td>
					<select name="job_group">
						<option value="0">경영진
						<option value="1">PM
						<option value="2" selected>일반직원
					</select>
				</td>
			</tr>
			<tr>
				<td>직급</td>
				<td>
					<select name="class_posi">
						<option value="20">부장
						<option value="21">차장
						<option value="22">과장
						<option value="23">대리
						<option value="24" selected>사원
					</select>
				</td>
			</tr>
			<tr>
				<td>주민등록번호</td>
				<td><input type="text" name="tinhabit1" value="${employee.getInhabit1()}"> - 
					<input type="text" name="tinhabit2" value="${employee.getInhabit2()}">
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="address" size="50" value="${employee.getAddress()}"></td>
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
			</tr>
			<tr>
				<td>경력</td>
				<td><input type="text" name="career" size="3" value="${employee.getCareer()}"></td>
			</tr>
			<tr>
				<td>경험한 기술</td>
				<td><input type="text" name="technique" size="30" value="${employee.getTechnique()}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="수정완료"></td>
				<td><a href="${pageContext.request.contextPath }/">취소</a></td>
			</tr>
		</table>
	</form>
<br/>
	
</body>
</html>
