<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>탈퇴 완료</title>
</head>
<body>
<% request.getSession().invalidate(); %>
	<h1>탈퇴 완료</h1>
</body>
</html>