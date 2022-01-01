<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<style>

body{
    background-color: cornsilk;
}

#wrap {
    width: 1200px;
    height: 900px;
    margin-top: 50px 0px;
    padding: 50px
}


</style>
</head>
<body>

	<div id="wrap">
		<header>
			<h1>관리자 페이지</h1>
			${loginUser.adminId}<a href="logout">로그아웃</a>
			<hr>
		</header>
		
		<div id=content class="row">
            
            <div class="col-2 container list-group">
			  <a href="support" class="list-group-item active list-group-item-action">관리자 관리</a>
			  <a href="qna" class="list-group-item list-group-item-action">글 관리</a>
			  <a href="report" class="list-group-item list-group-item-action">신고 관리</a>
			</div>
    
            <div id="content1" class="col-10">
                <table class="table">
                    <thead>
	                    <tr>
		                    <th>번호</th>
		                    <th>아이디</th>
		                    <th>비밀번호</th>
		                    <th>이름</th>
		                    <th>등급</th>
		                    <th>생성일자</th>
		                    <th>삭제일자</th>
	                    </tr>
                    </thead>
	             	
	             	<tbody>
		             <%-- 	<c:forEach items="${data}" var="n">
		             		<tr>
			                    <td>${n.noticeNo}</td>
			                    <td><a href="detail">${n.noticeTitle}</a><td>
			                    <td>${n.adminNo}</td>
			                    <td>${n.createDate}</td>
			                    <td>${n.hits}</td>
		                    </tr>
		             	</c:forEach> --%>
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
				    <button id="writeBtn" class="col-1"><a href="support/write">글쓰기</a></button>
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
	</div>
	
	
	
	
		
</body>
</html>