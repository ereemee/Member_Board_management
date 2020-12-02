<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입 폼입니다</h1>
<form action="/member2/add" method="post">

<table>
<tr>

<td>이메일</td>
<td><input type="text" name="addr"></td>
</tr>

<tr>

<td>아이디</td>
<td><input type="text" name="id"></td>
</tr>

<tr>

<td>비밀번호</td>
<td><input type="password" name="password"></td>
</tr>
<tr><td colspan="2" ><input type="submit" value="회원가입하기"></td></tr>
</table>
</form>

</body>
</html>