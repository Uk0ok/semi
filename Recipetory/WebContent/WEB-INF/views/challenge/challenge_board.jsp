<%@page import="java.util.List"%>
<%@page import="com.reci.chal.vo.CboardVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	List<CboardVo> dataList = (List<CboardVo>)request.getAttribute("data"); 
	//attribute는 오브젝트인데, 현재 타입이 CboardVo이기 때문에 (CboardVo)로 캐스팅
%>    
<!DOCTYPE html>
<html>
<head>
<style>
    body {
        box-sizing: border-box;
        margin: auto;
    }
    
    #wrap {
    	width: 1200px;
    	margin : auto;
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
    /*글쓰기 버튼*/
	.bt_wrap a {
        display: inline-block;
        min-width: 80px;
        margin-left: 90%;
        padding: 10px;
        border: 1px solid #000;
        border-radius: 2px;
        font-size: 1.4rem;
    }

	.bt_wrap a.bt_write {
        background: #d2c897;
        color: black;
    }
   
</style>


</head>
<body>
	<%@ include file="/WEB-INF/views/common/header.jsp"%>
	
	<div id=wrap class="row">

	    
	        <div id="content1" class="col-10">
	        	<table class="table">
			        <thead>
			        	<tr>
			        		<th>번호</th>
			          		<th>제목</th>
			          		<th>참여자</th>
			          		<th>종료일</th>
			         	</tr>
	        		</thead>
		           	<tbody>
		            	<c:forEach items="${data}" var="c">
		            		<tr>
		                    <td>${c.cpostNo}</td>
		                    <td>
		                    	<a href="${pageContext.request.contextPath}/challenge/cView?ch=${c.cpostNo}&pageNo=${currentPage}">
		                    		${c.cpostName}
		                    	</a>
	                    	</td>
		                    <td>${c.partiNum}</td>
		                    <td>${c.challengePeriod}</td>
		                   </tr>
		            	</c:forEach>
		           	</tbody>
	           	</table>
	           		
	           		<div class="bt_wrap">
		            	<a href="./challengewrite" class="bt_write">글쓰기</a>	
            		</div>
	                
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
				</div>
	                
	             <ul id="pageForm" class="pagination justify-content-center">
	           		<c:if test="${currentPage != 1}">
	           			<li class="page-item"><a class="page-link" href='support?page=${currnetPage-1}'><</a></li>
	           		</c:if>
	           		
	             	<c:forEach var="pageNo" begin="${startPage}" end="${endPage}">
	             		<c:if test="${pageNo == currentPage}">
	             			<li class="page-item"><a class="page-link" href="support?page=${currentPage}">${pageNo}&nbsp;</a></li>
	             		</c:if>
	             		<c:if test="${pageNo != currentPage}">
	             			<li class="page-item"><a class="page-link" href="support?page=${currentPage+1}">${pageNo}</a></li>
	             		</c:if>
	             		
	             	</c:forEach>
	           		<c:if test="currentPage != maxPage">
	           			<li class="page-item"><a class="page-link" href="support?page=${currnetPage+1}">></a></li>
	           		</c:if>
	       		</ul>    
	   		 </div>
		 </div>

	<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>