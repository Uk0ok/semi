<%@page import="java.sql.Timestamp"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.reci.mag.Vo.MagDto"%>
<%@page import="java.util.List"%>
<%@page import="com.reci.mag.dao.MagDao"%>
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
<% 
	MagDao magDao = MagDao.getInstance();
	List<MagDto> list = magDao.selectList();
%>

	<div id="header">
		<h3>매거진 관리</h3>
	</div>
	
	<%@ include file="/WEB-INF/views/common/admin_header.jsp"%>

	<h3>매거진글 관리 페이지</h3>
	
	<div id="content_wrap">
    	<div id="content1">
	   		<table class="table table-sm table-hover">
	           	<thead class="thead-light">
					<tr>
						<th><input type="checkbox"></th>
						<th>글 번호</th>
						<th>제목</th>
						<th>내용</th>
						<th>작성일</th>
						<th>작성한 관리자</th>
						<th>조회 수</th>
						<th>추천 수</th>
						<th>스크랩 수</th>
						<th>댓글 수</th>
						<th>수정 여부</th>
						<th>마지막 수정일자</th>
						<th>삭제 여부</th>
					</tr>
				</thead>
	           	<tbody>
<% 
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd, hh:mm:ss");
	int count = 0;
	for (MagDto m : list) {
		String stDate = "";
		Timestamp tDate = m.getBEG_DATE();
		if (tDate != null) {
			stDate = sdf.format(tDate);
		}
%>
	             		<tr>
	             			<th><input type="checkbox"></th>
		                    <td><%=m.getPOST_NO() %></td>		                    
		                    <td><%=m.getPOST_NAME() %></td>
		                    <td><%=m.getPOST_CONTENT() %></td>
		                    <td><%=stDate%></td>
		                    <td><%=m.getADMIN_NO() %></td>
		                    <td><%=m.getHITS() %></td>
		                    <td><%=m.getRECOM_NUM() %></td>
		                    <td><%=m.getSCRAP_NUM() %></td>
		                    <td><%=m.getCOMM_NUM() %></td>
		                    <td><%=m.getMOD_YN() %></td>
		                    <td><%=m.getFMOD_DATE() %></td>
		                    <td><%=m.getDEL_YN() %></td>
	                    </tr>
	                    <%
	                    	count++;
						}
						if (count == 0) {
	                    %>
	                    <tr><td colspan="7">작성한 게시글이 없습니다.</td></tr>
	                    <%
							}
						System.out.println("현재 게시글 " + count + "개");
						%>
	           	</tbody>
			</table>
			
			
			<a href="mwrite.do"><button>게시글 작성</button></a>
			
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