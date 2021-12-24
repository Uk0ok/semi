<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<style>
    /* 헤더 */
    a {
        text-decoration: none;
        color: inherit;
    }
    header {
        border-bottom: 1px solid lightgreen;
        background-color: #c5d081;
    }
    header > div {
        width: 100%;
        min-width: 1000px;
        max-width: 1200px;
        height: 150px;
        margin: 0 auto;
    }
    header .logo {
        float: left;
    }
    

    #h_title {
        width: 250px;
    }

    /* 로그인 */
    header .login {
        float: right;
    }
    header .login li {
        display: inline-block;
        margin-top: 28px;
        margin-left: 30px;
    }

    /* 로그인 버튼 */
    header .login_input_btn {
        float: right;
    }
    header .login_input_btn li {
        display: inline-block;
        margin-top: 28px;
        margin-left: 30px;
    }

    /* 회원가입, 비번 찾기 */
    header .login_etc {
        float: right;
    }
    header .login_etc li {
        display: inline-block;
        margin-top: 28px;
        margin-left: 30px;
    }

    /* 검색 */
    #search_form {
        float: right;
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
    
    
</style>
<body>
    <div id="wrap">

<!-- 헤더  -->
        <header>
            <div id="h_head" class="container-fluid login01" style="margin-bottom:0">
                <a href="#"><img id="h_title" src="../img/recipeBoard/logo.png"></a> 
                
                <div class="login">
                    <form id="login_form">
                        <div id="login_input_id_pwd">
                            <input type="text" id="input_id" placeholder="ID를 입력하세요"><br>                    
                            <input type="password" id="input_pwd" placeholder="PWD를 입력하세요">
                        </div>

                <div class="login_input_btn">
                    <button type="submit" id="login_btn">로그인</button>
                        </div>    
                <div class="login_etc">
                    <a href="">회원가입</a>
                    |
                    <a href="">ID/PWD 찾기</a>
                </div>
                </form>
                </div>

                <div id="h_search">
                    <form id="search_form">
                        <input type="search" name="search" placeholder="레시피찾기">
                        <button type="submit"><img src="../img/recipeBoard/img.jpg" width="10px"></button>
                    </form>
                </div>
            </div>

<!-- 네비게이터 -->
            <ul class="nav nav-tabs nav-justified">
                <li class="nav-item">
                  <a class="nav-link active" href="#">레시피</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">챌린지</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">식단코칭</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">매거진</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" href="#">마이페이지</a>
                  </li>
              </ul>
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
        

        <footer class="jumbotron text-center bg-light" style="padding: 1rem 1rem" >
            <div id="f_1">
                <a href="">회사소개</a> | 
                <a href="">광고문의</a> | 
                <a href="">개인정보처리방침</a> | 
                <a href="">이용약관</a>  |
                <a href="">고객센터</a>
            </div>
            <br>
            <div id="f_2">Copyright © 2021 밥조Inc.All Right Reserved</div>
        </footer>
    </div>
</body>
</html>