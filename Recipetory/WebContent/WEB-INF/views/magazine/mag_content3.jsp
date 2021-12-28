<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[오늘 뭐먹지?] 요리 초보도 ok! 초간단 밑반찬, 어묵볶음 레시피</title>
</head>
<style>
.content_wrap_1{
    width: 1200px;
    margin:0px auto;
    margin-top:20px;
    padding:0px;
    text-align: center;
	border: 1px solid black;
	padding: 20px;
	
}
.content1{
    width:1100px; 
    height:60px;
    margin:24px auto;
    padding:0px;
    text-align:center;
}

.title:after {content:""; clear:both; display:block;}

.m_content_1 { 
    float:left;
    color:black;
    width:100%; 
    height:100%;
    padding: 10px;
	margin : auto;
    text-align: left;
    box-sizing: border-box;
    border:1px solid black;
    font-size: 2em;
}

.content2{
	width:1100px; 
    height:800px;
    margin:24px auto;
    padding:0px;
    text-align:left;
	border: 1px solid black;
	overflow: auto;
}
.content_date{
	text-align: left;
	width:1100px;
	margin: 0 auto;
}
.content_wrap_2{
    width: 1200px;
    margin:0px auto;
	margin-top: 20px;
    padding:0px;
    text-align: center;
	border: 1px solid black;
	padding: 20px;
}
.comment{
	text-align: left;
	font-size: 1.5em;
	margin: 0 auto;
	width:1100px;
}
.comments{
	border: 1px solid black;
	width:1100px;
	height:260px;
	overflow: auto;
	margin: 0 auto;
}
.commentss{
	text-align: left;
	border: 1px solid black;
	height: 60px;
	margin : 20px;
}
.comment_input{
	width:1040px;
	overflow: auto;
	margin: 0 auto;
	margin-top: 20px;
}
img{
	display: list-item;
	margin: 30px auto;
}
</style>
<body>
<%@ include file="/WEB-INF/views/common/header.jsp"%>

    <div class="content_wrap_1">
		<div class="content1">
			<div class="m_content_1">
				[오늘 뭐먹지?] 요리 초보도 ok! 초간단 밑반찬, 어묵볶음 레시피
			</div>
		</div>
		<div class="content_date">2021.12.27 16:00</div>
		<div class="content2">
		만인이 사랑하는 밑반찬, 어묵볶음 레시피입니다. 청양고추를 넣어 매콤한 맛을 더해봤습니다.<br>
한 번 만들어두면 밥반찬이나 도시락 반찬으로 추천드립니다. 청양고추 대신 양파나 당근을 사용해도 좋습니다. 조리 과정이 간단하니, 요리 초보도 도전 가능합니다.<br><br>
■ 재료<br>
어묵 10장, 청양고추 1개, 참기름 1T, 볶음참깨 약간, 꿀 1T, 양조간장 1T, 물 3T, 설탕 2t <br><br>
■ 만드는 방법<br>
<img src="./img/magBoard/magazine_umuck1.jpg">
Step 1. 어묵 10장을 1cm 두께로 썰고 청양고추는 송송 썰어주세요.
<img src="./img/magBoard/magazine_umuck2.jpg">
Step 2. 양조간장 1T, 물, 설탕을 후라이팬에 먼저 넣고 달궈 설탕을 녹여주세요.
<img src="./img/magBoard/magazine_umuck3.jpg">
Step 3. 참기름과 어묵을 넣어 볶아주세요.
<img src="./img/magBoard/magazine_umuck4.jpg">
Step 4. 청양고추를 넣어 어묵에 고추향이 배도록 볶아주세요.
<img src="./img/magBoard/magazine_umuck5.jpg">
Step 5. 양조간장을 1t 추가합니다.
<img src="./img/magBoard/magazine_umuck6.jpg">
Step 6. 볶음참깨를 뿌리고 요리용꿀 1T을 둘러 꿀 풍미를 주며 마무리합니다.
<img src="./img/magBoard/magazine_umuck7.jpg">
(사진=오뚜기 오'키친)


		</div>
		<button>추천</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<button>스크랩</button>
    </div>
	<div class="content_wrap_2">
	<div class="content3">
		<div class="comment">Comment</div>
		<div class="comments">
		<div class="commentss">댓글</div>
		<div class="commentss">댓글</div>
		<div class="commentss">댓글</div>
		<div class="commentss">댓글</div>
		<div class="commentss">댓글</div>
		<div class="commentss">댓글</div>
		</div>
	</div>
	<form action="">
			<input class="comment_input" type="text" placeholder="댓글을 등록해주세요.">&nbsp;&nbsp;&nbsp;<button type="submit">등록</button>
	</form>
	</div>

	<script>
		document.getElementById('currentDatetime').value= new Date().toISOString().slice(0, 16);
	</script>
	<br>
    <%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>