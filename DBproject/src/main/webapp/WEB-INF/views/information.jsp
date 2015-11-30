<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Information</title>
</head>
<body>
<h1>
	회원정보
</h1>

	<form action="${pageContext.request.contextPath }/LoginController/information.modify" method="post">	
		<table>
			<tr>
				<td>직원번호</td>
				<td>${employee.getEmp_no()}</td>
			</tr>
			<tr>
				<td>아이디</td>
				<td>${employee.getId()}</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>${employee.getEmp_name()}</td>
			</tr>
			<tr>
				<td>부서명</td>
				<td>${employee.getDept_name()}</td>
			</tr>
			<tr>
				<td>직군</td>
				<td>${employee.getJob_group()}</td>
			</tr>
			<tr>
				<td>직급</td>
				<td>${employee.getClass_posi()}</td>
			</tr>
			<tr>
				<td>주민등록번호</td>
				<td>${employee.getInhabit1()} - 
					${employee.getInhabit2()}</td>
			</tr>
			<tr>
				<td>주소</td>
				<td>${employee.getAddress()}</td>
			</tr>
			<tr>
				<td>최종학력</td>
				<td>${employee.getHigh_car()}</td>
			</tr>
			<tr>
				<td>경력</td>
				<td>${employee.getCareer()}</td>
			</tr>
			<tr>
				<td>경험한 기술</td>
				<td>${employee.getTechnique()}</td>
			</tr>
			<tr>
				<td><input type="submit" value="수정"></td>
				<td><a href="${pageContext.request.contextPath }/LoginController/home">메인화면</a></td>
			</tr>
		</table>
	</form>
<br/>
</body>
</html>
