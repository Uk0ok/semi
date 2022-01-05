<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>레시피 게시물 수정 페이지</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<style>
a {
	text-decoration: none;
	color: inherit;
}

.board_list_wrap {
	padding: 50px;
	margin-left: 18%;
	margin-right: 18%;
}

.board_list_head, .board_list_body .item {
	padding: 10px 0;
	font-size: 0;
}

.board_list_head {
	border-top: 2px solid green;
	border-bottom: 1px solid #ccc;
}

.writing-title {
	text-align: left;
}

.writing-area1 {
	text-align: left;
}

.writing-area2 {
	text-align: left;
}

.writing-area3 {
	text-align: left;
}

.writing-area4 {
	text-align: left;
}

.writing-area5 {
	text-align: left;
}

.textarea_uk {
	width: 60%;
	resize: none;
}

.write {
	position: relative;
	left: 1050px;
}
</style>

<body>
	<%@ include file="/WEB-INF/views/common/header.jsp"%>

	<div class="wrap">
		<div class="board_list_wrap">
			<form action="modifyRecipe" method="POST">
				<div class="board_list">
					<div class="board_list_head">
						<span>
							<h4 style="text-align:center;">레시피 수정하기</h4>
						</span>

					</div>
					<br> <input type="hidden" name="rpostNo"
						value="${viewRecipe.rpostNo}">
					<div class="writing-title">
						<h5>제목</h5>
						<input type="text" class="form-control" name="recipeName">
					</div>
					<br>
					<div class="add-ingredients">
						<h5>재료정보</h5>

						<p style="color: gray;">재료정보를 넣어주세요</p>
						<div>
							<input type="text" name="ingredient1" />
						</div>
						<div>
							<input type="text" name="ingredient2" />
						</div>
						<div>
							<input type="text" name="ingredient3" />
						</div>
						<div>
							<input type="text" name="ingredient4" />
						</div>
						<div>
							<input type="text" name="ingredient5" />
						</div>
					</div>
					</ul>
					<div class="input-error"></div>
				</div>
				<br>
				<div class="writing-area1">
					STEP1
					<textarea id="textnum1" name="recipeProcess1"
						class="form-control textarea_uk" rows="40" cols="10"
						style="height: 100px;"></textarea>
					<div id="test_cnt1">(0 / 4000)</div>
					IMG1 > <input type="file" accept=".jpeg, .jpg, .png, .jfif"
						name="file" class="recipeImg"><br> <br>
				</div>
				<div class="writing-area2">
					STEP2
					<textarea id="textnum2" name="recipeProcess2"
						class="form-control textarea_uk" rows="40" cols="10"
						style="height: 100px;"></textarea>
					<div id="test_cnt2">(0 / 4000)</div>
					IMG2 > <input type="file" accept=".jpeg, .jpg, .png, .jfif"
						name="file" class="recipeImg"><br> <br>
				</div>
				<div class="writing-area3">
					STEP3
					<textarea id="textnum3" name="recipeProcess3"
						class="form-control textarea_uk" rows="40" cols="10"
						style="height: 100px;"></textarea>
					<div id="test_cnt3">(0 / 4000)</div>
					IMG3 > <input type="file" accept=".jpeg, .jpg, .png, .jfif"
						name="file" class="recipeImg"><br> <br>
				</div>
				<div class="writing-area4">
					STEP4
					<textarea id="textnum4" name="recipeProcess4"
						class="form-control textarea_uk" rows="40" cols="10"
						style="height: 100px;"></textarea>
					<div id="test_cnt4">(0 / 4000)</div>
					IMG4 > <input type="file" accept=".jpeg, .jpg, .png, .jfif"
						name="file" class="recipeImg"><br> <br>
				</div>
				<div class="writing-area5">
					STEP5
					<textarea id="textnum5" name="recipeProcess5"
						class="form-control textarea_uk" rows="40" cols="10"
						style="height: 100px;"></textarea>
					<div id="test_cnt5">(0 / 4000)</div>
					IMG5 > <input type="file" accept=".jpeg, .jpg, .png, .jfif"
						name="file" class="recipeImg"><br> <br>
				</div>
				<div>
					<input type="text" name="thumbnailName" style="width: 300px;">
				</div>

				<a type="button" href="javascript:history.back();"
					class="btn btn-primary write"
					style="background-color: darkolivegreen; border-color: darkolivegreen;">뒤로가기</a>
				<input type="submit" class="btn btn-primary write" value="수정하기"
					style="background-color: darkolivegreen; border-color: darkolivegreen;"></input>
			</form>
		</div>
	</div>
	<script>
				$(function() {
					$(document).ready(function () {
					$('#textnum1').on('keyup', function () {
						$('#test_cnt1').html("(" + $(this).val().length + " / 4000)");

						if ($(this).val().length > 4000) {
							$(this).val($(this).val().substring(0, 4000));
							$('#test_cnt1').html("(4000 / 4000)");
						}
					});
				})
				})
				$(function() {
					$(document).ready(function () {
					$('#textnum2').on('keyup', function () {
						$('#test_cnt2').html("(" + $(this).val().length + " / 4000)");

						if ($(this).val().length > 4000) {
							$(this).val($(this).val().substring(0, 4000));
							$('#test_cnt2').html("(4000 / 4000)");
						}
					});
				})
				})
				$(function() {
					$(document).ready(function () {
					$('#textnum3').on('keyup', function () {
						$('#test_cnt3').html("(" + $(this).val().length + " / 4000)");

						if ($(this).val().length > 4000) {
							$(this).val($(this).val().substring(0, 4000));
							$('#test_cnt3').html("(4000 / 4000)");
						}
					});
				})
				})
				$(function() {
					$(document).ready(function () {
					$('#textnum4').on('keyup', function () {
						$('#test_cnt4').html("(" + $(this).val().length + " / 4000)");

						if ($(this).val().length > 4000) {
							$(this).val($(this).val().substring(0, 4000));
							$('#test_cnt4').html("(4000 / 4000)");
						}
					});
				})
				})
				$(function() {
					$(document).ready(function () {
					$('#textnum5').on('keyup', function () {
						$('#test_cnt5').html("(" + $(this).val().length + " / 4000)");

						if ($(this).val().length > 4000) {
							$(this).val($(this).val().substring(0, 4000));
							$('#test_cnt5').html("(4000 / 4000)");
						}
					});
				})
				})
			</script>

	<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>

</html>