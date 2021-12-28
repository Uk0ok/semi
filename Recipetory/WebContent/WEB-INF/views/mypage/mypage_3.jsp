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
<link rel="stylesheet" href="./mypage.css">

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
            <div id="content_mb_m">
            	<br>
                <table id="tb_mb" class="table-hover table-striped">
                    <tr>
                        <th><input type="checkbox"></th>
                        <th></th>
                        <th>작성일</th>
                        <th>글 제목</th>
                        <th>조회수</th>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>1</td>
                        <td>2021.12.22</td>
                        <td>제목</td>
                        <td>0</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>2</td>
                        <td>2021.12.00</td>
                        <td>제목</td>
                        <td>0</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>3</td>
                        <td>2021.12.00</td>
                        <td>제목</td>
                        <td>0</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>4</td>
                        <td>2021.12.00</td>
                        <td>제목</td>
                        <td>0</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>5</td>
                        <td>2021.12.00</td>
                        <td>제목</td>
                        <td>0</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>6</td>
                        <td>2021.12.00</td>
                        <td>제목</td>
                        <td>0</td>
                    </tr>
                </table>
                <br>
                <a href="">1</a>
                <div id="d_m" style="margin-right:10px"><button>삭제</button></div>
                
                <hr>
                
                <table id="tb_mb" class="table-hover table-striped">
                    <tr>
                        <th><input type="checkbox"></th>
                        <th></th>
                        <th>작성일</th>
                        <th>댓글 내용</th>
                        <th>글 제목</th>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>1</td>
                        <td>2021.12.22</td>
                        <td>내용</td>
                        <td>제목</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>2</td>
                        <td>2021.12.00</td>
                        <td>내용</td>
                        <td>제목</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>3</td>
                        <td>2021.12.00</td>
                        <td>내용</td>
                        <td>제목</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>4</td>
                        <td>2021.12.00</td>
                        <td>내용</td>
                        <td>제목</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>5</td>
                        <td>2021.12.00</td>
                        <td>내용</td>
                        <td>제목</td>
                    </tr>
                    <tr>
                        <td><input type="checkbox"></td>
                        <td>6</td>
                        <td>2021.12.00</td>
                        <td>내용</td>
                        <td>제목</td>
                    </tr>
                </table>
                <br>
                <a href="">1</a>
                <div id="d_m" style="margin-right:10px"><button>삭제</button></div>
                
            </div>
        </section>
    </div>
<div style="margin-top:30px"></div>
<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>