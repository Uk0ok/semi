<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>챌린지</title>
<style>
    * {
    margin: 0;
    padding: 0;
    }

    ul, li {
    list-style: none;
    }

    a {
    text-decoration: none;
    color: inherit;
    }

    .board_wrap {
    padding: 50px;
	margin-left: 18%;
	margin-right: 18%;
    }

     .board_title {
    margin-bottom: 30px;
    }

    .board_title strong {
    font-size: 2rem;
    }

    .board_title p {
    margin-top: 5px;
    font-size: 1.4rem;
    }
     .board_write {
    border-top: 2px solid green;
    }
    
    body {
    background-color: cornsilk;
    text-align: center;
	}
	
	input {
	    height: 25px;
	}
	
	div {
	    margin: auto;
	}
	
	#join_tb{
	    width: 450px;
	    height: 450px;
	    margin: auto;
	}
	
	#p_a {
	    height: 30px;
	    background-color: rgb(175, 187, 175);
	}
	
	#submit {
	    width: 300px;
	    height: 50px;
	    font-size: 1.5em;
	    color: white;
	    background-color: rgb(175, 187, 175);
	}
	
	#check {
	    width: 600px;
	    height: 200px;
	    overflow-y: scroll;
	    background-color: lightgray;
	}
</style>
</head>
<%@ include file= "/WEB-INF/views/common/header.jsp" %>
<body>
<div class="board_wrap">
    <div class="board_title">
        <strong>챌린지 게시물 작성</strong>
    </div>
    <br>
    <div class="board_write">
    <br>
   
	<form action="./challengewrite" method="post">
		<div>제목 <input type="text" name="cpostName" placeholder="제목을 입력하세요" maxlength="50" style= "width:800px;"></div>
		<div>종료 날짜 <input type="date" name="challengePeriod"></div>
		<div>첨부파일 <input type="file" name="cthumbnail" size="30"></div>
		<div class="cont">내용</div>
		<div><textarea name="cpostContent" placeholder="내용을 입력하세요" maxlength="2048" style="height:350px; width: 800px;"></textarea></div>
		<div>
			<input type="submit" value="등록">
		</div>
    </form>

	
	</div>
</div>
</body>
<%@ include file= "/WEB-INF/views/common/footer.jsp" %>
</html>