<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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

                <form action="nicknameUpdate" method="post">
    <div id="wrap_m">
        <section id="section_m">
            <div id="category_m">
                <br><a href="./mypage">프로필</a><br><br>
                <a href="./mypage2">나중에 먹을 것</a><br><br>
                <a href="./mypage3">작성한 글 / 댓글 관리</a><br><br>
                <a href="./mypage4">회원 정보 수정</a><br><br>
            </div>
            <div id="content_profile_m">
                <br><img id="profile_m" src="./img/mypageBoard/cake.jpg" alt="">
                <br><br><button>사진 수정</button>
                <br><br><p id="nickname_m"><input style="width: 300px;" type="text" name="userNickname" id="userNickname" class="userNickname" placeholder="변경할 닉네임 입력">
                        <input type="hidden" name="userId" id="userId" class="userId" value="${loginUser.userId}"></p>
                <button type="submit">닉네임 수정</button>
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
                        <td>21.12.25 ~ 22.12.25</td>
                        <td>챌린지 제목 1</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.12.25 ~ 22.12.25</td>
                        <td>챌린지 제목 2</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.12.25 ~ 22.12.25</td>
                        <td>챌린지 제목 3</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.12.25 ~ 22.12.25</td>
                        <td>챌린지 제목 4</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.12.25 ~ 22.12.25</td>
                        <td>챌린지 제목 5</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.12.25 ~ 22.12.25</td>
                        <td>챌린지 제목 6</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.12.25 ~ 22.12.25</td>
                        <td>챌린지 제목 7</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.12.25 ~ 22.12.25</td>
                        <td>챌린지 제목 8</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.12.25 ~ 22.12.25</td>
                        <td>챌린지 제목 9</td>
                        <td>0%</td>
                    </tr>
                    <tr>
                        <td>21.12.25 ~ 22.12.25</td>
                        <td>챌린지 제목 10</td>
                        <td>0%</td>
                    </tr>
                </table>
            </div>
        </section>
    </div>
            </form>
<div style="margin-top:100px"></div>
<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>