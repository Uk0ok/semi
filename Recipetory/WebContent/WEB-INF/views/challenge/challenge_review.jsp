<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 화면 최적화 -->
<meta name="viewport" content="width-device-width", initial-scale="1">

<title>리뷰 게시판</title>
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
</style>
</head>
<body>
<%@ include file= "/WEB-INF/views/common/header.jsp" %>
    <div class="board_wrap">
        <div class="board_title">
            <strong>챌린지 리뷰</strong>
        </div>

	<!-- 게시판 메인 페이지 영역 시작 -->
	<div class="container">
		<div class="row">
			<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
				<thead>
					<tr>
						<th style="background-color: #eeeeee; text-align: center;">리뷰 번호</th>
						<th style="background-color: #eeeeee; text-align: center;">제목</th>
						<th style="background-color: #eeeeee; text-align: center;">종료 날짜</th>
						<th colspan="2" style="background-color: #eeeeee; text-align: center;">내용</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<!-- 테스트 코드 -->
						<td>1</td>
						<td>첫 리뷰</td>
						<td>12-30</td>
						<td>리뷰입니다람쥐</td>
					</tr>
				</tbody>
			</table>
			<!-- 글쓰기 버튼 생성 -->
			<a href="./reviewwrite" class="btn btn-primary pull-right">글쓰기</a>
		</div>
	</div>
	<!-- 게시판 메인 페이지 영역 끝 -->
	    <%@ include file= "/WEB-INF/views/common/footer.jsp" %>
</body>
</html>