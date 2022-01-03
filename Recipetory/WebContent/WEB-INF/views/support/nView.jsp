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
            <h1>공지사항</h1>
            <p>공지사항을 빠르고 정확하게 안내해드립니다.</p>
        </div>
        <div class="board_view_wrap">
            <div class="board_view">
                <div class="title">
                    12/22 서비스 점검안내
                </div>
                <div class="info">
                    <dl>
                        <dt>번호</dt>
                        <dd>1</dd>
                    </dl>
                    <dl>
                        <dt>글쓴이</dt>
                        <dd>admin1</dd>
                    </dl>
                    <dl>
                        <dt>작성일</dt>
                        <dd>2021.12.22</dd>
                    </dl>
                    <dl>
                        <dt>조회</dt>
                        <dd>10</dd>
                    </dl>
                </div>
                <div class="cont">
                    <p>안녕하세요. 레시피토리 운영팀입니다.</p>

					<p>서비스 점검으로 인하여 점검 시간 동안 정상적인 서비스 이용이 불가한 점 안내드립니다.</p>
					
					<pre> * 서비스 점검시간 : 10AM - 12PM </pre>

					<p>쾌적한 서비스 제공을 위해 진행되는 점검인만큼, 회원 여러분들의 너그러운 이해와 양해를 부탁드립니다.</p>

					<p>감사합니다.</p>
                </div>
            </div>
            
            <div class="media border p-3">
				  <img src="img/recipeBoard/profile.png" alt="John Doe" class="mr-3 mt-3 rounded-circle" style="width:40px;">
				  <div class="media-body">
				    <h5>admin2 <small><i>Posted on December 25, 2021</i></small></h5>
				    <p>merry merry</p>
				  </div>
				</div>
          	</div>    
            
            <div class="bt_wrap">
                <a href="support" class="on">목록</a>
                <a href="edit">수정</a>
            </div>
        </div>
    </div>

	<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>