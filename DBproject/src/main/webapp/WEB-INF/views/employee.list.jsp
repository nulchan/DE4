<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <title>직원 list</title>
  </head>
  <body>
  
  <h1>${message}</h1>
  <h1>직원 list</h1>
  <table border="1">
    <colgroup>
  <col width="60"><col><col width="115"><col width="85">
  </colgroup>
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
    <c:forEach var="item" items="${employeelist}" varStatus="status">
    <tr>
      <td>${item.emp_no}</td>
      <td>${item.dept_name}</td>
      <td>${item.id}</td>
      <td><a href="./${item.emp_no}">${item.emp_name}</a></td>
      <td>${item.inhabit_num}</td>
      <td>${item.password}</td>
      <td>${item.address}</td>
      <td>${item.job_group}</td>
      <td>${item.high_car}</td>
      <td>${item.career}</td>
      <td>${item.technique}</td>
      <td>${item.class_posi}</td>
    </tr>
    </c:forEach>

    </tbody>

  </table>
  <div><a href="./write">쓰기</a></div>
  </body>
</html>