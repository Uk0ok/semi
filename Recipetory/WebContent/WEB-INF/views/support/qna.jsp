<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">

<style>
    body {
        box-sizing: border-box;
        margin: auto;
    }
    
    #wrap {
    	width: 1200px;
    	margin: 2rem auto;
    	text-align: center;
    	padding: 1rem;
    }
    
    #content2 {
    	padding: 1rem 2rem 2rem 1rem;
    	text-align:left;
    }
    
     #writeBtn {
    	padding : 0;
    }
    
    
</style>
</head>
<body>

	<%@ include file="/WEB-INF/views/common/header.jsp"%>
	

    <div id=wrap class="row">
		  	<div class="col-2 container list-group">
			  <a href="support" class="list-group-item list-group-item-action">공지사항</a>
			  <a href="qna" class="list-group-item active list-group-item-action">고객문의</a>
			  <a href="report" class="list-group-item list-group-item-action">신고</a>
			</div>
    
            <div class="col-10">
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
		             	<c:forEach items="${qnaList}" var="q">
		             		<tr>
			                    <td>${q.qnaNo}</td>
			                    <td><a href="view">${q.qnaTitle}</a></td>
			                    <td>${q.adminNo}</td>
			                    <td>${q.createDate}</td>
			                    <td>${q.hits}</td>
		                    </tr>
		             	</c:forEach>
	             	</tbody>
                 </table>
	         
                 <div id="content2" class="row">
                	<form class="col-11" action="search" method="get">
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
				   	<button id="writeBtn" class="col-1"><a href="write">글쓰기</a></button>
                </div>
                
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