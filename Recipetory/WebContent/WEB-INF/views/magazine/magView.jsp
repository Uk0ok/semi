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
	height: 20px;
	padding: 12px 0;
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
	<div class="controller">
		<div id="magTitle">
			<b>게시글 보기</b>
		</div>
		<table>
		<element>
			<c:forEach items="${magview}" var="mv">
				<tr>
					<th colspan="3" align="left">
						<h3>${mv.postno}</h3>
					</th>
				</tr>
				<tr>
					<td width="30%">글 제목 : ${mv.postName}</td>
					<td width="30%">작성자 : ${mv.adminNo}</td>
					<td width="30%" align="right">${mv.begDate}</td>
				</tr>
				<tr>
					<td width="30%">글 제목 : ${mv.recomNum}</td>
					<td width="30%">작성자 : ${mv.scrapNum}</td>
					<td width="30%" align="right">${mv.commNum}</td>
				</tr>
				<tr>
					<td width="30%">글 제목 : ${mv.modYn}</td>
					<td width="30%">작성자 : ${mv.fmodDate}</td>
					<td width="30%" align="right">${mv.delYn}</td>
				</tr>
				<tr id="content" valign="top"
					style="border-top-color: rgb(100, 100, 100); border-top-width: 1px">
					<td colspan="3">${mv.postContent }</td>
				</tr>
				<tr>
					<td colspan="3">조회수 ${mv.hits}</td>
				</tr>
			</c:forEach>
		</element>

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
			<a href="bbs.do">
				<button class="btn2">목록</button>
			</a>
		</div>
		<div>
			<a href="home.do">
				<button class="btn2">홈으로</button>
			</a>
		</div>
	</div>
</body>
</html>