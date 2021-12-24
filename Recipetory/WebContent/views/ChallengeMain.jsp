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
/*  헤더  */
    body {
        box-sizing: border-box;
        min-width: 1240px;
        margin: auto;
        background-color: cornsilk;
    }
    header{
        background-color: rgb(175, 187, 175);
    }
    #h_head {
        padding-top: 30px;
        height: 130px;
        width: 1200px;
        margin: 0 auto;
    }
    #h_title {
        float: left;
        padding-left: 100px;
    }
   #h_content {
       padding-left: 50px;
   }
    #nav {
        width: 1200px;
        margin: auto;
    }
    
/* 몸뚱아리  */

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
	
/*  푸터  */
	body {
        box-sizing: border-box;
        min-width: 1240px;
        margin: auto;
        background-color: cornsilk;
    }
    footer{
        background-color: rgb(175, 187, 175);
    }
    #f_content {
        height: 90px;
        width: 1200px;
        margin: 0 auto;
        padding-top: 10px;
        text-align: center;
    }
</style>
</head>
<body>

	 <header>
            <div id="h_head" class="row">
                <a href="home" id="h_title" class="col-sm-8">
                    <img src="./img/recipeBoard/logo.png" width="250px">
                </a>
                <div id="h_content" class="col-sm-4">
                    <div id="h_join">
                        <a href="#">로그인</a>
                        <a href="#">회원가입</a>
                    </div>
    
                    <div id="h_search">
                        <form id="search_form">
                            <input type="search" name="search" placeholder="레시피찾기">
                            <button type="submit"><img src="./img/recipeBoard/search.png" width="10px"></button>
                        </form>
                    </div>
                </div>
                
            </div>

            <div id="h_menu" class="container-fluid">  
                <ul id="nav" class="nav nav-tabs nav-justified">
                    <li class="nav-item">
                      <a class="nav-link" href="recipe">레시피</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="challenge">챌린지</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="#">식단코칭</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="magazine">매거진</a>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link" href="mypage">마이페이지</a>
                      </li>
                  </ul>
            </div>
        </header>
        
<!-- 몸뚱아리 -->

    <body>
        <div class="wrap2">
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
                            <div class="tit"> <img src="../resources/image/뽀숑.jpg" width="200" height="150"> <a href="#">챌린지명</a></div>
                            <div class="parti">nn 명 참여중</div>
                            <div class="star"> <a href="#">☆☆☆☆☆</a></div>
                            <div class="review"><a href="#">리뷰수</a></div>
                        </div>
                        <div class="item">
                            <div class="num">2</div>
                            <div class="tit"> <img src="../resources/image/뽀숑5.jpg" width="200" height="150"> <a href="#">챌린지명</a></div>
                            <div class="parti">nn 명 참여중</div>
                            <div class="star"> <a href="#">☆☆☆☆☆</a></div>
                            <div class="review"><a href="#">리뷰수</a></div>
                        </div>
                        <div class="item">
                            <div class="num">3</div>
                            <div class="tit"> <img src="../resources/image/뽀숑6.jpg" width="200" height="150"> <a href="#">챌린지명</a></div>
                            <div class="parti">nn 명 참여중</div>
                            <div class="star"> <a href="#">☆☆☆☆☆</a></div>
                            <div class="review"><a href="#">리뷰수</a></div>
                        </div>
                        <div class="item">
                            <div class="num">4</div>
                            <div class="tit"> <img src="../resources/image/뽀숑7.jpg" width="200" height="150"> <a href="#">챌린지명</a></div>
                            <div class="parti">nn 명 참여중</div>
                            <div class="star"> <a href="#">☆☆☆☆☆</a></div>
                            <div class="review"><a href="#">리뷰수</a></div>
                        </div>
                        <div class="item">
                            <div class="num">5</div>
                            <div class="tit"> <img src="../resources/image/뽀숑8.jpg" width="200" height="150"> <a href="#">챌린지명</a></div>
                            <div class="parti">nn 명 참여중</div>
                            <div class="star"> <a href="#">☆☆☆☆☆</a></div>
                            <div class="review"><a href="#">리뷰수</a></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

<!-- 푸터 -->
<footer>
            <div id="f_content">
                <div id="f_1">
                    <a href="">회사소개</a> | 
                    <a href="">광고문의</a> | 
                    <a href="">개인정보처리방침</a> | 
                    <a href="">이용약관</a>  |
                    <a href="">고객센터</a>
                </div>
                <br>
                <div id="f_2">Copyright © 2021 밥조Inc.All Right Reserved</div>
            </div>
        </footer>
</body>
</html>