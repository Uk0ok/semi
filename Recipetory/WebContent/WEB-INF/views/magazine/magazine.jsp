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
	overflow: auto;
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
    text-align: center;
}
.content_wrap > div {
	height: 300px;
	padding-top: 15px;
	padding-bottom: 15px;
	vertical-align: bottom;
}
.col>div{
	height: 70%;
	padding: 15px auto;
	background-color: gray;
}
#col_1{
	height: 15%;
	padding: 15px auto;
	background-color: white;
}
#col_2{
	height: 15%;
	background-color: green;
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
				<div id="m_title_1">뉴스 링크의 사진</div>
				<div id="m_title_2">그 링크의 제목</div>
			</div>
			<div class="m_title2">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>주요 메거진 뉴스</th>
						</tr>
					</thead>
					<tbody>
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
					<div>사진</div>
					<div id="col_1">기사 제목</div>
					<div id="col_2">기사 내용들</div>
				</div>
				<div class="col">
					<div>사진</div>
					<div id="col_1">기사 제목</div>
					<div id="col_2">기사 내용들</div>
				</div>
				<div class="col">
					<div>사진</div>
					<div id="col_1">기사 제목</div>
					<div id="col_2">기사 내용들</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div>사진</div>
					<div id="col_1">기사 제목</div>
					<div id="col_2">기사 내용들</div>
				</div>
				<div class="col">
					<div>사진</div>
					<div id="col_1">기사 제목</div>
					<div id="col_2">기사 내용들</div>
				</div>
				<div class="col">
					<div>사진</div>
					<div id="col_1">기사 제목</div>
					<div id="col_2">기사 내용들</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div>사진</div>
					<div id="col_1">기사 제목</div>
					<div id="col_2">기사 내용들</div>
				</div>
				<div class="col">
					<div>사진</div>
					<div id="col_1">기사 제목</div>
					<div id="col_2">기사 내용들</div>
				</div>
				<div class="col">
					<div>사진</div>
					<div id="col_1">기사 제목</div>
					<div id="col_2">기사 내용들</div>
				</div>
			</div>
		</div>
    </div>
    <a href="mag_content">게시글</a>
    <%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>