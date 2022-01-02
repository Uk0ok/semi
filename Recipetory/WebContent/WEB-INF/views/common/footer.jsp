<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Footer</title>

<style>
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

	<%@ include file="/WEB-INF/views/common/w3s.jsp"%>
	
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