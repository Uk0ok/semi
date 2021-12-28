<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<style>
    body {
        box-sizing: border-box;
        margin: auto;
        background-color: cornsilk;
    }
    
    #wrap {
    	width: 1200px;
    	margin: 1rem auto;
    	background-color: white;
    	text-align: center;
    	padding: 1rem;
    }
    
</style>
</head>
<body>

	<%@ include file="/WEB-INF/views/common/header.jsp"%>
	

    <div id=wrap class="row">
            <div class="col-lg-2 container list-group">
			  <a href="support" class="list-group-item list-group-item-action">공지사항</a>
			  <a href="qna" class="list-group-item list-group-item-action">고객문의</a>
			  <a href="report" class="list-group-item active list-group-item-action">신고</a>
			</div>
    
            <div class="col-lg-10">
                <table class="table">
	                <thead>
	                    <tr>
		                    <th>번호</th>
		                    <th>제목</th>
		                    <th>작성자</th>
		                    <th>등록일</th>
		                    <th>조회수</th>
	                    </tr>
	                </thead>
	                <tbody>
	                	 <tr>
	                        <td>05</td>
	                        <td><a href="#">적절하지 못한 게시글</a></td>
	                       	<td>도날드덕</td>
	                        <td>2021.12.19</td>
	                        <td>1</td>
	                    </tr>
	                	 <tr>
	                        <td>04</td>
	                        <td><a href="#">댓글 신고</a></td>
	                       	<td>울버린</td>
	                        <td>2021.12.15</td>
	                        <td>1</td>
	                    </tr>
	                    <tr>
	                        <td>03</td>
	                        <td>
	                        	<a href="#">댓글 비속어</a>
	                        	<span class="badge badge-primary">답변완료</span>
	                        </td>
	                       	<td>식빵맨</td>
	                        <td>2021.12.11</td>
	                        <td>3</td>
	                    </tr>
	                    <tr>
	                         <td>02</td>
	                         <td>
	                         	<a href="#">회원 신고</a>
	                         	<span class="badge badge-primary">답변완료</span>
	                         </td>
                         	 <td>호빵맨</td>
	                         <td>2021.12.10</td>
	                         <td>4</td>
	                    </tr>
	                    <tr>
	                        <td>01</td>
	                        <td>
	                        	<a href="#">게시글 신고</a>
	                        	<span class="badge badge-primary">답변완료</span>
	                        </td>
	                       	<td>카레빵맨</td>
	                        <td>2021.12.01</td>
	                        <td>5</td>
	                    </tr>
	               	</tbody>
                </table>
                
                <div class="row">
                	<form class="col-sm-10" action="search" method="get">
				        <select name="searchType">
				            <option value="date">제목</option>
				            <option value="Name">작성자</option>
				            <option value="ID">아이디</option>
				        </select>
				        <input type="text" name="searchValue">
				        <button type="submit">
				        	<i class="fas fa-search"></i>
			        	</button>
				    </form>
				   	<button id="writeBtn" class="col-sm-1"><a href="write">글쓰기</a></button>
                	
                </div>
                <br>
                <ul class="pagination justify-content-center">
					  <li class="page-item"><a class="page-link" href="#"><</a></li>
					  <li class="page-item"><a class="page-link" href="#">1</a></li>
					  <li class="page-item"><a class="page-link" href="#">2</a></li>
					  <li class="page-item"><a class="page-link" href="#">3</a></li>
					  <li class="page-item"><a class="page-link" href="#">></a></li>
				</ul>
          	</div>    
    </div>

	<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>