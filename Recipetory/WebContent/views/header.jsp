<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        body {
            box-sizing: border-box;
            min-width: 1240px;
            margin: auto;
            background-color: cornsilk;
        }

        header, footer{
            background-color: rgb(175, 187, 175);
        }

        #h_head {
            padding-top: 20px;
            height: 130px;
            width: 1200px;
            margin: 0 auto;
        }

        #h_title {
            width: 200px;
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
    </style>
</head>
<body>
   
    <header>
        <div id="h_head" class="row">
            <div id="h_title" class="col-sm-8">
                <img src="./images/logo.png" alt="logo" width="250px">
            </div>
            <div id="h_content" class="col-sm-4">
                <div id="h_join">
                    <a href="#">로그인</a>
                    <a href="#">회원가입</a>
                </div>

                <div id="h_search">
                    <form id="search_form">
                        <input type="search" name="search" placeholder="레시피찾기">
                        <button type="submit"><img src="./images/search.png" width="10px"></button>
                    </form>
                </div>
            </div>
            
        </div>

        <div id="h_menu" class="container-fluid">  
            <ul id="nav" class="nav nav-tabs nav-justified" width="1200px">
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
        </div>
    </header>
    
</body>
</html>