<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>우유자조금관리위원회, 연말 홈파티용 우유활용 레시피 추천</title>
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
					<td width="30%">글 번호 : 1</td>
					<td width="30%"> <b>제목 : 강원도농업기술원, 이달의 식재료 레시피 북 발간</b></td>
					<td width="30%" align="right"> 작성일 : 2022.01.05 15:43</td>
				</tr>
				<tr>
					<td width="30%">조회 수 : 1004</td>
					<td width="30%">추천 수 : 1004</td>
					<td width="30%" align="right">스크랩 수 : 91</td>
				</tr>
				<tr id="content" valign="top"
					style="border-top-color: rgb(100, 100, 100); border-top-width: 1px; border: 1px solid black">
					<td colspan="3">
					강원도농업기술원(원장 최종태)에서는 2021년 매월 ‘이달의 식재료’를 선정하고 다양하게 활용할 수 있는 요리를 개발했으며 이 내용을 담은 레시피 북을 발간해 1월중 급식 관련기관‧식생활 교육 기관 등에 배포할 계획이다. <br><br>

이번에 발간한 ‘2021년 이달의 식재료 레시피 북’에는 면역력 증강에 도움되는 산마늘 물김치, 잎새버섯 샌드위치를 비롯한 강원도에서 육성중인 주요 식재료를 활용한 26종의 다양한 레시피가 수록돼 있다.<br><br>

또한 레시피 북과 연결된 음식을 만드는 영상도 강원도청 유튜브를 통해서 확인할 수 있다.<br><br>

최종태 원장은 “올해도 강원도의 농산물을 제대로 알리고 로컬푸드를 활용한 건강 음식문화 확산을 위해 농업‧농촌과 연계된 식문화 사업을 다양하게 추진할 계획”이라고 말했다.<br><br>

출처 : 농수축산신문(http://www.aflnews.co.kr)
					</td>
				</tr>

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