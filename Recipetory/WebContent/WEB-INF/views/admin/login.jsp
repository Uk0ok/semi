<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="/WEB-INF/views/common/w3s.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin_login</title>

<style>

#login_form {
    width: 300px;
    height:150px;
    margin: 150px auto;
}

input {
    width: 70%;
    height: 30%;
    box-sizing: border-box;
    float: left;
}

.btn {
    background-color: rgb(175, 187, 175); 
    width: 30%;
    height: 60%;
}

</style>
</head>
<body>

     <form id="login_form" action="admin" method="post">
     	<h6>관리자 페이지</h6>
	    <input type="text" name="adminId" placeholder="아이디" required>
	    <input type="password" name="adminPwd" placeholder="비밀번호" required>
	    <button class="btn btn-light" "type="submit">로그인</button>
     </form>

</body>
</html>