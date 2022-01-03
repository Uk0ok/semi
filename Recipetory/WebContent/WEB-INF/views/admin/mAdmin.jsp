<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mAdmin</title>

<style>
	#header {
    	padding: 1rem 2rem;
    }
</style>

</head>
<body>

	<div id="header">
		<h3>관리자 관리</h3>
	</div>
	
	<%@ include file="/WEB-INF/views/common/admin_header.jsp"%>
	
	<div id="content_wrap">
    	<div id="content1">
	   		<table class="table table-sm table-hover">
	           	<thead class="thead-light">
					<tr>
						<th><input type="checkbox"></th>
						<th>번호</th>
						<th>아이디</th>
						<th>비밀번호</th>
						<th>닉네임</th>
						<th>등급</th>
						<th>생성일자</th>
						<th>삭제일자</th>
					</tr>
				</thead>
	           	<tbody>
	              		<c:forEach items="${adminList}" var="ad">
	             		<tr>
	             			<th><input type="checkbox"></th>
		                    <td>${ad.adminNo}</td>
		                    <td>${ad.adminId}</td>
		                    <td>${ad.adminPwd}</td>
		                    <td>${ad.adminName}</td>
		                    <td>${ad.adminLv}</td>
		                    <td>${ad.joinDate}</td>
		                    <td>${ad.deleteDate}</td>
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