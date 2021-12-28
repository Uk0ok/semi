<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet"  href="${pageContext.request.contextPath}/css/sup_write.css">

<style>
	.board_wrap {
		width:1200px;
	}
</style>
</head>
<body>

	<%@ include file="/WEB-INF/views/common/header.jsp"%>

	<div class="board_wrap">
        <div class="board_title">
            <strong>신고</strong>
            <p>신고내용을 자세히 입력해주세요.</p>
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
                        <dt>글쓴이</dt>
                        <dd><input type="text" placeholder="글쓴이 입력"></dd>
                    </dl>
                    <dl>
                        <dt>비밀번호</dt>
                        <dd><input type="password" placeholder="비밀번호 입력"></dd>
                    </dl>
                </div>
                <div class="cont">
                    <textarea placeholder="내용 입력"></textarea>
                </div>
            </div>
            <div class="bt_wrap">
                <a href="../report" class="on">등록</a>
                <a href="../report">취소</a>
            </div>
        </div>
    </div>

	<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>