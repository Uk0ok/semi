<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>

<style>

body{
    background-color: cornsilk;
    
}

#login_form {
    width: 300px;
    height: 120px;
    margin: auto;
    margin-top: 300px;
}

input {
    width: 65%;
    height: 50%;
    box-sizing: border-box;
    float: left;
}

#btn {
    background-color: rgb(175, 187, 175);
    color: white;
    border: 1px solid gray;
    font-size: 1.2em;
    font-weight: bold;
    width: 35%;
    height: 100%;
}

</style>
</head>
<body>
	
	
     <form id="login_form" action="admin" method="post">
	     <input type="text" name="adminId" placeholder="아이디" required>
	     <input type="password" name="adminPwd" placeholder="비밀번호" required>
	     <button id=btn type="submit">로그인</button>
     </form>
     
     <% 
     	if (request.getSession().getAttribute("loginUser") == null) {
     		out.println("<script>alert('아이디, 패스워드를 다시 확인해주세요.')</script>");
     	}
     %>
     
  
</body>
</html>