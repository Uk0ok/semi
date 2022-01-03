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
    
    #mod {
    	width: 1200px;
    	margin: 2rem auto 0 2rem;
    	padding: 1rem;
    }
   
    #mod > .btn-light {
    	margin: 0 0.5rem;
    }
    
    .btn-light {
		border-color:#000;
	}
    
    #insert {
    	margin: 1rem 1rem 0;
    }
    
</style>

</head>
<body>

	<div id="header">
		<h3>관리자 관리</h3>
	</div>
	
	<%@ include file="/WEB-INF/views/common/admin_header.jsp"%>
	
	<div id="mod">
		<button class="btn btn-light">삭제</button>
		<button data-toggle="collapse" data-target="#insert" class="btn btn-light">생성</button>
		<div id="insert" class="collapse">
			<form class="form-inline" action="mAdmin" method = "post">
				<label for="adminId" class="mr-sm-2">아이디 :</label>
					<input type="text" class="form-control mb-2 mr-sm-2" placeholder="Enter id" id="adminId" name="adminId" required>
				<label for="adminPwd" class="mr-sm-2">비밀번호 :</label>
					<input type="password" class="form-control mb-2 mr-sm-2" placeholder="Enter pwd" id="adminPwd" name="adminPwd" required>
				<label for="adminName" class="mr-sm-2">사원명 :</label>
					<input type="text" class="form-control mb-2 mr-sm-2" placeholder="Enter name" name="adminName" required>
				<label for="adminLv" class="mr-sm-2">등급 :</label>
					<select class="form-control mb-2 mr-sm-3" id="adminLv" value="Lv3" name="adminLv" required>
					    <option value = "Lv1">Lv1</option>
					    <option value = "Lv2">Lv2</option>
					    <option value = "Lv3" selected>Lv3</option>
					</select>
				<button type="submit" class="btn btn-light mb-2">생성</button>
			</form>
		</div>
	</div>
   	

   	<div id="content_wrap" class="table-responsive">
   		<table class="table table-sm table-hover">
           	<thead class="thead-light">
				<tr>
					<th><input type="checkbox"></th>
					<th>번호</th>
					<th>아이디</th>
					<th>비밀번호</th>
					<th>사원명</th>
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

   	
</body>
</html>