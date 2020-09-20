<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
   .outer{
      width:900px;
      height:auto;
      background:black;
      color:white;
      margin-left:auto;
      margin-right:auto;
      margin-top:50px;
   }
   td {
      border:1px solid white;
   }
   .tableArea {
      border:1px solid white;
      width:650px;
      height:350px;
      margin-left:auto;
      margin-right:auto;
   }
</style>
</head>
<body>
	<jsp:include page="../common/menubar.jsp"/>
	
	<div class="outer">
		<br>
		
		<h1 align = "center">게시판 상세보기</h1>
		<table align="center" class="tableArea">
			<tr>
				<td width="100">글번호</td>
				<td><b>${b.bId}</b></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><b>${b.bTitle}</b></td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><b>${b.userName}</b></td>
			</tr>
			<tr>
				<td>조회수</td>
				<td><b>${b.bCount}</b></td>
			</tr>
			<tr>
				<td>작성일</td>
				<td><b>${b.bCreateDate}</b></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><p style="height:100px;"><b>${b.bContent}</b></p></td>
			</tr>
		</table>
		
		<!-- 댓글 등록 부분  -->
		<table align="center">
			<tr>
				<td>
					<textarea rows="2" cols="80"></textarea>
				</td>
				<td>
					<button>등록</button>
				</td>
			</tr>
			
			<tr>
				<td colspan="2"><b>댓글(${rCount})</b></td>
			</tr>
		
			<c:if test="${rCount>0}">
			<table align="center">
				<c:forEach var="r" items="${b.replyList}">
				<tr>
					<td width="100px"> ${r.userName}</td>
					<td width="400px"> ${r.rContent}</td>
					<td width="150px"> ${r.rCreateDate}</td>
				</tr>
				</c:forEach>
		</table>
		</c:if>
	
	</div>
</body>
</html>