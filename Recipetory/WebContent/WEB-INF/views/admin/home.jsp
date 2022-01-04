<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file = "/WEB-INF/views/common/w3s.jsp" %>

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
	 	box-sizing: border-box;
	}
	
	#header {
		padding:2rem 3rem;
	}
	
	#header > a {
		width: 90px;
	}
	
	#nav {
	    height:300px;
	    width:1000px;
	    margin: auto;
	    padding: 3rem 0;
	}
	
	#nav > a {
		margin:20px;
		padding : 2rem 1rem;
	    width: 120px;
	    height: 100px;
	    float: left;
	}
	
	.btn-light {
		border-color:#000;
	}
	

</style>
</head>
<body>
	<div id="wrap">
		<div id="header" class="jumbotron">
			<h3>관리자 페이지</h3>
			<br>
			${loginUser.adminId}   
	       	<a class="btn btn-light" href="logout">로그아웃</a>
	    </div>
	    
		<div id="nav">
			<a href="mUser" class="btn btn-light" role="button">회원관리</a>
			<a href="mAdmin" class="btn  btn-light" role="button">관리자관리</a>
			<a href="mNoti" class="btn  btn-light" role="button">공지관리</a>
			<a href="mNoti" class="btn  btn-light" role="button">문의관리</a>
			<a href="mMag" class="btn  btn-light" role="button">매거진관리</a>
			<a href="mReport" class="btn  btn-light" role="button">신고관리</a>
		</div>
	</div>
	
</body>
</html>