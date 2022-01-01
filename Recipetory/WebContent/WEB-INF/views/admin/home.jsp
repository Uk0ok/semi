<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- <%
	List<MemberVo> dataList = (List<MemberVo>)request.getAttribute("data"); 
%> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin_home</title>
<style>

    #wrap {
    	width: 1200px;
    	margin: 2rem auto;
    	background-color: white;
    	text-align: center;
    	padding: 1rem;
    }
    
    #content1 {
    	width: 1000px;
    }
    
    table {
    	height: 300px;
    }
   /*  #content2 {
    	padding: 1rem 2rem 2rem 1rem;
    	text-align:left;
    } */

</style>
</head>
<body>

	<%@ include file="/WEB-INF/views/common/admin_header.jsp"%>
    
    <div id="wrap">
    	<div id="content1">
	   		<table class="table table-hover table-sm">
	           	<thead>
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
	              		<c:forEach items="${data}" var="m">
	             		<tr>
	             			<th><input type="checkbox"></th>
		                    <td>${m.userNo}</td>
		                    <td><a href="#">${m.userId}</a><td>
		                    <td>${m.userPwd}</td>
		                    <td>${m.userNickname}</td>
		                    <td>${m.userEmail}</td>
		                    <td>${m.userPhone}</td>
		                    <td>${m.userJoinDate}</td>
		                    <td>${m.userType}</td>
		                    <td>${m.userDeleteYn}</td>
		                    <td>${m.lastloginDate}</td>
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