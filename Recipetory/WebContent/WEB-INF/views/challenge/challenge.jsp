<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<style>
	a {
	    text-decoration: none;
	    color: inherit;
	}
	
	.board_list_wrap {
	    padding: 50px;
		margin-left: 18%;
		margin-right: 18%;
	}
	
	.board_list_head,
	.board_list_body .item {
	    padding: 10px 0;
	    font-size: 0;
	}
	
	.board_list_head {
	    border-top: 2px solid green;
	    border-bottom: 1px solid #ccc;
	}
	
	.board_list_body .item {
	    border-bottom: 1px solid #ccc;
	}
	
	.board_list_head > div,
	.board_list_body .item > div {
	    display: inline-block;
	    text-align: center;
	    font-size: 16px;
	}
	
	.board_list_head > div {
	    font-weight: 600;
	}
	
	.board_list .num {
	    width: 10%;
	}
	
	.board_list .tit {
	    width: 55%;
	}
	
	.board_list_body div.tit {
	    text-align: left;
	}
	
	.board_list_body div.tit a:hover {
	    text-decoration: underline;
	}
	
	.board_list .parti {
	    width: 10%;
	}
	
	.board_list .period {
	    width: 15%;
	}
	
	.board_list .review {
	    width: 10%;
	}

	.board_page {
    margin-top: 30px;
    text-align: center;
    font-size: 0;
}

	.board_page a {
	    display: inline-block;
	    width: 32px;
	    height: 32px;
	    box-sizing: border-box;
	    vertical-align: middle;
	    border: 1px solid #ddd;
	    border-left: 0;
	    line-height: 100%;
	}
	
	.board_page a.bt {
	    padding-top: 10px;
	    font-size: 1.2rem;
	    letter-spacing: -1px;
	}
	
	/* 페이지 */
	
	.board_page{
		padding-bottom:30px;
	}
	
	.board_page a.num {
	    padding-top:4px;
	    font-size: 1.4rem;
	}
	
	.board_page a.num.on {
	    border-color: rgb(175, 187, 175);
	    background: rgb(175, 187, 175);
	    color: #black;
	}
	
	.board_page a:first-child {
	    border-left: 1px solid #ddd;
	}
	
	/*글쓰기 버튼*/
	.bt_wrap a {
        display: inline-block;
        min-width: 80px;
        margin-left: 90%;
        padding: 10px;
        border: 1px solid #000;
        border-radius: 2px;
        font-size: 1.4rem;
    }

	.bt_wrap a.bt_write {
        background: #d2c897;
        color: black;
    }
	</style>
</head>
<body>       
<%@ include file= "/WEB-INF/views/common/header.jsp" %>
    <body>
        <div class="wrap">
        <head>
            <title>챌린지 게시판 목록</title>
        </head>
        <body>
            <div class="board_list_wrap">
                <div class="board_list">
                    <div class="board_list_head">
                        <div class="num">번호</div>
                        <div class="tit">챌린지명</div>
                        <div class="parti">참여자수</div>
                        <div class="period">기간</div>
                        <div class="review">리뷰</div>
                    </div>
                    <div class="board_list_body">
						<div class="item">
                            <div class="num">1</div>
                            <div class="tit"> <a href="./challengeview"><img src="./img/challengeBoard/jipbab.jpg" width="200" height="150"></a> <a href="./challengeview">일주일 집밥 챌린지</a></div>
                            <div class="parti">명 참여중</div>
                            <div class="period">~2022.02.10</div>
                            <div class="review"><a href="./challengereview">리뷰</a></div>
                        </div>
                        <div class="item">
                            <div class="num">2</div>
                            <div class="tit"> <a href="./challengeview"><img src="./img/challengeBoard/flour.jpg" width="200" height="150"></a> <a href="./challengeview">한달 밀가루 끊기 챌린지</a></div>
                            <div class="parti">명 참여중</div>
                            <div class="period">~2022.02.11</div>
                            <div class="review"><a href="./challengereview">리뷰</a></div>
                        </div>
                        <div class="item">
                            <div class="num">3</div>
                            <div class="tit"> <a href="./challengeview"><img src="./img/challengeBoard/water.jpg" width="200" height="150"></a> <a href="./challengeview">하루 2L 물 마시기</a></div>
                            <div class="parti">명 참여중</div>
                            <div class="period">~2022.02.12</div>
                            <div class="review"><a href="./challengereview">리뷰</a></div>
                        </div>
                        <div class="item">
                            <div class="num">4</div>
                            <div class="tit"> <a href="./challengeview"><img src="./img/challengeBoard/breakfast.jpg" width="200" height="150"></a> <a href="./challengeview">아침 먹기 챌린지</a></div>
                            <div class="parti">명 참여중</div>
                            <div class="period">~2022.02.13</div>
                            <div class="review"><a href="./challengereview">리뷰</a></div>
                        </div>
                        <div class="item">
                            <div class="num">5</div>
                            <div class="tit"> <a href="./challengeview"><img src="./img/challengeBoard/chickenbreast.jpg" width="200" height="150"></a> <a href="./challengeview">닭가슴살 챌린지</a></div>
                            <div class="parti">명 참여중</div>
                            <div class="period">~2022.02.14</div>
                            <div class="review"><a href="./challengereview">리뷰</a></div>
                        </div>
                   </div>
                   </div>
                    <br>
                    <div class="bt_wrap">
		            	<a href="./challengewrite" class="bt_write">글쓰기</a>	
            		</div>
                </div>
			</div>
            <div class="board_page">
                <a href="#" class="bt first"><<</a>
                <a href="#" class="bt prev"><</a>
                <a href="#" class="num on">1</a>
                <a href="#" class="num">2</a>
                <a href="#" class="num">3</a>
                <a href="#" class="num">4</a>
                <a href="#" class="num">5</a>
                <a href="#" class="bt next">></a>
                <a href="#" class="bt last">>></a>
            </div>
            </div>
        </div>
    
    <%@ include file= "/WEB-INF/views/common/footer.jsp" %>
</body>


</body>
</html>