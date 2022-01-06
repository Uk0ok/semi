<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>탈퇴 완료</title>
<style>
    body {
        text-align: center;
    }
</style>
</head>
<body>
<% request.getSession().invalidate(); %>
<br><br><br>
	<h2>회원 탈퇴가 완료되었습니다.</h2><br>
    <button type="button" onclick="location.href='./home' ">홈으로 이동</button>
</body>
</html>