<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>챌린지</title>
    <style>
	* {
    margin: 0;
    padding: 0;
    }

    ul, li {
        list-style: none;
    }

    a {
        text-decoration: none;
        color: inherit;
    }

	.board_wrap {
    padding: 50px;
	margin-left: 18%;
	margin-right: 18%;
    }

    .board_title {
        margin-bottom: 30px;
    }

    .board_title strong {
        font-size: 2rem;
    }

    .board_title p {
        margin-top: 5px;
        font-size: 1.4rem;
    }

    .bt_wrap {
        margin-top: 30px;
        text-align: center;
        font-size: 0;
    }

    .bt_wrap a {
        display: inline-block;
        min-width: 80px;
        margin-left: 10px;
        padding: 10px;
        border: 1px solid #000;
        border-radius: 2px;
        font-size: 1.4rem;
    }

    .bt_wrap a.bt_parti {
        background: #c5d081;
        color: black;
    }
    
    .bt_wrap a.bt_review {
        background: #d2c897;
        color: black;
    }
    
    .bt_wrap a.bt_list {
        background: rgb(175, 187, 175);
        color: black;
    }

    .board_view {
        width: 100%;
        border-top: 2px solid green;
    }

    .board_view .title {
        padding: 20px 15px;
        border-bottom: 1px dashed #ddd;
        font-size: 1.7rem;
    }

    .board_view .info {
        padding: 15px;
        border-bottom: 1px solid #999;
        font-size: 0;
    }

    .board_view .info dl {
        position: relative;
        display: inline-block;
        padding: 0 20px;
    }

    .board_view .info dl:first-child {
        padding-left: 0;
    }

    .board_view .info dl::before {
        content: "";
        position: absolute;
        top: 1px;
        left: 0;
        display: block;
        width: 1px;
        height: 13px;
        background: #ddd;
    }

    .board_view .info dl:first-child::before {
        display: none;
    }

    .board_view .info dl dt,
    .board_view .info dl dd {
        display: inline-block;
        font-size: 1.4rem;
    }

    .board_view .info dl dt {

    }

    .board_view .info dl dd {
        margin-left: 10px;
        color: #777;
    }

    .board_view .cont {
        padding: 15px;
        border-bottom: 1px solid #000;
        line-height: 160%;
        font-size: 1.4rem;
    }

/* css media */
@media (max-width: 1000px) {
    .board_wrap {
        width: 100%;
        min-width: 320px;
        padding: 0 30px;
        box-sizing: border-box;
    }

    .board_view .info dl {
        width: 50%;
        padding: 0;
    }

    .board_view .info dl:nth-child(-n+2) {
        margin-bottom: 5px;
    }

    .board_view .info dl::before {
        display: none;
    }

    .board_view .info dl dt,
    .board_view .info dl dd {
        font-size: 1.1rem;
    }
}
    </style>
</head>
<body>
<%@ include file= "/WEB-INF/views/common/header.jsp" %>
    <div class="board_wrap">
        <div class="board_title">
            <strong>챌린지 소개 게시물</strong>
        </div>
        <div class="board_view_wrap">
            <div class="board_view">
                <div class="title">
                    글 제목
                </div>
                <div class="info">
                    <dl>
                        <dt>번호</dt>
                        <dd>n</dd>
                    </dl>
                    <dl>
                        <dt>글쓴이</dt>
                        <dd>작성자 닉네임</dd>
                    </dl>
                    <dl>
                        <dt>작성일</dt>
                        <dd>YYYY.MM.DD</dd>
                    </dl>
                    <dl>
                        <dt>참여자 수</dt>
                        <dd>nn</dd>
                    </dl>
                </div>
                <div class="cont">
                    글 내용이 들어갑니다<br>
                    글 내용이 들어갑니다<br>
                    글 내용이 들어갑니다<br>
                    글 내용이 들어갑니다<br>
                    글 내용이 들어갑니다<br>
                    글 내용이 들어갑니다<br>
                    글 내용이 들어갑니다<br>
                    글 내용이 들어갑니다
                </div>
            </div>
            <div class="bt_wrap">
            	<a href="./challengereview" class="bt_review">리뷰보기</a>
            	<a href="#" class="bt_parti">참여하기</a>
                <a href="./challenge" class="bt_list">목록으로</a>
            </div>
        </div>
    </div>
    <%@ include file= "/WEB-INF/views/common/footer.jsp" %>
</body>
</html>