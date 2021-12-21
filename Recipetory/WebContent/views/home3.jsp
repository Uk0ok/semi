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