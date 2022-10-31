<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

</head>
<body>
	<h1>${board.id }번 게시물 수정</h1>
	
	<form action="" method="post">
	<input type="hidden" name="id" value="${board.id }">
	제목 <input type="text" name="title" value="${board.title }"> <br>
	본문 <textarea name="content">${board.content }</textarea> <br>
	작성자 <input type="text" name="writer" value="${board.writer }"> <br>
	작성일시 <input type="datetime-local" value="${board.inserted }" readonly> <br>
	<input type="submit" value="수정">
	</form>
	
	<c:url value="/board/remove" var="removeLink"/>
	<form action="${removeLink }" method="post">
	<input type="hidden" name="id" value="${board.id }">
	<input type="submit" value="삭제">
	</form>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>