<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>마이페이지</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<body>
<%@ include file="/WEB-INF/views/mypage/mypageStyle.jsp"%>
<%@ include file="/WEB-INF/views/common/header.jsp"%>

    <div id="wrap_m">
        <section id="section_m">
            <div id="category_m">
                <br><a href="./mypage">프로필</a><br><br>
                <a href="./mypage2">나중에 먹을 것</a><br><br>
                <a href="./mypage3">작성한 글 / 댓글 관리</a><br><br>
                <a href="./mypage4">회원 정보 수정</a><br><br>
            </div>
            <div id="content_profile_m">
                <br><img id="profile_m" src="./img/mypageBoard/cat.jpg" alt="">
                <br><br><button>사진 수정</button>
                <br><br><p id="nickname_m">닉네임</p>
                <button>닉네임 수정</button>
            </div>
            <div id="content_challenge_m">
                <br>
                <p id="challenge_m">참여 중인 챌린지</p><br>
                <table id="challenge_table_m" class="table-hover table-striped">
                    <tr>
                        <th>기간</th>
                        <th>챌린지</th>
                        <th>달성률</th>
                    </tr>
                    <tr>
                        <td>21.12.22 ~ 22.01.22</td>
                        <td>챌린지 제목</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.00.00 ~ 22.00.00</td>
                        <td>챌린지 제목</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.00.00 ~ 22.00.00</td>
                        <td>챌린지 제목</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.00.00 ~ 22.00.00</td>
                        <td>챌린지 제목</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.00.00 ~ 22.00.00</td>
                        <td>챌린지 제목</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.00.00 ~ 22.00.00</td>
                        <td>챌린지 제목</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.00.00 ~ 22.00.00</td>
                        <td>챌린지 제목</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.00.00 ~ 22.00.00</td>
                        <td>챌린지 제목</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.00.00 ~ 22.00.00</td>
                        <td>챌린지 제목</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.00.00 ~ 22.00.00</td>
                        <td>챌린지 제목</td>
                        <td>0%</td>
                    </tr>
                </table>
            </div>
        </section>
    </div>
<div style="margin-top:30px"></div>
<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>