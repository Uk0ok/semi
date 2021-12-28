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

    html {
    font-size: 10px;
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
    font-size: 3rem;
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

    .bt_wrap a:first-child {
    margin-left: 0;
    }

    .bt_wrap a.on {
    background: rgb(175, 187, 175);
    color: black;
    }

    .board_write {
    border-top: 2px solid green;
    }

    .board_write .title,
    .board_write .info {
    padding: 15px;
    }

    .board_write .info {
    border-top: 1px dashed #ddd;
    border-bottom: 1px solid #000;
    font-size: 0;
    }

    .board_write .title dl {
    font-size: 0;
    }

    .board_write .info dl {
    display: inline-block;
    width: 50%;
    vertical-align: middle;
    }

    .board_write .title dt,
    .board_write .title dd,
    .board_write .info dt,
    .board_write .info dd {
    display: inline-block;
    vertical-align: middle;
    font-size: 1.4rem;
    }

    .board_write .title dt,
    .board_write .info dt {
    width: 100px;
    }

    .board_write .title dd {
    width: calc(100% - 100px);
    }

    .board_write .title input[type="text"],
    .board_write .info input[type="text"],
    .board_write .info input[type="file"],
    .board_write .info input[type="checkbox"],
    .board_write .info input[type="password"] {
    padding: 10px;
    box-sizing: border-box;
    }

    .board_write .title input[type="text"] {
    width: 80%;
    }

    .board_write .cont {
    border-bottom: 1px solid #000;
    }

    .board_write .cont textarea {
    display: block;
    width: 100%;
    height: 300px;
    padding: 15px;
    box-sizing: border-box;
    border: 0;
    resize: vertical;
    }

    /* css media */
    @media (max-width: 1000px) {
    .board_wrap {
        width: 100%;
        min-width: 320px;
        padding: 0 30px;
        box-sizing: border-box;
    }
    .board_write .info dl {
        width: 49%;
    }

    .board_write .info dl:first-child {
        margin-right: 2%;
    }

    .board_write .title dt,
    .board_write .info dt {
        display: none;
    }

    .board_write .title dd,
    .board_write .info dd {
        width: 100%;
    }

    .board_write .title input[type="text"],
    .board_write .info input[type="text"],
    .board_write .info input[type="password"] {
        width: 100%;
    }
}
</style>
</head>
<body>
<%@ include file= "/WEB-INF/views/common/header.jsp" %>
    <div class="board_wrap">
        <div class="board_title">
            <strong>챌린지 리뷰 작성</strong>
        </div>
        <div class="board_write_wrap">
            <div class="board_write">
                <div class="title">
                    <dl>
                        <dt>제목</dt>
                        <dd><input type="text" placeholder="제목 입력"></dd>
                    </dl>
                </div>
                <div class="info">
                    <dl>
                        <dt>카테고리</dt>
                        <dd><input type="challenge" placeholder="챌린지 입력"></dd>
                        <dd><select name="chal_category">
                            <option value="etc" label="챌린지 카테고리" selected></option>
                            <option value="jipbab" label="일주일 집밥 챌린지"></option>
                            <option value="noflour" label="한달 밀가루 끊기 챌린지"></option>
                            <option value="water" label="하루 2L 물 마시기 챌린지"></option>
                            <option value="breakfast" label="아침 먹기 챌린지"></option>
                            <option value="chickenbreast" label="닭가슴살 챌린지"></option>
                        </select></dd>
                    </dl>
                    <dl>
                        <dt>비밀번호</dt>
                        <dd><input type="checkbox"> 비공개 설정</dd>
                        <dd><input type="password" placeholder="비밀번호 입력"></dd>
                    </dl>
                    <dl>
                        <dd><input type="file" name="reviewfile" id="reviewfile"></dd>
                    </dl>
                </div>
                <div class="cont">
                    <textarea placeholder="내용 입력"></textarea>
                </div>
            </div>
            <div class="bt_wrap">
                <a href="view.html" class="on">등록</a>
                <a href="list.html">취소</a>
            </div>
        </div>
    </div>
    <%@ include file= "/WEB-INF/views/common/footer.jsp" %>
</body>

</html>