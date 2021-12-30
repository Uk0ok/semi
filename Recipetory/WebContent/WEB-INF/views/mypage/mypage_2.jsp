<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
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

    <div id="wrap_m">
        <section id="section_m">
            <div id="category_m">
                <br><a href="./mypage">프로필</a><br><br>
                <a href="./mypage2">나중에 먹을 것</a><br><br>
                <a href="./mypage3">작성한 글 / 댓글 관리</a><br><br>
                <a href="./mypage4">회원 정보 수정</a><br><br>
            </div>
            <div id="content_scrap_m">
                <div id="content_scrap_m_1">
                <br>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label><br><br>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label><br><br>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label>
                <label style="margin:10px"><input style="position:absolute" id="img_cb" type="checkbox"><img id="img_scrap" src="./img/mypageBoard/salad.jpg" alt=""><br>스크랩</label><br><br>
                
                <a href="">1</a>
                <br>
                </div>
                <label style="margin:10px"><pre><input type="checkbox"> 전체 선택 </label><button>삭제</button></pre>
            </div>
            <!-- <div id="content_3_m">

            </div> -->
        </section>
    </div>
<div style="margin-top:100px"></div>
<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>