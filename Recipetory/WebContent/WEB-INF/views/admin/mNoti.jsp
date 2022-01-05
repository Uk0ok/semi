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
    	<div id="content2">
    		<button type="button" class="btn btn-light" data-toggle="modal" data-target="#myModal">생성</button>
    		
    		<!-- Modal -->
    		<div class="modal" id="myModal">
    			<div class="modal-dialog">
    				<div class="modal-content">
    					
    					<!-- header -->
    					<div class="modal-header">
    						<h4 class="modal-title">공지사항 글 생성</h4>
    						<button type="button" class="close" data-dismiss="modal">&times;</button>
    					</div>
    					
    					<form action="mNotiInsert" method="post" enctype="multipart/form-data">
	    					<div class="modal-body">
	    						<div class="form-group">
	    							<label for="noticeTitle">제목 :</label>
	    							<input type="text" name="noticeTitle" placeholder="enter title.." required>
	    						</div>
	    						<div class="form-group">
	    							<span> 작성자 : ${loginUser.adminId}</span>
	    							<input type="hidden" name="adminNo" value="${loginUser.adminNo}">
	    						<div class="form-group">
	    							<label for="file">첨부파일 :</label>
	    							<input type="file" name="file">
	    						</div>
	    						<div class="form-group">
	    							<label for="noticeContent">내용 :</label>
	    							 <textarea class="form-control" rows="10" name="noticeContent"  placeholder="enter content.." required></textarea>
	    						</div>
	    					</div>
	    					<div class="modal-footer">
								<button type="submit" class="btn btn-primary">submit</button>    					
	    					</div>
    					</form>
    				</div>
    			</div>
    		</div>
    		
    	</div>
    
    	<div id="content1">
	   		<table class="table table-sm table-hover">
	           	<thead class="thead-light">
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
	              		<c:forEach items="${notiListAll}" var="n">
	             		<tr>
	             			<th><input type="checkbox"></th>
		                    <td>${n.noticeNo}</td>
		                    <td>${n.noticeTitle}</td>
		                    <td>${n.noticeContent}</td>
		                    <td>${n.adminNo}</td>
		                    <td>${n.hits}</td>
		                    <td>${n.createDate}</td>
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