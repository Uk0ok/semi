<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>마이페이지</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="./mypage.css">

<style>
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

    section {
        width: 1000px;
        margin-right: auto;
        margin-left: auto;
    }
    
    #wrap_m * {
    /* border: 1px solid black; */
    box-sizing: border-box;
    text-align: center;
}

#wrap_m {
    width: 1200px;
    height: 600px;
    margin: auto;
}

#section_m {
    height: 100%;
}

#section_m>div {
    float: left;
}

#category_m {
    width: 19%;
    height: 40%;
    margin: 10px;
    border: 2px solid gray;
}

#content_profile_m {
    width: 29%;
    height: 70%;
    margin: 10px;
    margin-right: 0%;
    margin-left: 0%;
    border: 2px solid gray;
    border-right: none;
}

#content_challenge_m {
    width: 49%;
    height: 70%;
    margin: 10px;
    margin-right: 0%;
    margin-left: 0%;
    border: 2px solid gray;
    border-left: none;
}

#profile_m {
    width: 200px;
    height: 200px;
}

#nickname_m {
    font-size: 1.5em;
}

#challenge_m {
    font-size: 1.3em;
}

#challenge_table_m {
    width: 370px;
    margin: auto;
}

#content_scrap_m {
    width:78%;
    height: 100%;
    margin: 10px;
    margin-right: 0%;
    margin-left: 0%;
    border: 2px solid gray;
    text-align: right;
}

#content_mb_m {
    width:78%;
    height: 100%;
    margin: 10px;
    margin-right: 0%;
    margin-left: 0%;
    border: 2px solid gray;
    text-align: center;
}

#content_userInfo_m {
    width:78%;
    height: 70%;
    margin: 10px;
    margin-right: 0%;
    margin-left: 0%;
    border: 2px solid gray;
    text-align: center;
}

#content_2_scrap_1 {
    text-align: center;
}

#img_scrap {
    width: 100px;
    height: 100px;
}

#tb_mb {
    width: 700px;
    margin: auto;
}

#tb_userInfo {
    width: 400px;
    margin: auto;
}

#d_m {
	text-align: right;
}
</style>
<body>
    <div id="wrap">
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

    <div id="wrap_m">
        <section id="section_m">
            <div id="category_m">
                <br><a href="./mypage">프로필</a><br><br>
                <a href="./mypage2">나중에 먹을 것</a><br><br>
                <a href="./mypage3">작성한 글 / 댓글 관리</a><br><br>
                <a href="./mypage4">회원 정보 수정</a><br><br>
            </div>
            <div id="content_scrap_m">
                <div id="content_scrap_m_1">
                <br>
                <label><input id="img_cb" type="checkbox"><img id="img_scrap" src="/dev/semi/Recipetory/WebContent/img/mypage_img/달.jpg" alt=""><br>스크랩</label>
                <label><input id="img_cb" type="checkbox"><img id="img_scrap" src="/dev/semi/Recipetory/WebContent/img/mypage_img/달.jpg" alt=""><br>스크랩</label>
                <label><input id="img_cb" type="checkbox"><img id="img_scrap" src="/dev/semi/Recipetory/WebContent/img/mypage_img/달.jpg" alt=""><br>스크랩</label>
                <label><input id="img_cb" type="checkbox"><img id="img_scrap" src="/dev/semi/Recipetory/WebContent/img/mypage_img/달.jpg" alt=""><br>스크랩</label>
                <label><input id="img_cb" type="checkbox"><img id="img_scrap" src="/dev/semi/Recipetory/WebContent/img/mypage_img/달.jpg" alt=""><br>스크랩</label><br><br>
                <label><input id="img_cb" type="checkbox"><img id="img_scrap" src="/dev/semi/Recipetory/WebContent/img/mypage_img/달.jpg" alt=""><br>스크랩</label>
                <label><input id="img_cb" type="checkbox"><img id="img_scrap" src="/dev/semi/Recipetory/WebContent/img/mypage_img/달.jpg" alt=""><br>스크랩</label>
                <label><input id="img_cb" type="checkbox"><img id="img_scrap" src="/dev/semi/Recipetory/WebContent/img/mypage_img/달.jpg" alt=""><br>스크랩</label>
                <label><input id="img_cb" type="checkbox"><img id="img_scrap" src="/dev/semi/Recipetory/WebContent/img/mypage_img/달.jpg" alt=""><br>스크랩</label>
                <label><input id="img_cb" type="checkbox"><img id="img_scrap" src="/dev/semi/Recipetory/WebContent/img/mypage_img/달.jpg" alt=""><br>스크랩</label><br><br>
                <label><input id="img_cb" type="checkbox"><img id="img_scrap" src="/dev/semi/Recipetory/WebContent/img/mypage_img/달.jpg" alt=""><br>스크랩</label>
                <label><input id="img_cb" type="checkbox"><img id="img_scrap" src="/dev/semi/Recipetory/WebContent/img/mypage_img/달.jpg" alt=""><br>스크랩</label>
                <label><input id="img_cb" type="checkbox"><img id="img_scrap" src="/dev/semi/Recipetory/WebContent/img/mypage_img/달.jpg" alt=""><br>스크랩</label>
                <label><input id="img_cb" type="checkbox"><img id="img_scrap" src="/dev/semi/Recipetory/WebContent/img/mypage_img/달.jpg" alt=""><br>스크랩</label>
                <label><input id="img_cb" type="checkbox"><img id="img_scrap" src="/dev/semi/Recipetory/WebContent/img/mypage_img/달.jpg" alt=""><br>스크랩</label><br>
                <br><br>
                <a href="">1</a>
                <br><br>
                </div>
                <label><pre><input type="checkbox"> 전체 선택 </label><button>삭제</button></pre>
            </div>
            <!-- <div id="content_3_m">

            </div> -->
        </section>
    </div>
    
        <section>
            <div class="container" style="margin-top:30px">
                <div class="row">
                    <div class="col-sm-4">
                      
                    </div>
                    <div class="col-sm-8">
                      
                    </div>
                </div>
            </div>
        </section>

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