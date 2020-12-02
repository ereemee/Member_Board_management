<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원 리스트 명단</h1><a href="/member2/add">회원가입</a>

<table border="1">
<tr><td>이메일주소</td><td>아이디</td><td>비밀번호</td></tr>

<c:forEach items="${mlist}" var="member">
<tr><td>${member.addr}</td><td><a href="detail?id=${member.id}">${member.id}</a></td><td>${member.password}</td></tr>
</c:forEach>
</table>

</body>
</html>