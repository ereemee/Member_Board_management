<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!-- jstl이란??  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Board_list</h1><a href="/board/write">글쓰기</a>
<table border="1" style="border-collapse:collapse">
<tr>

<td>번호</td>
<td>제목</td>
<td>작성자</td>
<td>작성일</td>
<td>수정일</td>
</tr>
<!-- for시작 -->
<c:forEach items="${list}" var="board">
<tr>

<td>${board.bno}</td>
<td><a href="detail?bno=${board.bno}">${board.title}</a></td>
<td>${board.writer}</td>
<td>${board.regdate}</td>
<td>${board.updatedate}</td>
</tr>

</c:forEach>
<!-- for끝-->

</table>
</body>
</html>