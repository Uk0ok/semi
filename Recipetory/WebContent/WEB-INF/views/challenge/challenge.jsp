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
	    font-size: 14px;
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
	
	.board_list .star {
	    width: 15%;
	}
	
	.board_list .review {
	    width: 10%;
	}
	
	/* paging */
	.paging {
	    margin-top: 30px;
	    text-align: center;
	}
	
	.paging a {
	    display: inline-block;
	    vertical-align: middle;
	}
	
	.paging a.bt {
	    width: 30px;
	    height: 30px;
	    background-color: #ccc;
	    background-image: url(../img/page_bt.png);
	    background-repeat: no-repeat;
	    border-radius: 100px;
	    text-indent: -1000px;
	    overflow: hidden;
	}
	
	.paging a.bt:hover {
	    background-color: #999;
	}
	
	.paging a.first {
	    background-position: 10px -40px;
	}
	
	.paging a.prev {
	    margin-right: 5px;
	    background-position: 10px 10px;
	}
	
	.paging a.next {
	    margin-left: 5px;
	    background-position: -40px 10px;
	}
	
	.paging a.last {
	    background-position: -40px -40px;
	}
	
	.paging a.num {
	    margin: 0 5px;
	}
	
	.paging a.num.on {
	    color: green;
	}
	
	.paging a.num:hover {
	    text-decoration: underline;
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
                        <div class="star">별점</div>
                        <div class="review">리뷰수</div>
                    </div>
                    <div class="board_list_body">
                        <div class="item">
                            <div class="num">1</div>
                            <div class="tit"> <img src="../WebContent/img/challengeBoard/jipbab.jpg" width="200" height="150"> <a href="#">일주일 집밥 챌린지</a></div>
                            <div class="parti">nn 명 참여중</div>
                            <div class="star"> <a href="#">☆☆☆☆☆</a></div>
                            <div class="review"><a href="#">리뷰수</a></div>
                        </div>
                        <div class="item">
                            <div class="num">2</div>
                            <div class="tit"> <img src="../WebContent/img/challengeBoard/flour.jpg" width="200" height="150"> <a href="#">한달 밀가루 끊기 챌린지</a></div>
                            <div class="parti">nn 명 참여중</div>
                            <div class="star"> <a href="#">☆☆☆☆☆</a></div>
                            <div class="review"><a href="#">리뷰수</a></div>
                        </div>
                        <div class="item">
                            <div class="num">3</div>
                            <div class="tit"> <img src="../WebContent/img/challengeBoard/water.jpg" width="200" height="150"> <a href="#">하루 2L 물 마시기</a></div>
                            <div class="parti">nn 명 참여중</div>
                            <div class="star"> <a href="#">☆☆☆☆☆</a></div>
                            <div class="review"><a href="#">리뷰수</a></div>
                        </div>
                        <div class="item">
                            <div class="num">4</div>
                            <div class="tit"> <img src="../WebContent/img/challengeBoard/breakfast.jpg" width="200" height="150"> <a href="#">아침 먹기 챌린지</a></div>
                            <div class="parti">nn 명 참여중</div>
                            <div class="star"> <a href="#">☆☆☆☆☆</a></div>
                            <div class="review"><a href="#">리뷰수</a></div>
                        </div>
                        <div class="item">
                            <div class="num">5</div>
                            <div class="tit"> <img src="../WebContent/img/" width="200" height="150"> <a href="#">챌린지명</a></div>
                            <div class="parti">nn 명 참여중</div>
                            <div class="star"> <a href="#">☆☆☆☆☆</a></div>
                            <div class="review"><a href="#">리뷰수</a></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    
    <%@ include file= "/WEB-INF/views/common/footer.jsp" %>
</body>


</body>
</html>