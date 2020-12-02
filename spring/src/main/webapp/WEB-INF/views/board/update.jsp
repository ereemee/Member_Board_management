<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 수정중 </h1>
<form action="/board/update" method="post">
<table border="1">
			<tr><td>번호</td>			
			<td><input type="hidden" value="${modify.bno}" name="bno">${modify.bno}</td></tr>
			<tr><td>제목</td>
			
			<td><input type="text" value="${modify.title}" name="title"></td></tr>
			
			<tr><td>내용</td>
			<td><textarea name="content">${modify.content}</textarea></td></tr>
			
			<tr><td colspan="2"><input type="submit" value="수정하기"></td></tr>
</table>
</form>
</body>
</html>