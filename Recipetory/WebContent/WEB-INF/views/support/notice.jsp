<%@page import="java.util.List"%>
<%@page import="com.reci.sup.vo.NotiVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
                    <tr>
	                    <td>번호</td>
	                    <td>제목</td>
	                    <td>작성자</td>
	                    <td>등록일</td>
	                    <td>조회수</td>
                    </tr>
	             	
	             	<%
	             	for(NotiVo n : dataList){
	             		String noticeNo = n.getNoticeNo();
	             		String title = n.getNoticeTitle();
	             	 	String adminNo = n.getAdminNo();
	             		String createDate = n.getCreateDate();
	             		String hits = n.getHits();
	             	%>	
	             		<tr>
		                    <td><%=noticeNo%></td>
		                    <td><%=title%></td>
		                    <td><%=adminNo%></td>
		                    <td><%=createDate%></td>
		                    <td><%=hits%></td>
	                    </tr>
					<%
					}
	             	%>
	             	
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

	<%@ include file="/WEB-INF/views/common/footer.jsp"%>
</body>
</html>