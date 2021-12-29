<%@page import="java.util.List"%>
<%@page import="com.reci.mag.controller.MagVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%--
	List<MagVo> mag_List = (List<MagVo>)request.getAttribute("mag_search"); //magVo 를 import해주고. 꺼내온 데이터를 캐스팅해줘야한다. 강제형변환
													//제한걸고 list로 다시 캐스팅. 타입도 리스트로 변경.
	for(MagVo mag : mag_List){ //향상된 for문 사용하여 출력하기.
		System.out.println(mag);
	}
	
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>우유자조금관리위원회, 연말 홈파티용 우유활용 레시피 추천</title>
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
				우유자조금관리위원회, 연말 홈파티용 우유활용 레시피 추천
			</div>
		</div>
		<div class="content_date">2021-12-28 20:28</div>
		<div class="content2">
		<img src="./img/magBoard/magazine_milk.jpg">
			우유자조금관리위원회(위원장 이승호)는 연말 외부 행사 대신 집에서 보내는 모임이 주목받는 가운데 홈파티에 적합한 우유활용 레시피 3선을 소개한다고 28일 밝혔다. <br> 

우유자조금관리위원회 관계자는 "코로나19의 재확산으로 인해 사회적 거리두기가 다시 강화되면서 외식이나 외부 모임 대신 집에서 소소하게 가족 및 지인들과 홈파티를 즐기는 것이 어느새 트렌드로 자리 잡았다"며 "온라인상에는 간편하면서도 분위기 있게 즐길 수 있는 홈파티와 관련된 레시피 정보들이 쏟아지고 있다"고 설명했다. <br>

이에 요리에 서툰 사람들도 간단하게, 맛있게 즐길 수 있는 연말맞이 우유활용 레시피인 ‘60초 케이크’, ‘우유버터파스타’, ‘카페라떼’를 추천한다. <br><br>

■ 60초 케이크 <br>
<재료><br>
우유 1컵(200㎖), 핫케이크가루 250g, 유자차 1큰술<br>
<만드는 방법><br>
1. 볼에 핫케이크 가루를 넣고 우유를 부어 덩어리지지 않도록 잘 섞는다.<br>
2. 1에 유자차를 곱게 다져 넣어 섞는다. <br>
3. 종이 틀에 반죽을 80% 정도만 채운다.<br>
4. 전자레인지에 넣어 60초 정도 익힌다.<br><br>
TIP. 유자차 대신 마른 과일이나 견과류를 다져 넣어 섞어도 좋다.<br><br>

■ 우유버터파스타<br>
편스토랑에서 소개된 우유버터파스타 레시피다. <br>
<재료><br>
우유 300ml, 물 500ml, 파스타 1인분(200g), 버터 40g, 소금 1꼬집, 참치액 1T, 마늘 1개, 후추, 트러플오일<br>
<만드는 방법><br>
냄비에 물 500ml를 넣고 우유 300ml도 같이 넣어준다. 끓기 전에 파스타면 1인분도 넣어준다.<br>
2. 파스타면 위에 버터 40g을 올린 후 10분동안 끓여준다. <br>
3. 소금 1꼬집, 참치액 1T를 넣고 국물이 자작해질 때까지 졸여준다. <br>
4. 불을 꺼준 뒤 마늘 1개를 갈아 넣은 후 불을 켜서 살짝 끓여준다. <br><br>
TIP. 치즈 그라인더에 마늘을 갈아주는 것이 좋다. <br>
5. 마지막으로 그릇에 플레이팅 한 후 후추 또는 트러플오일을 뿌려주면 완성이다.<br><br>

■ 카페라떼<br>
부드럽고 고소한 우유의 맛을 느낄 수 있는 겨울철 필수 음료 ‘카페라떼’, 커피와 우유를 섞은 카페라떼는 만들기도 간편하고, 빵이나 샌드위치에 곁들여 먹어도 좋다.<br>
<재료><br>
우유 200ml, 에스프레소 30ml(일회용 원두커피 활용)<br>
<만드는 방법><br>
1. 에스프레소 30ml(일회용 원두커피 활용)를 추출한다.<br>
2. 전지레인지에 우유 200ml를 1분 30초간 데운다.<br>
3. 데운 우유 200ml를 커피에 붓는다.<br>
4. 마무리로 우유 거품을 살짝 얹는다.<br><br>
TIP. 우유 거품은 수동 또는 진동 우유거품기를 활용하면 만들기가 더욱 쉽다. 우유 거품을 살짝 얹으면, 거품이 뚜껑 역할을 해 온도가 떨어지는 것을 막아주며 더 담백한 맛을 느낄 수 있다. 
		</div>
		<button>추천</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<button>스크랩</button>
    </div>
    
    <%--
    List<MagVo> mag_List = (List<MagVo>)request.getAttribute("mag_search");
    
    for(MagVo mag : mag_List){
    	String no = mag.getPOST_NO();
     //리스트에 있는 녀석들 뽑아사용. 밑에 =로 출력.
    --%>
    
	<div class="content_wrap_2">
	<div class="content3">
		<div class="comment">Comment</div>
		<div class="comments">
		<div class="commentss">댓글<%-- no --%></div>
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
	<%--
    }   //괄호를 밑에서 닫기.
	--%>

	<!--
	<c:forEach items="${mag_search}" var="mag">
		<div class="commentss">${mag.POST_NO}</div>
		<div class="commentss">${mag.POST_NAME}</div>
		<div class="commentss">${mag.POST_NO}</div>
		<div class="commentss">${mag.POST_NO}</div>
	</c:forEach>
		 JSTL, EL을 사용해서 더 간편하게 만들수 있다. 
		JSTL 라이브러리에 넣어 세팅하고, 
	-->
	<br>
	
	
    <%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>