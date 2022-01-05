<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>휴대전화 수정</title>
    <link rel="stylesheet"  href="${pageContext.request.contextPath}/css/mypage.css">
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<body>
<%@ include file="/WEB-INF/views/common/header.jsp"%>

    <div id="wrap_m">
        <section id="section_m">
            <div id="category_m">
                <br><a href="./mypage">프로필</a><br><br>
                <a href="./mypage2">나중에 먹을 것</a><br><br>
                <a href="./mypage3">작성한 글 / 댓글 관리</a><br><br>
                <a href="./mypage4">회원 정보 수정</a><br><br>
            </div>
            <div id="content_userInfo_m">
                <br><br><br><br><br><br>

				<form action="updatePhone" method="post">
                <table id="tb_userInfo">
                    <tr>
                        <td>${loginUser.userPhone}</td>
                    </tr>
                    <tr>
                        <td><input style="width: 300px;" type="tel" name="userPhone" id="userPhone" class="userPhone" placeholder="변경된 휴대전화 번호를 입력해 주세요."></td>
                    </tr>
                    <tr>
                        <td><button type="submit">변경</button></td>
                    </tr>
                    
                    </table>
				</form>
				

                <br><br><br><br><br>

            </div>
        </section>
    </div>
<div style="margin-top:100px"></div>
<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>