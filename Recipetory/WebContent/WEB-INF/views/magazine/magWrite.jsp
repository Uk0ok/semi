<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>매거진 게시글 작성</title>
<style>
* {
	margin: 4px 0;
}

.controller {
	padding: 25px 0;
	margin: auto;
	width: 840px;
}

#wriTitle{
	text-align: center;
	background-color: rgb(100, 100, 100);
	width: 800px;
	height: 20px;
	padding: 12px 0;
	color: white;
}
table {
	width: 840px;
	margin: 25px 0;
	padding: 20px;
	border-collapse: collapse;
}

#category {
	width: 100px;
	height: 30px;
}

#title {
	width: 700px;
	height: 24px;
}

textarea {
	width: 800px;
	height: 400px;
}

.button {
	width: 100px;
	padding: 5px 12px;
	border: none;
	background-color: rgb(150, 60, 60);
	color: white;
}

button {
	padding: 5px 12px;
	background-color: white;
	border-color: rgb(180, 180, 180);
	border-width: 1px;
}

textarea {
	resize: none;
}
</style>
</head>
<body>
	
	<div class="controller">
	<div id="wriTitle"><b>게시글 작성</b></div>
		<form action="mwrite" method="post">
			<table>
				<tr>
					<td>제목 : </td>
					<td><input type="text" id="postName" name="postName" required/>
					</td>
				</tr>
				<tr>
					<td colspan="2"><textarea rows="12" cols="50"
							name="postContent" id="postContent" required></textarea></td>
				</tr>
				<tr>
				<td> 관리자번호 :  </td> 
				<td> <input type="text" id="adminNo" name="adminNo" placeholder="관리자번호를 입력해주세요" required> </td>
				</tr>
				<tr>
					<td align="center"><input type="submit" value="작성" class="button"></td>
					<td align="center"><input type="reset" value="내용 초기화" class="button"></td>
				</tr>
			</table>
		</form>
		<div>
			<a href="mMag">
				<button>메거진 게시판</button>
			</a>
		</div>
		<div>
			<a href="admin">
				<button>관리자 페이지</button>
			</a>
		</div>
	</div>
</body>
</html>