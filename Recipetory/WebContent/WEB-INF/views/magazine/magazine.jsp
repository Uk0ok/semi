<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Recipetory Magazine</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

<style>
.title_wrap{
    width:100%;
    margin:0px auto;
    padding:0px; 
    overflow:hidden;
    text-align: center;
}
.title{
    width:1200px; 
    height:315px;
    margin:24px auto;
    padding:0px;
    overflow:hidden;
    text-align:center;
}

.title:after {content:""; clear:both; display:block;}

.title > div { 
    float:left;
    color:black;
    width:49.5%;
    height:100%;
    padding: 10px;
    text-align: center;
    box-sizing:border-box;
    border:1px solid black;
}
.m_title1{
	
}
.m_title2{
	margin-left : 1%;
	overflow: hidden;
}
#m_title_1{
	height: 90%;
}
#m_title_2{
	height: 10%;
	background-color: #a0a0a0;
	color: white;
}

.content_wrap{
	width: 1200px;
	margin:0px auto;
	padding:0px; 
    overflow:hidden;
    text-align: left;
}
.content_wrap > div {
	height: 300px;
	padding-top: 15px;
	padding-bottom: 15px;
	vertical-align: bottom;
}
.col>div{
	height: 80%;
	padding: 15px auto;
}
#col_1{
	height: 20%;
	padding: 15px auto;
	overflow: hidden;
}
#col_2{
	font-size: 0.7em;
	overflow: hidden;
}

</style>
<body>
	<%@ include file="/WEB-INF/views/common/header.jsp"%>
	
	<p align="middle" style="margin-top: 20px;">
		<iframe width="560" height="315" src="https://www.youtube.com/embed/SJ1ZxX2hN00?start=3" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
		<iframe width="560" height="315" src="https://www.youtube.com/embed/2Xv6cIhtyno?start=3" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
	</p>
    <div class="title_wrap">
		<div class="title">
			<div class="m_title1">
				<div id="m_title_1"><a href="mag_content1"><img src="./img/magBoard/magazine_milk.jpg" style="width: 100%; height: 100%;"></a></div>
				<div id="m_title_2">우유자조금관리위원회, 연말 홈파티용 우유활용 레시피 추천</div>
			</div>
			<div class="m_title2">
				<table class="table table-hover">
					<thead style="background-color: rgb(175, 187, 175);">
						<tr>
							<th><strong style="color: white;">주요 메거진 뉴스</strong></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><a href="mag_content2" style="text-decoration: none; color: black; ">더 나은 행복을 위한 3가지 레시피</a></td>
						</tr>
						<tr>
							<td><a href="mag_content2" style="text-decoration: none; color: black; ">더 나은 행복을 위한 3가지 레시피</a></td>
						</tr>
						<tr>
							<td><a href="mag_content2" style="text-decoration: none; color: black; ">더 나은 행복을 위한 3가지 레시피</a></td>
						</tr>
						<tr>
							<td><a href="mag_content2" style="text-decoration: none; color: black; ">더 나은 행복을 위한 3가지 레시피</a></td>
						</tr>
						<tr>
							<td>기사 제목 링크</td>
						</tr>
						<tr>
							<td>기사 제목 링크</td>
						</tr>
						<tr>
							<td>기사 제목 링크</td>
						</tr>
						<tr>
							<td>기사 제목 링크</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div class="content_wrap">
			<div class="row">
				<div class="col">
					<div><a href="mag_content3"><img src="./img/magBoard/magazine_umuck7.jpg" style="width: 100%; height: 100%;"></a></div>
					<div id="col_1" style="overflow: hidden;"> <a href="mag_content3" style="text-decoration: none; color: black; "><b>[오늘 뭐먹지?]  요리 초보도 ok! 초간단 밑반찬, 어묵볶음 레시피</b></a></div>
				</div>
				<div class="col">
					<div><a href="mag_content3"><img src="./img/magBoard/magazine_umuck7.jpg" style="width: 100%; height: 100%;"></a></div>
					<div id="col_1" style="overflow: hidden;"> <a href="mag_content3" style="text-decoration: none; color: black; "><b>[오늘 뭐먹지?]  요리 초보도 ok! 초간단 밑반찬, 어묵볶음 레시피</b></a></div>
				</div>
				<div class="col">
					<div><a href="mag_content3"><img src="./img/magBoard/magazine_umuck7.jpg" style="width: 100%; height: 100%;"></a></div>
					<div id="col_1" style="overflow: hidden;"> <a href="mag_content3" style="text-decoration: none; color: black; "><b>[오늘 뭐먹지?]  요리 초보도 ok! 초간단 밑반찬, 어묵볶음 레시피</b></a></div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div><a href="mag_content3"><img src="./img/magBoard/magazine_umuck7.jpg" style="width: 100%; height: 100%;"></a></div>
					<div id="col_1" style="overflow: hidden;"> <a href="mag_content3" style="text-decoration: none; color: black; "><b>[오늘 뭐먹지?]  요리 초보도 ok! 초간단 밑반찬, 어묵볶음 레시피</b></a></div>
				</div>
				<div class="col">
					<div><a href="mag_content3"><img src="./img/magBoard/magazine_umuck7.jpg" style="width: 100%; height: 100%;"></a></div>
					<div id="col_1" style="overflow: hidden;"> <a href="mag_content3" style="text-decoration: none; color: black; "><b>[오늘 뭐먹지?]  요리 초보도 ok! 초간단 밑반찬, 어묵볶음 레시피</b></a></div>
				</div>
				<div class="col">
					<div><a href="mag_content3"><img src="./img/magBoard/magazine_umuck7.jpg" style="width: 100%; height: 100%;"></a></div>
					<div id="col_1" style="overflow: hidden;"> <a href="mag_content3" style="text-decoration: none; color: black; "><b>[오늘 뭐먹지?]  요리 초보도 ok! 초간단 밑반찬, 어묵볶음 레시피</b></a></div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div><a href="mag_content3"><img src="./img/magBoard/magazine_umuck7.jpg" style="width: 100%; height: 100%;"></a></div>
					<div id="col_1" style="overflow: hidden;"> <a href="mag_content3" style="text-decoration: none; color: black; "><b>[오늘 뭐먹지?]  요리 초보도 ok! 초간단 밑반찬, 어묵볶음 레시피</b></a></div>
				</div>
				<div class="col">
					<div><a href="mag_content3"><img src="./img/magBoard/magazine_umuck7.jpg" style="width: 100%; height: 100%;"></a></div>
					<div id="col_1" style="overflow: hidden;"> <a href="mag_content3" style="text-decoration: none; color: black; "><b>[오늘 뭐먹지?]  요리 초보도 ok! 초간단 밑반찬, 어묵볶음 레시피</b></a></div>
				</div>
				<div class="col">
					<div><a href="mag_content3"><img src="./img/magBoard/magazine_umuck7.jpg" style="width: 100%; height: 100%;"></a></div>
					<div id="col_1" style="overflow: hidden;"> <a href="mag_content3" style="text-decoration: none; color: black; "><b>[오늘 뭐먹지?]  요리 초보도 ok! 초간단 밑반찬, 어묵볶음 레시피</b></a></div>
				</div>
			</div>
		</div>
		<br> <br>
		<button>게시글 작성</button>
    </div>
    <br>
    
    
    
    <%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>