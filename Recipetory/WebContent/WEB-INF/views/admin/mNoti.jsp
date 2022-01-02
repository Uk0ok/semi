<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mNoti</title>

<style>
	#header {
    	padding: 1rem 2rem;
    }
</style>

</head>
<body>
	
	<div id="header">
		<h3>공지사항 관리</h3>
	</div>
	
	<%@ include file="/WEB-INF/views/common/admin_header.jsp"%>
    
    <div id="content_wrap">
    	<div id="content1">
	   		<table class="table table-hover table-sm">
	           	<thead>
					<tr>
						<th><input type="checkbox"></th>
						<th>번호</th>
						<th>제목</th>
						<th>내용</th>
						<th>작성자</th>
						<th>조회수</th>
						<th>생성일자</th>
						<th>수정여부</th>
						<th>수정일자</th>
						<th>삭제여부</th>
					</tr>
				</thead>
	           	<tbody>
	              		<c:forEach items="${notiList}" var="n">
	             		<tr>
	             			<th><input type="checkbox"></th>
		                    <td>${n.noticeNo}</td>
		                    <td><a href="#">${n.noticeTitle}</a></td>
		                    <td>${n.noticeContent}</td>
		                    <td>${n.adminNo}</td>
		                    <td>${n.createDate}</td>
		                    <td>${n.hits}</td>
		                    <td>${n.modYn}</td>
		                    <td>${n.modDate}</td>
		                    <td>${n.deleteYn}</td>
	                    </tr>
	            		</c:forEach> 
	           	</tbody>
			</table>
			
			<ul class="pagination justify-content-center">
				<li class="page-item"><a class="page-link" href="#"><</a></li>
				<li class="page-item"><a class="page-link" href="#">1</a></li>
				<li class="page-item"><a class="page-link" href="#">2</a></li>
				<li class="page-item"><a class="page-link" href="#">3</a></li>
				<li class="page-item"><a class="page-link" href="#">></a></li>
			</ul>
		</div>
   	</div>
   	
</body>
</html>