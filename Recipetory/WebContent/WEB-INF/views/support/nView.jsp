<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 
 <link rel="stylesheet"  href="${pageContext.request.contextPath}/css/sup_write.css">
 
</head>
<body>

	<%@ include file="/WEB-INF/views/common/header.jsp"%>
	
     <div class="board_wrap">
        <div class="board_title">
            <h3>[공지사항]</h3>
        </div>
        <div class="board_view_wrap">
            <div class="board_view">
                <div class="title">
                    ${notiView.noticeTitle}
                </div>
                <div class="info">
                    <dl>
                        <dt>번호</dt>
                        <dd>${notiView.noticeNo}</dd>
                    </dl>
                    <dl>
                        <dt>글쓴이</dt>
                        <dd>${notiView.adminNo}</dd>
                    </dl>
                    <dl>
                        <dt>작성일</dt>
                        <dd>${notiView.createDate}</dd>
                    </dl>
                    <dl>
                        <dt>조회</dt>
                        <dd>${notiView.hits}</dd>
                    </dl>
                </div>
                <div class="cont">
                    <p>${notiView.noticeContent}</p>
                </div>
            </div>
            
            <div class="media border p-3">
				
          	</div>    
            
            <div class="bt_wrap">
                <a href="../support?pageNo=${pageNo}" class="on">목록</a>
                <a href="edit">수정</a>
            </div>
        </div>
    </div>

	<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>