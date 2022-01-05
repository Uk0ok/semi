<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>매거진 글관리 페이지</title>

<style>
	#header {
    	padding: 1rem 2rem;
    }
</style>

</head>
<body>

	<div id="header">
		<h3>매거진 관리</h3>
	</div>
	
	<%@ include file="/WEB-INF/views/common/admin_header.jsp"%>
	
	<div id="content_wrap">
    	<div id="content1">
    	<form action="MboardRemove" name="MboardRemove" method="post">
	   		<table class="table table-sm table-hover">
	           	<thead class="thead-light">
					<tr>
						<th><input type="checkbox"></th>
						<th>글 번호</th>
						<th>제목</th>
						<th>내용</th>
						<th>작성일</th>
						<th>조회 수</th>
						<th>추천 수</th>
						<th>스크랩 수</th>
						<th>댓글 수</th>
						<th>수정 여부</th>
						<th>마지막 수정 일자</th>
						<th>삭제 여부</th>
						<th>작성한 관리자 번호</th>
					</tr>
				</thead>
	           	<tbody>
	           		<c:forEach items="${magListAll}" var="m">
	             	<tr>  
	             		<th><input name="postNo" value="${m.postNo}" type="checkbox" required></th>
		                <td>${m.postNo }</td>		                    
		                <td>${m.postName }<b><!--  a href="magview.jsp?postNo=<%--=m.getPostNo() %>"><%=m.getPostName() --%></a></b>--></td>		                    
		                <td>${m.postContent }</td>		                    
		                <td>${m.begDate }</td>		                    
		                <td>${m.hits }</td>		                    
		                <td>${m.recomNum }</td>		                    
		                <td>${m.scrapNum }</td>		                    
		                <td>${m.commNum }</td>		                    
		                <td>${m.modYn }</td>		                    
		                <td>${m.fmodDate }</td>		                    
		                <td>${m.delYn }</td>		                    
		                <td>${m.adminNo }</td>		                    		                    	                    		                    
	               </tr>
	               </c:forEach>
	           	</tbody>
			</table>
			<button type="button" onclick="removeCheck()">게시글 삭제</button>
			</form>
			
			
			<a href="mwrite"><button>게시글 작성</button></a>
			
			
			<ul class="pagination justify-content-center">
				<li class="page-item"><a class="page-link" href="#"><</a></li>
				<li class="page-item"><a class="page-link" href="#">1</a></li>
				<li class="page-item"><a class="page-link" href="#">2</a></li>
				<li class="page-item"><a class="page-link" href="#">3</a></li>
				<li class="page-item"><a class="page-link" href="#">></a></li>
			</ul>
		</div>
   	</div>
   	
   	<script>
		function removeCheck(){
			if(confirm("*경고* 선택한 게시글을 삭제하시겠습니까?") == true){
				document.MboardRemove.submit();
			}else {
				return false;
			}
		}
    </script>
   	
</body>
</html>