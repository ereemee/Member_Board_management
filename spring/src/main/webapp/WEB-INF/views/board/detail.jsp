<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="/resources/js/detail.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<h1>Board_detail</h1>

<form name="frm1">

<table border="1" style="border-collapse:collapse">

<tr><td>번호</td><td><input type="hidden" name="bno" value="${detail.bno}" readonly >${detail.bno}</td></tr>
<tr><td>제목</td><td><input type="hidden" name="title" value="${detail.title}"  >${detail.title}</td></tr>
<tr><td>내용</td><td><input type="hidden" name="content" value="${detail.content}"  >${detail.content}</td></tr>
<tr><td>수정일</td><td><input type="hidden" name="updatedate" value="${detail.updatedate}">${detail.updatedate}</td></tr>
<tr><td colspan="2"> 
<input type="submit" value="수정하기" onclick="btn_click('update')"/> 
<input type="submit" value="삭제하기" onclick="btn_click('delete')"/></td></tr>

</table>

</form>
</body>
</html>