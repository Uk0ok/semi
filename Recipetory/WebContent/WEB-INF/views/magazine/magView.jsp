<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	margin: 4px 0;
}

.controller {
	padding: 25px 0;
	margin: auto;
	width: 800px;
}

#magTitle {
	text-align: center;
	background-color: rgb(100, 100, 100);
	width: 800px;
	height: 40px;
	padding: 8px 0;
	color: white;
}

table {
	width: 800px;
	margin: 25px 0;
	padding: 20px;
	border-collapse: collapse;
}

tr {
	height: 40px;
}

#content {
	width: 800px;
	height: 400px;
	text-align: left;
}

.btn1 {
	width: 100px;
	padding: 5px 12px;
	border: none;
	background-color: rgb(150, 60, 60);
	color: white;
}

.btn2 {
	padding: 5px 12px;
	background-color: white;
	border-color: rgb(180, 180, 180);
	border-width: 1px;
}

</style>
</head>
<body>

	<%@ include file="/WEB-INF/views/common/header.jsp"%>
	
	<div class="controller">
		<div id="magTitle">
			<b>메거진 게시글</b>
		</div>
		<table>
		
				
				<tr>
					<td width="30%">글 번호 : ${magView.postNo}.</td>
					<td width="30%"> <b>제목 : ${magView.postName}</b></td>
					<td width="30%" align="right"> 작성일 : ${magView.begDate}</td>
				</tr>
				<tr>
					<td width="30%">조회 수 : ${magView.hits}</td>
					<td width="30%">추천 수 : ${magView.scrapNum}</td>
					<td width="30%" align="right">스크랩 수 : ${magView.commNum}</td>
				</tr>
				<tr id="content" valign="top"
					style="border-top-color: rgb(100, 100, 100); border-top-width: 1px; border: 1px solid black">
					<td colspan="3">${magView.postContent }</td>
				</tr>

		<!-- <c:choose>
			<c:when test="${bbsview.id == sessionID || sessionID == 'admin' }">
				<td>
					<a href="bbsdelete.do?bbsId=${bbsview.bbsId}">
						<button class="btn1">삭제</button>
					</a>
				</td>
				<td>
					<a href="bbsupdate.do?bbsId=${bbsview.bbsId}">
						<button class="btn1">수정</button>
					</a>
				</td>
			</c:when>
		</c:choose> -->
		</table>
		<div id="btnCon">
			<a href="javascript:window.history.back();">
				<button class="btn2">목록</button>
			</a>
		</div>
		<div>
			<a href="/Recipetory/home">
				<button class="btn2">홈으로</button>
			</a>
		</div>
	</div>
	<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>