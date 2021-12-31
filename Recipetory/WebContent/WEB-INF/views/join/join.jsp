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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>

<body>
	<h1>레시피토리 회원가입</h1>
    <br><br>

    <form action="join" method="post" enctype="multipart/form-data">
    <table id="join_tb">
        <tr>
            <td>아이디</td>
            <td><input type="text" name="userId" id="userId" size="30"
                maxlength="10" placeholder="5~10자 사이의 영문, 숫자" required></td>
        </tr>
        <tr>
            <td>닉네임</td>
            <td><input type="text" name="userNickname" id="userNickname" size="30"
                maxlength="10" placeholder="2~10자 사이(띄어쓰기, 특수문자 불가)" required></td>
        </tr>
        <tr>
            <td>비밀번호</td>
            <td><input type="password" name="userPwd1" id="userPwd1" size="30" maxlength="50"
                placeholder="영문, 숫자, 특수문자 포함 8자 이상" required></td>
        </tr>
        <tr>
            <td>비밀번호 확인</td>
            <td><input type="password" name="userPwd2" id="userPwd2" size="30" maxlength="50" required></td>
        </tr>
        <tr>
            <td>이메일</td>
            <td><input type="email" name="userEmail" id="userEmail" size="30" maxlength="50" required></td>
        </tr>
        <tr>
            <td>휴대전화</td>
            <td><input type="tel" name="userPhone" id="userPhone" size="30" maxlength="11" required>
            <!-- <button id="p_a">인증번호 전송</button></td> -->
        </tr>
        <!-- <tr>
            <td>인증번호</td>
            <td><input type="text" name="" id="" size="30" maxlength="6" required></td>
        </tr> -->
    </table>
        <br><br>

            <div id="check"></div>
            <label><input type="checkbox">개인정보 수집 및 이용 동의 (필수)</label>
            <br><br><br>
            <div id="check"></div>
            <label><input type="checkbox">레시피토리 이용약관 동의 (필수)</label>
            <br><br><br><br><br><br>
            <button id="submit" type="submit" onclick="return validate();">회원가입</button>
            <br><br><br><br><br><br>
        </form>

    <script>
        function validate() {
            let userId = document.getElementById('userId').value;
            let userNickname = document.getElementById('userNickname').value;
            let userPwd1 = document.getElementById('userPwd1').value;
            let userPwd2 = document.getElementById('userPwd2').value;
            let email = document.getElementById('userEmail').value;
            let phone = document.getElementById('userPhone').value;

            // 영문 소문자, 숫자 5 ~ 10자
            if(!(/^[a-z0-9]{5,10}$/.test(userId))) {
                alert('아이디를 다시 입력해 주세요.');
                
                return false;
            }
            
            // 닉네임 검사
            // 영어, 한글, 숫자 2 ~ 10자
            if(!(/^[a-zA-Z0-9가-힣]{2,10}$/.test(userNickname))) {
                alert('닉네임을 다시 입력해 주세요.');
                
                return false;
            }
            
            // 영문, 숫자, 특수문자 포함하여 8자 이상
            if(!(/^([0-9].*[!,@,#,^,&,*,(,)])|([!,@,#,^,&,*,(,)].*[0-9])|([A-Za-z]){8,}$/.test(userPwd1))) {
                alert('비밀번호를 다시 입력해 주세요.');
                
                return false;
            }

            // 비밀번호 확인 검사
            if(userPwd1 !== userPwd2) {
                alert("동일한 비밀번호 값을 입력해 주세요.")
                document.getElementById('userPwd2').value = '';
                document.getElementById('userPwd2').focus();

                return false;
            }

            // 이메일
            if(!(/^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/.test(email))) {
                alert('이메일을 다시 입력해 주세요.');
                
                return false;
            }

            if(!(/^[0-9]{2,11}$/.test(phone))) {
                alert('전화번호를 다시 입력해 주세요.');
                
                return false;
            }
        }
    </script>
</body>
</html>