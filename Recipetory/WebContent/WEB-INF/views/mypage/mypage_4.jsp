<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>마이페이지</title>
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
                <table id="tb_userInfo">
                    <tr>
                        <td>아이디</td>
                        <td>abcd123</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>비밀번호</td>
                        <td><a href="./pwdUpdate">변경</a></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>이메일</td>
                        <td>abcd123@korea.com</td>
                        <td><a href="./emailUpdate">변경</a></td>
                    </tr>
                    <tr>
                        <td>휴대전화</td>
                        <td>010 - 0000 - 0000</td>
                        <td><a href="./phoneUpdate">변경</a></td>
                    </tr>
                </table>
                <br><br><br><br><br>
                <div id="d_m" style="margin-right:10px"><a href="./delete">회원 탈퇴</a></div>
            </div>
        </section>
    </div>
<div style="margin-top:100px"></div>
<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>