<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.reci.join.controller.userDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style>

body {
    background-color: cornsilk;
}

	div, form, input {
    box-sizing: border-box;
}

#login_wrap {
    width: 300px;
    height: 120px;
    margin: auto;
    margin-top: 300px;
}

#login_form {
    height: 80%;
}

#login_form>div {
    height: 100%;
    float: left;
}

#login_form_input {
    width: 65%;
}

#login_form_input>input {
    height: 50%;
    width: 100%;
}

#login_form_submit {
    width: 35%;
}

#login_form_submit>input {
    width: 100%;
    height: 100%;
    font-size: 1.2em;
    font-weight: bold;
}

#login_link {
    height: 20%;
    text-align: center;
    padding: 5px;
}

#login_link>a {
    text-decoration: none;
    color: black;
    font-size: 0.8em;
}
#btn {
    background-color: rgb(175, 187, 175);
    color: white;
    border: 1px solid gray;
}

</style>
</head>
<body>


<!-- <div id="login_wrap">
        <form action="login" id="login_form">
            <div id="login_form_input">
                <input type="text" name="id" placeholder="아이디" required>
                <input type="password" name="pwd" placeholder="비밀번호" required>
            </div>
            <div id="login_form_submit">
                <input id="btn" type="submit" value="로그인">
            </div>
        </form>
        <div id="login_link">
            <a href="join">회원가입</a>
            <!-- <a href="#">아이디 찾기</a>
            <a href="#">비밀번호 찾기</a> -->
        </div>
    </div> -->

    
    <div id="div-main">
        <form action="login" method="post">
            <label>아이디   : </label> <input type="text" name="userId">
            <br>
            <label>비밀번호 : </label> <input type="text" name="userPwd">
            <br>
            <input type="submit" value="로그인">
            <a href="join">회원가입</a>
        </form>
    </div>
    
    
    
    
</body>
</html>