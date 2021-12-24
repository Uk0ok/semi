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
    .wrap{
    width:100%;
    height:800px;
    margin:auto;
    }

    #h_head {
        padding-top: 20px;
        padding-left: 100px;
    }

    #h_title {
        width: 250px;
    }

    #m_title{
        height: 400px;
        padding: 20px;
        border: 1px solid black;
        margin: 30px;
    }
    
    #m_title_1{
        border: 1px solid red;
        height: 100%;
        width: 100%;
        margin: 0 auto;
    }
    .col-sm-3{
        width: 100%;
        height: 200px;
        border: 1px solid darkorange;
    }
</style>
<body>
    <div class="wrap">
        <header>
            <div id="h_head" class="container-fluid login01" style="margin-bottom:0">
                <img id="h_title" src="../img/recipeBoard/logo.png" >
                
                    <div id="login_search" align="right">
                    
                        <a href="#">로그인</a>
                        <a href="#">회원가입</a>
                    </div>

                <div id="h_search" align="right">
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

        <body>
            <div>
                <div>
                    <p align="middle" style="margin-top: 20px;">
                        <iframe width="560" height="315" src="https://www.youtube.com/embed/dfoYekMr1lw?start=3" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                        <iframe width="560" height="315" src="https://www.youtube.com/embed/SJ1ZxX2hN00?start=3" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                        <iframe width="560" height="315" src="https://www.youtube.com/embed/2Xv6cIhtyno?start=3" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    </p>
                    <div class="row" id="m_title">
                        <div class="col-sm-6">
                            <div id="m_title_1">ddd</div>
                        </div>
                        <div class="col-sm-6" style="border: 1px solid black">
                            <table class="table table-hover">
                                <thead>
                                <tr>
                                    <th>주요 메거진 뉴스</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>밥</td>
                                </tr>
                                <tr>
                                    <td>식빵</td>
                                </tr>
                                <tr>
                                    <td style="width: 100%;">냠냠</td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                <div id="body_1">
                    <div class="container-fluid mt-3">
                        <div class="row" style="border: 1px solid black; margin: 15px;">
                        <div class="col-sm-3">메거진</div>
                        <div class="col-sm-3">메거진</div>
                        <div class="col-sm-3">메거진</div>
                        <div class="col-sm-3">메거진</div>
                        </div>
                    </div>
                    <div class="container-fluid mt-3">
                        <div class="row" style="border: 1px solid black; margin: 15px;">
                        <div class="col-sm-3">메거진</div>
                        <div class="col-sm-3">메거진</div>
                        <div class="col-sm-3">메거진</div>
                        <div class="col-sm-3">메거진</div>
                        </div>
                    </div>
                </div>

                </div>
            </div>
            <p align="middle">
            <button type="button" class="btn btn-outline-dark"><</button>
            <button></button>
            <button></button>
            <button></button>
            <button></button>
            <button type="button" class="btn btn-outline-dark">></button>
            </p>
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