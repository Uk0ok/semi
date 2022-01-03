<%@page import="java.util.List"%>
<%@page import="com.reci.sup.vo.NotiVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	
<%
	List<NotiVo> dataList = (List<NotiVo>)request.getAttribute("data"); 
	//attribute는 오브젝트인데, 현재 타입이 NotiVo이기 때문에 (NotiVo)로 캐스팅
%>
	
<!DOCTYPE html>
<html>
<head>
<style>
    body {
        box-sizing: border-box;
        margin: auto;
        background-color: cornsilk;
    }
    
    #wrap {
    	width: 1200px;
    	margin: 2rem auto;
    	background-color: white;
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
			<a href="support" class="list-group-item active list-group-item-action">공지사항</a>
			<a href="qna" class="list-group-item list-group-item-action">고객문의</a>
			<a href="report" class="list-group-item list-group-item-action">신고</a>
		</div>
    
        <div id="content1" class="col-10">
        	<table class="table">
		        <thead>
		        	<tr>
		        		<th>번호</th>
		          		<th>제목</th>
		          		<th>등록일</th>
		          		<th>조회수</th>
		         	</tr>
        		</thead>
	           	<tbody>
	            	<c:forEach items="${data}" var="n">
	            		<tr>
	                    <td>${n.noticeNo}</td>
	                    <td><a href="nView.bo?num=${n.noticeNo}&pageNum=${spage}}">${n.noticeTitle}</a></td>
	                    <td>${n.createDate}</td>
	                    <td>${n.hits}</td>
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
			    <button id="writeBtn" class="col-1"><a href="support/write">글쓰기</a></button>
			</div>
                
             <div id="pageForm">
             	<c:if test="${startPage != 1}">
             		<a href='nView.bo?page=${startPage-1}'><</a>
             	</c:if>
             	
             	<c:forEach var="pageNum" begin="${startPage}" end="${endPage}">
             		<c:if test="pageNum == spage">
             			${pageNum}&nbsp;
             		</c:if>
             		<c:if test="pageNum != spage">
             			<a href="nView.bo?page=${pageNum}">${pageNum}&nbsp;</a>
             		</c:if>
             	</c:forEach>
             		
           		<c:if test="pageNum != maxPage">
           			<a href="nView.bo?page=${endPage+1}">></a>
           		</c:if>
       		</div>    
   		 </div>
	 </div>

	<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>