<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <title>레시피 게시판</title>
</head>
<style>
    .jaeuk1{-ms-flex:0 0 15%;flex:0 0 15%;max-width:15%;position:relative;width:100%;padding-right:15px;padding-left:15px}
    .updown{border: 1px solid black; width: 0.1px; height: 100%;}

    
</style>
<body>
    <div class="jumbotron text-center" style="margin-bottom:0">
        <h1>Recipetory</h1>
        <p>나만의 건강 레시피</p> 
      </div>
    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
        <!-- Brand/logo -->
        <a class="navbar-brand" href="#">
          <img src="../img/recipeBoard/img.jpg" alt="logo" style="width:40px;">
        </a>
        
        <!-- Links -->
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="#">레시피 게시판</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">메거진 게시판</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">챌린지 게시판</a>
            </li>
        </ul>
        </nav>
        <div class="board" style="margin-top:30px">
            <div class="jaeuk1">
                <h4>최근 본 레시피</h4>
                <p>Some text..</p>
                <p>Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>
    
            </div>
            <div class="updown"></div>
            <div class="col-sm-8">
                <h2>TITLE HEADING</h2>
                <h5>Title description, Dec 7, 2017</h5>
                <div class="fakeimg">Fake Image</div>
                <p>Some text..</p>
                <p>Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>
                <br>
                <h2>TITLE HEADING</h2>
                <h5>Title description, Sep 2, 2017</h5>
                <div class="fakeimg">Fake Image</div>
                <p>Some text..</p>
                <p>Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>
              </div>
        </div>
</body>
</html>