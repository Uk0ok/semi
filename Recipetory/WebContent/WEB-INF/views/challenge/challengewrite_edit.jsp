<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>challengewrite edit</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 부트스트랩3 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- 커스텀 CSS -->
<link href="../resources/css/boardStyle.css" rel="stylesheet" type="text/css" media="screen">
<!-- 네이버 스마트 에디터 2 -->
<script type="text/javascript" src="../resources/js/naver_smart_editor2/js/service/HuskyEZCreator.js" charset="utf-8"></script>
<!-- boardCRUD.js -->
<script type="text/javascript" src="../resources/js/boardCRUD.js"></script>
</head>

<style>
	#number{
		width: 100%;

	}
</style>

<body>
	<%@ include file= "/WEB-INF/views/common/header.jsp" %>

	<div class="container-fluid text-center">
		<!-- 그리드 분배 9, 3-->
		<div class="row">
			<!-- 메인 -->
			<div class="col-sm-9 text-left">
				<h1>챌린지 게시판 리뷰 수정</h1>
				<div class="row">
					<div class="panel-group">
						<div class="panel panel-default">
							<!-- 작성글 헤더(글 제목, 글 정보) -->
							<div class="panel-heading">
								<h4>글 제목</h4>
							</div>
							<!-- 작성글 바디(글 내용) -->
							<div class="panel-body">
								<div class="well">
									<p>기존 글 내용</p>
								</div>
								<!-- 글 작성 폼 -->
								<div class="row">
									<form id="update" action="update" method="post">
										<!-- hidden value -->
										<input type="hidden" id="number" name="number" value="${u_content.b_num}">
										<input type="hidden" id="writer" name="writer" value="${u_content.b_writer}">
										<div class="input-group">
											<span class="input-group-addon">
												<i class="glyphicon glyphicon-user"></i>
											</span>
											<input readonly id="id" type="text" class="form-control" name="id" value="${login_session.u_id}">
										</div>
										<div class="input-group">
											<span class="input-group-addon">제목</span>
											<input id="title" type="text" class="form-control" name="title" placeholder="글 제목" value="${u_content.b_title}">
										</div>
										<!-- 네이버 스마트 에디터 -->
										<textarea name="content" id="content" rows="10" cols="128">${u_content.b_content}</textarea>
										<button id="deleteSubmit" type="button" class="btn btn-danger">글 삭제하기</button>
										<button id="updateSubmit" type="button" class="btn btn-success pull-right">글 수정하기</button>
									</form>
								</div>
							</div>
							
						</div>
					</div>
				</div>
				<!-- 글목록 버튼 -->
				<button onclick="location.href='../index?page=${page}&perPageNum=${perPageNum}'" type="button" class="btn btn-primary pull-right">챌린지 목록</button>
			</div>
			
		</div>

	</div>

	<%@ include file= "/WEB-INF/views/common/footer.jsp" %>

</body>

</html>