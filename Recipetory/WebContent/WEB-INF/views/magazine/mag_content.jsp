<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
.content_wrap_1{
    width: 1200px;
    margin:0px auto;
    padding:0px;
    text-align: center;
	border: 1px solid black;
	padding: 20px;
}
.content1{
    width:1200px; 
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

.m_content_2{
	border: 1px solid black;
	width: 80px;
	height: 20px;
	color: black;
	text-align: center;
	margin: 0 auto;
	float: right;
	border-radius: 20px;
}

.content2{
	width:1200px; 
    height:800px;
    margin:24px auto;
    padding:0px;
    text-align:left;
	border: 1px solid black;
	overflow: scroll;
}
.content_date{
	text-align: left;
}
.content_wrap_2{
    width: 1200px;
	margin-top: 20px;
	margin-left: 0 auto;
	margin-right: 0 auto;
	margin-bottom: 0 auto;
    padding:0px;
    text-align: center;
	border: 1px solid black;
	padding: 20px;
}
.comment{
	text-align: left;
	font-size: 1.5em;
}
.comments{
	text-align: left;
	border: 1px solid black;
	height: 60px;
	margin-top: 20px;
}
.comment_input{
	width: 95.7%;
	margin-top: 20px;
}
</style>
<body>
<%@ include file="/WEB-INF/views/common/header.jsp"%>

    <div class="content_wrap_1">
		<div class="content1">
			<div class="m_content_1">
				매거진 타이틀
				<div class="m_content_2">
					추천 수
				</div>
			</div>
		</div>
		<div class="content_date"><input type="datetime-local" id="currentDatetime"> <-업로드 시간 예시</div>
		<div class="content2">
			메거진 내용 <br>
			ddd <br>
			ddd <br>
			ddd <br>
			ddd <br>
			내용이 이 div 넘어가면 scroll 되서 볼수 있다.
		</div>
		<button>추천</button>
		<button>스크랩</button>
    </div>
	<div class="content_wrap_2">
		<div class="comment">Comment</div>
		<div class="comments"></div>
		<div class="comments"></div>
		<div class="comments"></div>
		<form action="">
			<input class="comment_input" type="text" placeholder="댓글을 등록해주세요."><button type="submit">등록</button>
		</form>
		
	</div>

	<script>
		document.getElementById('currentDatetime').value= new Date().toISOString().slice(0, 16);
	</script>
	<br>
    <%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>