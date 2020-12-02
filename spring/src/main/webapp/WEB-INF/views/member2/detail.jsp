<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="/resources/js/mdetail.js"></script>
<title>Insert title here</title>
</head>
<body>
<h1>회원정보조회</h1>

<form action="/member2/update" name="frm1" method="post"> 
<table border="1" >
<tr><td>이메일주소</td><td>
<input type="text" name="addr" value="${mdetail.addr}"></td></tr>

<tr><td>아이디</td><td><input type="hidden" name="id" value="${mdetail.id}" >${mdetail.id}</td></tr>

<tr>
	<td>비밀번호</td><td>
	<input type="password" name="password" value="${mdetail.password}"></td>
</tr>

<tr><td colspan="2"> <input type="submit" value="수정하기" onclick="javascript: form.action='/member2/update';"/>
<input type="submit" value="삭제하기" onclick="javascript: form.action='/member2/delete';"/></td></tr>
</table>
</form>
</body>
</html>