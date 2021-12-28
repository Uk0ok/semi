<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style>
body {
    background-color: cornsilk;
    text-align: center;
}

input {
    height: 25px;
}

div {
    margin: auto;
}

#join_tb{
    width: 450px;
    height: 450px;
    margin: auto;
}

#p_a {
    height: 30px;
    background-color: rgb(175, 187, 175);
}

#submit {
    width: 300px;
    height: 50px;
    font-size: 1.5em;
    color: white;
    background-color: rgb(175, 187, 175);
}

#check {
    width: 600px;
    height: 200px;
    overflow-y: scroll;
    background-color: lightgray;
}

    </style>
</head>

<body>
	<h1>레시피토리 회원가입</h1>
    <br><br>

    <table id="join_tb">
        <tr>
            <td>아이디</td>
            <td><input type="text" name="userId" id="userId" size="30"
                maxlength="10" placeholder="5~10자 사이의 영문, 숫자" required></td>
        </tr>
        <tr>
            <td>닉네임</td>
            <td><input type="text" name="userNickname" id="userNickname" size="30"
                maxlength="10" placeholder="2~10자 사이(띄어쓰기 불가)" required></td>
        </tr>
        <tr>
            <td>비밀번호</td>
            <td><input type="password" name="userPwd1" id="userPwd1" size="30"
                placeholder="영문, 숫자, 특수문자 포함 8자 이상" required></td>
        </tr>
        <tr>
            <td>비밀번호 확인</td>
            <td><input type="password" name="userPwd2" id="userPwd2" size="30" required></td>
        </tr>
        <tr>
            <td>이메일</td>
            <td><input type="email" name="email" id="email" size="30" required></td>
        </tr>
        <tr>
            <td>휴대전화</td>
            <td><input type="tel" name="phone" id="phone" size="14" required>
            <button id="p_a">인증번호 전송</button></td>
        </tr>
        <tr>
            <td>인증번호</td>
            <td><input type="text" name="" id="" size="30" required></td>
        </tr>
    </table>
        <br><br>

            <div id="check"></div>
            <label><input type="checkbox">개인정보 수집 및 이용 동의 (필수)</label>
            <br><br><br>
            <div id="check"></div>
            <label><input type="checkbox">레시피토리 이용약관 동의 (필수)</label>
            <br><br><br><br><br><br>
            <input id="submit" type="submit" value="회원가입" onclick="return validate();">
            <br><br><br><br><br><br>



    <script>
        function validate() {
            let userId = document.getElementById('userId').value;
            let userNickname = document.getElementById('userNickname').value;
            let userPwd1 = document.getElementById('userPwd1').value;
            let userPwd2 = document.getElementById('userPwd2').value;
            let email = document.getElementById('email').value;

            // 영문 소문자, 숫자 포함하여 5 ~ 10자
            if(!(/^[a-z][a-z\d]{4,9}$/.test(userId))) {
                alert('유효한 아이디를 입력하세요.');
                
                return false;
            }
            
            // 닉네임 검사
            // 한글로만 2 ~ 10자
            if(!(/^{2,10}$/.test(userNickname))) {
                alert('유효한 닉네임을 입력하세요.');
                
                return false;
            }
            
            // 영문, 숫자, 특수문자 포함하여 8자 이상 // 특수문자 아직 구현안함
            if(!(/^[\w!@#$%^&*-]{8,}$/.test(userPwd1))) {
                alert('유효한 비밀번호를 입력하세요.');
                
                return false;
            }

            // 비밀번호 확인 검사
            if(userPwd1 !== userPwd2) {
                alert("동일한 비밀번호 값을 입력하세요.")
                document.getElementById('userPwd2').value = '';
                document.getElementById('userPwd2').focus();

                return false;
            }

            // 이메일
            if(!(/^[\w]+@[\w]+\.[A-Za-z\.]{2,6}$/.test(email))) {
                alert('유효한 이메일을 입력하세요.');
                
                return false;
            }
        }
    </script>
</body>
</html>