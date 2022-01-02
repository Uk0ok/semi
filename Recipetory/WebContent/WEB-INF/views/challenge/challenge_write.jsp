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
	<form action="/challengeview" method="post">
	    <div>제목 <input type="text" name="cpostName" placeholder="제목"></div> <br>
	    <div>종료 날짜 <input type="date" name="challengePeriod" placeholder="제목"></div> <br>
	    <div>첨부파일 <input type="file" name="cthumbnail"></div> <br>
	    <div>내용<textarea name="cont" id="cpostContent" cols="30" rows="10"></textarea></div>
	    <div>
	        <input type="submit" value="등록">
	        <input type="reset" value="취소">
	    </div>
	</form>
	</div>
</div>
</body>
<%@ include file= "/WEB-INF/views/common/footer.jsp" %>
</html>