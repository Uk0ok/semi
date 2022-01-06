<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file = "/WEB-INF/views/common/w3s.jsp" %>
<%@page import="com.reci.admin.AdminVo"%>

<%
	AdminVo loginUser = (AdminVo)request.getAttribute("loginUser");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	body {
        box-sizing: border-box;
        min-width: 1240px;
        margin: auto;
    }
  
	.navbar {
		padding: 0 30px;
		background-color: rgb(175, 187, 175); 
	}
	
	.navbar-brand {
		font-size:small;
	}
	
	.navbar-light .navbar-nav .nav-link {
    	color: #000;
	}
	
	.navbar-light .navbar-text {
    	color: #000;
    	padding: 0.5rem 1rem;
	}
	
	#nav_wrap {
    	padding: 0;
    	background-color: rgb(175, 187, 175);
    	width:100%;
    }

    #content_wrap {
    	width: 1200px;
    	margin: 2rem auto;
    	background-color: white;
    	text-align: center;
    	padding: 0 1rem;
    }
    
    #content1 {
    	width: 1200px;
    	height: 600px;
    	margin-top:1rem;
    }
    
    .table {
    	margin-bottom: 3rem;
    }
    
</style>
	
</head>
<body>

	<div id="nav_wrap">
		<nav class="navbar navbar-expand-sm navbar-light">
	       	<span class="navbar-text">
	           	${loginUser.adminId}   
			</span>
           	<a class="navbar-brand btn btn-light" href="logout" role="button">로그아웃</a>
		
			<ul class="navbar-nav">
				<li class="nav-item">
					<a class="nav-link" href="./mUser">회원관리</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="./mAdmin">관리자관리</a>
				</li>
				<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">게시글관리</a>
					<div  class="dropdown-menu">
						<a class="dropdown-item" href="./mNoti">공지사항</a>
						<a class="dropdown-item" href="./mQna">고객문의</a>
						<a class="dropdown-item" href="./mMag">매거진</a>
						<a class="dropdown-item" href="./mReport">신고접수</a>
					</div>
				</li>
			</ul>
		</nav>
	</div>
    
	
</body>
</html>