<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <title>스프링프레임워크 게시판</title>
  </head>
  <body>
  <h1>${message}</h1>
  <h1>Project list</h1>
  <table border="1">
    <colgroup>
  <col width="60"><col><col width="115"><col width="85">
  </colgroup>
  <thead>
    <tr>
      <th scope="col">참여자id</th>
      <th scope="col">프로젝트번호</th>
      <th scope="col">업무</th>
      <th scope="col">참여일</th>
      <th scope="col">종료일</th>
    </tr>
    </thead>

    <tbody>
    <!-- 목록이 반복될 영역 -->
    <c:forEach var="item" items="${list}" varStatus="status">
    <tr>
      <td>${item.emp_no}</td>
      <td><a href="./${item.project_num}">${item.project_num}</a></td>
      <td>${item.duty}</td>
      <td>${item.partici_beg}</td>
      <td>${item.partici_end}</td>
    </tr>
    </c:forEach>

    </tbody>

  </table>
  <div><a href="./write">쓰기</a></div>
  </body>
</html>