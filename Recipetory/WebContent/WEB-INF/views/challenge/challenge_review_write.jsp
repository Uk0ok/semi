<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>챌린지 리뷰 작성 게시판</title>
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
    .board_view {
        width: 100%;
        border-top: 2px solid green;
    }

	.star{
	  display:inline-block;
	  width: 30px;height: 60px;
	  cursor: pointer;
	}
	.star_left{
	  background: image(./WebContent/img/challengeBoard.star_left.png) no-repeat 0 0; 
	  background-size: 60px; 
	  margin-right: -3px;
	}
	.star_right{
	  background: image(./WebContent/img/challengeBoard.star_right.png) no-repeat -30px 0; 
	  background-size: 60px; 
	  margin-left: -3px;
	}
	.star.on{
	  background-image: image(./WebContent/img/challengeBoard.star_on.png);
	}
</style>
</head>
<body>
<%@ include file= "/WEB-INF/views/common/header.jsp" %>
    <div class="board_wrap">
        <div class="board_title">
            <strong>챌린지 리뷰 작성</strong>
        </div>
	<!-- 게시판 글쓰기 양식 영역 시작 -->
	<div class="container">
		<div class="row">
			<form method="post" action="reviewwriteAction.jsp">
				<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
					<tbody>
						<tr>
							<td><input type="text" class="form-control" placeholder="제목 " name="reviewName" maxlength="50"></td>
						</tr>
						<tr>
							<td><input type="file" class="form-control" name="cthumbnail" maxlength="50"></td>
						</tr>
						<tr>
							<td><textarea class="form-control" placeholder="내용" name="reviewContent" maxlength="2048" style="height: 350px;"></textarea></td>
						</tr>
						
						<div class="star-box">
						  <span class="star star_left"></span>
						  <span class="star star_right"></span>
						
						  <span class="star star_left"></span>
						  <span class="star star_right"></span>
						
						  <span class="star star_left"></span>
						  <span class="star star_right"></span>
						
						 <span class="star star_left"></span>
						 <span class="star star_right"></span>
						
						 <span class="star star_left"></span>
						 <span class="star star_right"></span>
						</div>
					</tbody>
				</table>
				<!-- 글쓰기 버튼 생성 -->
				<input type="submit" class="btn btn-primary pull-right" value="글쓰기">
			</form>
		</div>
	</div>
	<!-- 게시판 글쓰기 양식 영역 끝 -->
	
	<%@ include file= "/WEB-INF/views/common/footer.jsp" %>
</body>
</html></html>