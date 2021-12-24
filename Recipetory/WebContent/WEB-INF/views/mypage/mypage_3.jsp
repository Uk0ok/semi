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
    #h_head {
        padding-top: 20px;
        padding-left: 100px;
    }

    #h_title {
        width: 250px;
    }

    section {
        width: 1000px;
        margin-right: auto;
        margin-left: auto;
    }
    
</style>
<body>
    <div id="wrap">
        <header>
            <div id="h_head" class="container-fluid login01" style="margin-bottom:0">
                <img id="h_title" src="../img/recipeBoard/logo.png">
                
                    <div id="login_search">
                    
                        <a href="#">로그인</a>
                        <a href="#">회원가입</a>
                    </div>

                <div id="h_search">
                    <form id="search_form">
                        <input type="search" name="search" placeholder="레시피찾기">
                        <button type="submit"><img src="../img/recipeBoard/img.jpg" width="10px"></button>
                    </form>
                </div>
            </div>
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

    <div id="wrap_m">
        <section id="section_m">
            <div id="category_m">
                <br><a href="./mypage_1.jsp">프로필</a><br><br>
                <a href="./mypage_2.jsp">나중에 먹을 것</a><br><br>
                <a href="./mypage_3.jsp">작성한 글 / 댓글 관리</a><br><br>
                <a href="./mypage_4.jsp">회원 정보 수정</a><br><br>
            </div>
            <div id="content_mb_m">
            	<br>
                <table id="tb_mb" class="table-hover table-striped">
                    <tr>
                        <th><input type="checkbox"></th>
                        <th></th>
                        <th>작성일</th>
                        <th>글 제목</th>
                        <th>조회수</th>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>1</td>
                        <td>2021.12.22</td>
                        <td>제목</td>
                        <td>0</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>2</td>
                        <td>2021.12.00</td>
                        <td>제목</td>
                        <td>0</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>3</td>
                        <td>2021.12.00</td>
                        <td>제목</td>
                        <td>0</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>4</td>
                        <td>2021.12.00</td>
                        <td>제목</td>
                        <td>0</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>5</td>
                        <td>2021.12.00</td>
                        <td>제목</td>
                        <td>0</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>6</td>
                        <td>2021.12.00</td>
                        <td>제목</td>
                        <td>0</td>
                    </tr>
                </table>
                <br>
                <a href="">1</a>
                <div id="d_m"><button>삭제</button></div>
                
                <hr>
                
                <table id="tb_mb" class="table-hover table-striped">
                    <tr>
                        <th><input type="checkbox"></th>
                        <th></th>
                        <th>작성일</th>
                        <th>댓글 내용</th>
                        <th>글 제목</th>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>1</td>
                        <td>2021.12.22</td>
                        <td>내용</td>
                        <td>제목</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>2</td>
                        <td>2021.12.00</td>
                        <td>내용</td>
                        <td>제목</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>3</td>
                        <td>2021.12.00</td>
                        <td>내용</td>
                        <td>제목</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>4</td>
                        <td>2021.12.00</td>
                        <td>내용</td>
                        <td>제목</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>5</td>
                        <td>2021.12.00</td>
                        <td>내용</td>
                        <td>제목</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>6</td>
                        <td>2021.12.00</td>
                        <td>내용</td>
                        <td>제목</td>
                    </tr>
                </table>
                <br>
                <a href="">1</a>
                <div id="d_m"><button>삭제</button></div>
                
            </div>
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