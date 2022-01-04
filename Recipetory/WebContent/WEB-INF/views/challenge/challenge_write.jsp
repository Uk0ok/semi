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
	

     .board_title {

    margin-left: 20%;
    margin-top:20px;
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
   
	<div class="container">
		<div class="row">
			<form action="challengewrite" method="POST">
			<div class="challenge-title"><h5>제목</h5>
				<input type="text" class="form-control" id= "postName" name="postName" placeholder="제목을 입력해주세요.">
			</div>
			
			<br>
			
			<div class="end-date"><h5>종료 날짜</h5>
			<input type="date" id= "challengePeriod" name="challengePeriod">
			</div>
			
			<br>
			
			<div class="file"><h5>첨부 파일</h5>
			<input type="file" accept==".jpeg .jpg, .png" id="thumbnail"  name="thumbNail" class="challengeImg" />
			</div>
			
			<br>
			
			<div class="challenge-content"><h5>내용 입력</h5>
			<textarea id="textnum1" name="recipeProcess1" id="postContent" class="form-control textarea_uk" placeholder="내용을 입력해주세요." rows="40" cols="10" style="height:100px;"></textarea>
			</div>
			
			<br>
			
			<a type="button" href="javascript:history.back();" class="btn btn-primary write"
			style="background-color: darkolivegreen; border-color:darkolivegreen;">뒤로가기</a>
			<input type="submit" class="btn btn-primary write" value="작성하기" style="background-color: darkolivegreen; border-color: darkolivegreen;"></input>
		</div>
		</form>
	</div>
</div>

</body>
<%@ include file= "/WEB-INF/views/common/footer.jsp" %>
</html>