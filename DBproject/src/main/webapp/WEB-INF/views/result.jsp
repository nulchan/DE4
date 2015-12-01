<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<title>test</title>
</head>
<body>
<h1>
	테스트창
</h1>

			${result}
				<a href="${pageContext.request.contextPath }/LoginController/home">메인화면</a>
<br/>
</body>
</html>